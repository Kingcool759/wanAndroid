package com.example.wanandroid.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * @data on 2020/9/7 10:23 AM
 * @auther
 * @describe
 */
public class TabViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> list_fragment; // fragment列表
    private List<String> list_Title; // tab名的列表

    public TabViewPagerAdapter(FragmentManager fm, List<Fragment> list_fragment, List<String> list_Title){
        super(fm);
        this.list_fragment = list_fragment;
        this.list_Title = list_Title;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list_fragment.get(position);
    }

    @Override
    public int getCount() {
        return list_fragment.size();
    }

    // 此方法用来显示tab上的名字
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list_Title.get(position%list_Title.size());
    }
}