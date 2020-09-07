package com.example.wanandroid.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.wanandroid.R;
import com.example.wanandroid.adapter.TabViewPagerAdapter;
import com.example.wanandroid.databinding.FragmentPublicBinding;
import com.example.wanandroid.viewmodel.PublicViewModel;

import java.util.ArrayList;
import java.util.List;

public class PublicFragment extends Fragment {
    private FragmentPublicBinding binding;
    private PublicViewModel viewModel;
    //tablayout
    private TabViewPagerAdapter tabAdapter;
    private ArrayList<Fragment> list_fragment = new ArrayList<>(); //定义要装frament的列表
    private List<String> title_list = new ArrayList<>();  //定义title列表

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_public,container,false);
        viewModel = ViewModelProviders.of(this).get(PublicViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        //获取获取api接口数据
        viewModel.getPublicTabTitleList();
        getDataCallback();

        return binding.getRoot();
    }

    /**
     *  获取接口数据，将title数据添加进要用的list中
     */
    private void getDataCallback(){
        viewModel.mPublicTabList.observe(getViewLifecycleOwner(),it->{
            for(int i =1 ; i< it.size();i++){
                title_list.add(it.get(i).getName());
            }
            setTabAndViewPager();
        });
    }

    /**
     *  使用titlelist,设置tabs
     */
    private void setTabAndViewPager(){
        for(int i =0 ; i < title_list.size(); i++){
            list_fragment.add(new PublicViewPagerFragment());
            binding.tablayout.addTab(binding.tablayout.newTab().setText(title_list.get(i)));
        }
        //绑定适配器
        tabAdapter = new TabViewPagerAdapter(getChildFragmentManager(),list_fragment,title_list);
        //viewpager加载adapter
        binding.viewPager.setAdapter(tabAdapter);
        //TabLayout加载viewpager
        binding.tablayout.setupWithViewPager(binding.viewPager);

//        //点击事件处理，变换当前点击的tab字体颜色
//        binding.tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                //选中时
//                View view = tab.getCustomView();
//                if (view instanceof TextView) {
//                    ((TextView) view).setTextColor(ContextCompat.getColor(Objects.requireNonNull(getContext()), R.color.green));
//                }
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                //未选中时
//                View view = tab.getCustomView();
//                if (view instanceof TextView) {
//                    ((TextView) view).setTextColor(ContextCompat.getColor(Objects.requireNonNull(getContext()), R.color.gray));
//                }
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
    }
}