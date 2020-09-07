package com.example.wanandroid.fragment;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wanandroid.R;
import com.example.wanandroid.databinding.FragmentProjectBinding;
import com.example.wanandroid.databinding.FragmentPublicBinding;
import com.example.wanandroid.viewmodel.ProjectViewModel;
import com.example.wanandroid.viewmodel.PublicViewModel;

public class ProjectFragment extends Fragment {
    private FragmentProjectBinding binding;
    private ProjectViewModel viewModel;

    public static ProjectFragment newInstance() {
        return new ProjectFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_project,container,false);
        viewModel = ViewModelProviders.of(this).get(ProjectViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}