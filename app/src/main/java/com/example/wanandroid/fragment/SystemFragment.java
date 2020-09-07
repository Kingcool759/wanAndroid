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
import com.example.wanandroid.databinding.FragmentSystemBinding;
import com.example.wanandroid.viewmodel.SystemViewModel;

import java.util.ArrayList;

public class SystemFragment extends Fragment {
    private FragmentSystemBinding binding;
    private SystemViewModel viewModel;

    //tablayout
    private TabViewPagerAdapter tabAdapter;
    private ArrayList<Fragment> list_fragment = new ArrayList<>();
    private ArrayList<String> title_list = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_system,container,false);
        viewModel = ViewModelProviders.of(this).get(SystemViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        setTabAndFragment();

        return binding.getRoot();
    }

    private void setTabAndFragment(){
        title_list.add("体系");
        title_list.add("导航");

        for(int i =0 ; i < title_list.size(); i++){
            list_fragment.add(new SystemViewPagerFragment());
            binding.tablayout.addTab(binding.tablayout.newTab().setText(title_list.get(i)));
        }
        //绑定适配器
        tabAdapter = new TabViewPagerAdapter(getChildFragmentManager(),list_fragment,title_list);
        //viewpager加载adapter
        binding.viewPager.setAdapter(tabAdapter);
        //TabLayout加载viewpager
        binding.tablayout.setupWithViewPager(binding.viewPager);
    }
}