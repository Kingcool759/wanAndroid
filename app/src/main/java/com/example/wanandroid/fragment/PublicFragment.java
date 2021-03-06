package com.example.wanandroid.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.wanandroid.R;
import com.example.wanandroid.adapter.TablayoutViewPagerAdapter;
import com.example.wanandroid.databinding.FragmentPublicBinding;
import com.example.wanandroid.viewmodel.PublicViewModel;

import java.util.ArrayList;
import java.util.List;

public class PublicFragment extends Fragment {
    private FragmentPublicBinding binding;
    private PublicViewModel viewModel;
    //tablayout
    private TablayoutViewPagerAdapter tabAdapter;
    private ArrayList<Fragment> list_fragment = new ArrayList<>(); //定义要装frament的列表
    private List<String> tab_list = new ArrayList<>();  //定义tab列表
    //recyclerview
    private List<Integer> id_list = new ArrayList<>();  //根据id查找公众号列表
    private int id;

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
            //i从0开始，否则会漏数据
            for(int i =0 ; i< it.size();i++){
                tab_list.add(it.get(i).getName());
                id_list.add(it.get(i).getId());
            }
            setTabAndViewPager();
        });
    }

    /**
     *  使用titlelist,设置tabs
     */
    private void setTabAndViewPager() {
        for (int i = 0; i < tab_list.size(); i++) {
            list_fragment.add(PublicViewPagerFragment.newInstance(id_list.get(i).toString()));
            binding.tablayout.addTab(binding.tablayout.newTab().setText(tab_list.get(i)));
        }
        //绑定适配器
        tabAdapter = new TablayoutViewPagerAdapter(getChildFragmentManager(), list_fragment, tab_list);
        //viewpager加载adapter
        binding.viewPager.setAdapter(tabAdapter);
        //TabLayout加载viewpager
        binding.tablayout.setupWithViewPager(binding.viewPager);
    }
}