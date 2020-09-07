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
import com.example.wanandroid.databinding.FragmentProjectViewpagerBinding;

public class ProjectViewPagerFragment extends Fragment {
    private FragmentProjectViewpagerBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_project_viewpager, container, false);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}
