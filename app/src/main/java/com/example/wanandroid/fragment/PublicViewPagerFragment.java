package com.example.wanandroid.fragment;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.wanandroid.R;
import com.example.wanandroid.viewmodel.PublicViewPagerViewModel;

public class PublicViewPagerFragment extends Fragment {

    private PublicViewPagerViewModel mViewModel;

    public static PublicViewPagerFragment newInstance() {
        return new PublicViewPagerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.public_view_pager_fragment, container, false);
    }
}