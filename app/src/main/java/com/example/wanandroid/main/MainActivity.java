package com.example.wanandroid.main;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.wanandroid.R;
import com.example.wanandroid.adapter.BottomBarAdapter;
import com.example.wanandroid.arouter.ARouterManager;
import com.example.wanandroid.databinding.ActivityMainBinding;
import com.example.wanandroid.fragment.AnswerFragment;
import com.example.wanandroid.fragment.HomeFragment;
import com.example.wanandroid.fragment.ProjectFragment;
import com.example.wanandroid.fragment.PublicFragment;
import com.example.wanandroid.fragment.SystemFragment;
import com.example.wanandroid.popupwindow.PhotoPopupWindow;
import com.example.wanandroid.view.SelfDialog;
import com.google.android.material.navigation.NavigationView;
import com.hjq.bar.OnTitleBarListener;
import com.hjq.toast.ToastUtils;
import com.permissionx.guolindev.PermissionX;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private List<Fragment> fragmentList = new ArrayList<>();
    private BottomBarAdapter adapter;
    //databinding
    private ActivityMainBinding binding;
    //点击头像处理事件
    //拍照
    public static final int TAKE_PHOTO = 1;//声明一个请求码，用于识别返回的结果
    private Uri imageUri;
    private ImageView picture;
    private final String filePath = Environment.getExternalStorageDirectory() + File.separator + "output_image.jpg";
    private File outputImage = new File(filePath);
    //相册
    public static final int CHOOSE_PHOTO = 2;
    String imagePath = null;
    //退出app的自定义Dialog
    private SelfDialog selfDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //初始化控件
        initView();
        //绑定RadioButton
        initViewPager();
        //顶部TitleBar点击事件——github
        onClickTitleBar();
        //初始化Toast——github
        ToastUtils.init(getApplication());
        //侧滑栏事件处理
        onNavigationView();
    }

    private void initView() {
        binding.rg.setOnCheckedChangeListener(this);
        binding.rg.getChildAt(0).performClick();
        //个人中心图片点击更换个人头像
        picture = binding.mainNavigationView.getHeaderView(0).findViewById(R.id.iv_user);

        //设置上次打开app时保存的图片
        setKeepImage();
    }

    private void initViewPager() {
        //添加碎片
        fragmentList.add(new HomeFragment());
        fragmentList.add(new AnswerFragment());
        fragmentList.add(new PublicFragment());
        fragmentList.add(new SystemFragment());
        fragmentList.add(new ProjectFragment());

        adapter = new BottomBarAdapter(getSupportFragmentManager(), fragmentList);
        binding.viewPager.setAdapter(adapter);
        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                switch (i) {
                    case 0:
                        binding.rg.check(R.id.radioBtn_home);
                        binding.titleBar.setTitle("首页");
                        break;
                    case 1:
                        binding.rg.check(R.id.radioBtn_answer);
                        binding.titleBar.setTitle("问答");
                        break;
                    case 2:
                        binding.rg.check(R.id.radioBtn_public);
                        binding.titleBar.setTitle("公众号");
                        break;
                    case 3:
                        binding.rg.check(R.id.radioBtn_system);
                        binding.titleBar.setTitle("体系");
                        break;
                    case 4:
                        binding.rg.check(R.id.radioBtn_project);
                        binding.titleBar.setTitle("项目");
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        switch (checkedId) {
            case R.id.radioBtn_home:
                binding.viewPager.setCurrentItem(0);
                break;
            case R.id.radioBtn_answer:
                binding.viewPager.setCurrentItem(1);
                break;
            case R.id.radioBtn_public:
                binding.viewPager.setCurrentItem(2);
                break;
            case R.id.radioBtn_system:
                binding.viewPager.setCurrentItem(3);
                break;
            case R.id.radioBtn_project:
                binding.viewPager.setCurrentItem(4);
                break;

        }
    }

    //自定义TitleBar的点击事件
    private void onClickTitleBar() {
        binding.titleBar.setOnTitleBarListener(new OnTitleBarListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onLeftClick(View v) {
                //菜单
                binding.drawerLayout.openDrawer(Gravity.START);
            }

            @Override
            public void onTitleClick(View v) {
                //标题
//                ToastUtils.show("中间View被点击");
            }

            @Override
            public void onRightClick(View v) {
                //搜索键
//                ToastUtils.show("右项View被点击");
                ARouter.getInstance().build(ARouterManager.SEARCH_ACTIVITY).navigation();
            }
        });
    }


    //侧滑栏的事件处理
    private void onNavigationView() {
        //头像点击事件处理
        binding.mainNavigationView.getHeaderView(0).findViewById(R.id.iv_user).setOnClickListener((View) -> {
            //点击头像弹出PopupWindow
            showPopupWindow(binding.mainLayout);
        });
        //menu点击事件处理
        binding.mainNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.integral:
                        ToastUtils.show("积分");
                        break;
                    case R.id.share:
                        ToastUtils.show("分享");
                        break;
                    case R.id.collect:
                        ToastUtils.show("收藏");
                        break;
                    case R.id.todo:
                        ToastUtils.show("TODO");
                        break;
                    case R.id.setting:
                        ToastUtils.show("设置");
                        break;
                    case R.id.about:
                        ToastUtils.show("关于我们");
                        break;
                    case R.id.esc:
//                        ToastUtils.show("退出登录");
                        alert();
                        break;
                }
                return false;
            }
        });
    }

    //点击头像进行相册/拍照选择
    private void showPopupWindow(View parent) {
        PhotoPopupWindow popupWindow = new PhotoPopupWindow(this);
        //定义PopupWindow的弹出位置
        popupWindow.showAtLocation(parent, Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);//在activity的底部展示。
//            popupWindow.showAsDropDown(binding.showPopupWindow); //在某个控件下方弹出Popupwindow
        popupWindow.setImageClickaListener(new PhotoPopupWindow.PhotoDataListener() {
            @Override
            public void getTestData(int type) {
                switch (type) {
                    case 0:  //拍照
                        requestPermission(0);
                        break;
                    case 1:  //相册
                        requestPermission(1);
                        break;
                    case 2:  //取消
                        Toast.makeText(getBaseContext(), "取消", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    /**
     * 动态请求权限
     */

    private void requestPermission(int type) {
        //使用了郭霖大神的Permission库实现
        PermissionX.init(this)
                .permissions(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA, Manifest.permission.ACCESS_NETWORK_STATE)
                .onExplainRequestReason((scope, deniedList) -> {
                    String message = "需要您同意以下权限才能正常使用";
                    scope.showRequestReasonDialog(deniedList, message, "确定", "取消");
                })
                .request((allGranted, grantedList, deniedList) -> {
                    if (allGranted) {
                        //根据点击的类型调用特定的方法。
                        if (type == 0) {
                            requestCamera();
                        } else {
                            openAlbum();
                        }
                    } else {
                        Toast.makeText(this, "您拒绝了如下权限：" + deniedList, Toast.LENGTH_SHORT).show();
                    }
                });
    }

    /**
     * 调用摄像头拍照功能
     */
    //请求相机拍照
    private void requestCamera() {
        try {
            if (imageUri == null) {
                if (!outputImage.getParentFile().exists()) {
                    outputImage.getParentFile().mkdirs();
                }
                outputImage.createNewFile();
                if (Build.VERSION.SDK_INT >= 24) {
                    imageUri = FileProvider.getUriForFile(this,
                            "com.example.wanandroid.fileprovider", outputImage);
                }
            }
            //使用隐示的Intent，系统会找到与它对应的活动，即调用摄像头，并把它存储
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
            startActivityForResult(intent, TAKE_PHOTO);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //处理返回结果的函数，下面是隐示Intent的返回结果的处理方式
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case TAKE_PHOTO:
                if (resultCode == RESULT_OK) {
                    try {
                        Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri));
                        picture.setImageBitmap(bitmap);
                        //存储上次选择的图片路径，用以再次打开app设置图片
                        SharedPreferences sp = getSharedPreferences("sp_img", MODE_PRIVATE);  //创建xml文件存储数据，name:创建的xml文件名
                        SharedPreferences.Editor editor = sp.edit(); //获取edit()
                        editor.putString("imgPath", filePath);
                        editor.apply();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case CHOOSE_PHOTO:
                if (resultCode == RESULT_OK) {
                    //判断手机系统版本号
                    if (Build.VERSION.SDK_INT >= 19) {
                        //4.4及以上系统使用这个方法处理图片
                        handleImageOnKitKat(data);
                    }
                }
                break;
            default:
                break;
        }
    }

    /**
     * 从相册选择照片功能
     */

    private void openAlbum() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(intent, CHOOSE_PHOTO); //打开相册
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void handleImageOnKitKat(Intent data) {
        Uri uri = data.getData();
        if (DocumentsContract.isDocumentUri(this, uri)) {
            //如果是document类型的Uri，则通过document id处理
            String docId = DocumentsContract.getDocumentId(uri);
            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String id = docId.split(":")[1];  //解析出数字格式的id
                String selection = MediaStore.Images.Media._ID + "=" + id;
                imagePath = getImagePath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, selection);
            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                Uri contentUri = ContentUris.withAppendedId(Uri.parse("content://downloads/public downloads"), Long.valueOf(docId));
                imagePath = getImagePath(contentUri, null);
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            //如果是file类型的Uri，直接获取图片路径即可
            imagePath = getImagePath(uri, null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            //如果是file类型的Uri，直接获取图片路径即可
            imagePath = uri.getPath();
        }
        displayImage(imagePath); //根据图片路径显示图片
    }

    //将选择的图片Uri转换为路径
    private String getImagePath(Uri uri, String selection) {
        String path = null;
        //通过Uri和selection来获取真实的图片路径
        Cursor cursor = getContentResolver().query(uri, null, selection, null, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                path = cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA));
            }
            cursor.close();
        }
        return path;
    }

    /**
     * 展示图片 (公用)
     *
     * @param imagePath
     */
    private void displayImage(String imagePath) {
        if (imagePath != null && !imagePath.equals("")) {
            Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
            picture.setImageBitmap(bitmap);
            //存储上次选择的图片路径，用以再次打开app设置图片
            SharedPreferences sp = getSharedPreferences("sp_img", MODE_PRIVATE);  //创建xml文件存储数据，name:创建的xml文件名
            SharedPreferences.Editor editor = sp.edit(); //获取edit()
            editor.putString("imgPath", imagePath);
            editor.apply();
        } else {
            Toast.makeText(this, "获取图片失败", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 设置上一次打开app时保存图片，为当前activity显示用户头像
     **/
    private void setKeepImage() {
        SharedPreferences sp = getSharedPreferences("sp_img", MODE_PRIVATE);
        String beforeImagePath = sp.getString("imgPath", null);
        //取出上次存储的图片路径设置此次的图片展示
        if (beforeImagePath != null) {
            displayImage(beforeImagePath);
        } else {
            picture.setImageResource(R.mipmap.user_img);  //设置默认图片user_img
        }
    }

    //退出应用程序
    private void alert(){
        selfDialog = new SelfDialog(this);
        selfDialog.setTitle("退出应用程序");
        selfDialog.setMessage("确定退出应用?");
        selfDialog.setYesOnclickListener("确定", new SelfDialog.onYesOnclickListener() {
            @Override
            public void onYesClick() {
//                ToastUtils.show("确定"); //消息提示
                finish();
                selfDialog.dismiss();
            }
        });
        selfDialog.setNoOnclickListener("取消", new SelfDialog.onNoOnclickListener() {
            @Override
            public void onNoClick() {
//                ToastUtils.show("取消"); //消息提示
                selfDialog.dismiss();
            }
        });
        selfDialog.show();
    }
}