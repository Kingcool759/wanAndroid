package com.example.wanandroid.fragment;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wanandroid.R;
import com.example.wanandroid.adapter.TablayoutViewPagerAdapter;
import com.example.wanandroid.databinding.FragmentProjectBinding;
import com.example.wanandroid.viewmodel.ProjectViewModel;

import java.util.ArrayList;
import java.util.List;

public class ProjectFragment extends Fragment {
    private FragmentProjectBinding binding;
    private ProjectViewModel viewModel;

    //tablayout
    private TablayoutViewPagerAdapter tabAdapter;
    private ArrayList<Fragment> list_fragment = new ArrayList<>(); //定义要装frament的列表
    private List<String> title_list = new ArrayList<>();  //定义title列表
    //recyclerview
    private List<Integer> id_list = new ArrayList<>();  //根据id查找项目列表

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_project,container,false);
        viewModel = ViewModelProviders.of(this).get(ProjectViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        //获取获取api接口数据
        viewModel.getProjectTabTitleList();
        getDataCallback();

        return binding.getRoot();
    }

    /**
     *  获取接口数据，将title数据添加进要用的list中
     */
    private void getDataCallback(){
        viewModel.mProjectTabList.observe(getViewLifecycleOwner(),it->{
            for(int i =0 ; i< it.size();i++){
                title_list.add(it.get(i).getName());
                id_list.add(it.get(i).getId());
            }
            setTabAndViewPager();
        });
    }

    /**
     *  使用titlelist,设置tabs
     */
    private void setTabAndViewPager(){
        for(int i =0 ; i < title_list.size(); i++){
            list_fragment.add(ProjectViewPagerFragment.newInstance(id_list.get(i).toString()));
            binding.tablayout.addTab(binding.tablayout.newTab().setText(title_list.get(i)));
        }
        //绑定适配器
        tabAdapter = new TablayoutViewPagerAdapter(getChildFragmentManager(),list_fragment,title_list);
        //viewpager加载adapter
        binding.viewPager.setAdapter(tabAdapter);
        //TabLayout加载viewpager
        binding.tablayout.setupWithViewPager(binding.viewPager);
    }
}