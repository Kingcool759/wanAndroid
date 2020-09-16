package com.example.wanandroid.main;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
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
import com.google.android.material.navigation.NavigationView;
import com.hjq.bar.OnTitleBarListener;
import com.hjq.toast.ToastUtils;

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
    public static final int TAKE_PHOTO = 1;//声明一个请求码，用于识别返回的结果
    private Uri imageUri;
    private ImageView picture;
    private final String filePath = Environment.getExternalStorageDirectory() + File.separator + "output_image.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
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

        setDefualtHead();
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
    private void onClickTitleBar(){
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
    private void onNavigationView(){
        //头像点击事件处理
        binding.mainNavigationView.getHeaderView(0).findViewById(R.id.iv_user).setOnClickListener((View)->{
            //点击头像弹出PopupWindow
            showPopupWindow(binding.mainLayout);
        });
        //menu点击事件处理
        binding.mainNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.integral :
                        ToastUtils.show("积分");
                        break;
                    case R.id.share :
                        ToastUtils.show("分享");
                        break;
                    case R.id.collect :
                        ToastUtils.show("收藏");
                        break;
                    case R.id.todo :
                        ToastUtils.show("TODO");
                        break;
                    case R.id.setting :
                        ToastUtils.show("设置");
                        break;
                    case R.id.about :
                        ToastUtils.show("关于我们");
                        break;
                    case R.id.esc :
                        ToastUtils.show("退出登录");
                        finish();
                        break;
                }
                return false;
            }
        });
    }

    //点击头像进行相册/拍照选择
    private void showPopupWindow(View parent){
        PhotoPopupWindow popupWindow = new PhotoPopupWindow(this);
        //定义PopupWindow的弹出位置
        popupWindow.showAtLocation(parent, Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);//在activity的底部展示。
//            popupWindow.showAsDropDown(binding.showPopupWindow); //在某个控件下方弹出Popupwindow
        popupWindow.setImageClickaListener(new PhotoPopupWindow.PhotoDataListener() {
            @Override
            public void getTestData(int type) {
                switch (type){
                    case 0:  //拍照
                        Toast.makeText(getBaseContext(),"拍照",Toast.LENGTH_SHORT).show();
                        requestPermission();
                        break;
                    case 1:  //相册
                        Toast.makeText(getBaseContext(),"相册",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:  //取消
                        Toast.makeText(getBaseContext(),"取消",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    /**
     *  拍照实现
     */
    //动态请求权限
    private void requestPermission() {

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            //请求权限
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1);
        } else {
            //调用
            requestCamera();
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults != null && grantResults.length != 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            switch (requestCode) {
                case 1: {
                    requestCamera();
                }
                break;
            }
        }
    }

    //请求相机拍照
    private void requestCamera() {
        File outputImage = new File(filePath);
        try
        {
            if (!outputImage.getParentFile().exists()) {
                outputImage.getParentFile().mkdirs();
            }
            if (outputImage.exists()) {
                outputImage.delete();
            }

            outputImage.createNewFile();

            if (Build.VERSION.SDK_INT >= 24) {
                imageUri = FileProvider.getUriForFile(this,
                        "com.example.wanandroid.fileprovider", outputImage);
            } else {
                imageUri = Uri.fromFile(outputImage);
            }
            //使用隐示的Intent，系统会找到与它对应的活动，即调用摄像头，并把它存储
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
            startActivityForResult(intent, TAKE_PHOTO);
            //调用会返回结果的开启方式，返回成功的话，则把它显示出来
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
                        //将图片解析成Bitmap对象，并把它显现出来
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            default:
                break;
        }
    }

    //设置保存拍照图片——>再次关闭app重新打开为上次拍照照片
    private void setDefualtHead() {
        File outputImage = new File(filePath);
        if (!outputImage.exists()) {
            return;
        }
        picture.setImageBitmap(BitmapFactory.decodeFile(filePath));
    }
}