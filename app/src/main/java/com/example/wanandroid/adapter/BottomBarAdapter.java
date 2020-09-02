package com.example.wanandroid.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @data on 2020/9/2 9:16 AM
 * @auther
 * @describe  //底部导航栏
 */
public class BottomBarAdapter extends FragmentPagerAdapter {

    List<Fragment> mFragmentList;
    public BottomBarAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        mFragmentList=list;
    }

    @Override
    public Fragment getItem(int i) {
        return mFragmentList.get(i);
    }

    @Override
    public int getCount() {
        return mFragmentList!=null?mFragmentList.size():0;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        super.destroyItem(container, position, object);
    }
}
