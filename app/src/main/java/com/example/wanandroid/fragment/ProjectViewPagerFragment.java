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
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.wanandroid.R;
import com.example.wanandroid.adapter.DividerItemDecoration;
import com.example.wanandroid.databinding.FragmentProjectViewpagerBinding;
import com.example.wanandroid.viewmodel.ProjectViewPagerViewModel;
import com.example.wanandroid.viewmodel.PublicViewPagerViewModel;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.util.Objects;

public class ProjectViewPagerFragment extends Fragment {
    private FragmentProjectViewpagerBinding binding;
    private ProjectViewPagerViewModel viewModel;

    //定义id
    private String id = "";

    public static ProjectViewPagerFragment newInstance(String id) {
        ProjectViewPagerFragment projectViewPagerFragment = new ProjectViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putString("id", id);
        projectViewPagerFragment.setArguments(bundle);
        return projectViewPagerFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_project_viewpager, container, false);
        Bundle arguments = getArguments();
        //加判断，防止空指针异常
        if (arguments != null) {
            id = arguments.getString("id");
        }
        Log.d("id ----> ", id);
        //使用此方法将id传给其viewmodel用于按参数id调用api接口获取数据。——————————viewmodel Factory
        viewModel = ViewModelProviders.of(this, new ViewModelProvider.Factory() {

            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                try {
                    return modelClass.getConstructor(String.class).newInstance(id);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (java.lang.InstantiationException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }).get(ProjectViewPagerViewModel.class);

        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        //获取接口数据
        viewModel.getProjectTitleDataList();
        //为recyclerView设置下划线
        binding.projectRecyclerview.addItemDecoration(new DividerItemDecoration(Objects.requireNonNull(getContext())));

        return binding.getRoot();
    }
}
