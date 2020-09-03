package com.example.wanandroid.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.wanandroid.R;
import com.example.wanandroid.adapter.BottomBarAdapter;
import com.example.wanandroid.databinding.ActivityMainBinding;
import com.example.wanandroid.fragment.AnswerFragment;
import com.example.wanandroid.fragment.HomeFragment;
import com.example.wanandroid.fragment.ProjectFragment;
import com.example.wanandroid.fragment.PublicFragment;
import com.example.wanandroid.fragment.SystemFragment;
import com.hjq.bar.OnTitleBarListener;
import com.hjq.bar.TitleBar;
import com.hjq.toast.ToastUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private List<Fragment> fragmentList = new ArrayList<>();
    private BottomBarAdapter adapter;
    //databinding
    private ActivityMainBinding binding;

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
    }
    private void initView() {
        binding.rg.setOnCheckedChangeListener(this);
        binding.rg.getChildAt(0).performClick();
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
            @Override
            public void onLeftClick(View v) {
                //返回键
                ToastUtils.show("左项View被点击");
            }

            @Override
            public void onTitleClick(View v) {
                //标题
                ToastUtils.show("中间View被点击");
            }

            @Override
            public void onRightClick(View v) {
                //搜索键
                ToastUtils.show("右项View被点击");
            }
        });
    }

}