package com.example.wanandroid.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.wanandroid.R;
import com.example.wanandroid.databinding.FragmentSystemNavigationBinding;

/**
 * @data on 2020/9/8 6:31 PM
 * @auther
 * @describe
 */
public class SystemNavigationFragment extends Fragment {
    private FragmentSystemNavigationBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_system_navigation,container,false);
        return binding.getRoot();
    }
}
