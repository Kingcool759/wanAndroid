package com.example.wanandroid.fragment;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
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
import com.example.wanandroid.adapter.DividerItemDecoration;
import com.example.wanandroid.databinding.FragmentPublicViewpagerBinding;
import com.example.wanandroid.viewmodel.PublicViewPagerViewModel;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class PublicViewPagerFragment extends Fragment {
    private FragmentPublicViewpagerBinding binding;
    private PublicViewPagerViewModel viewModel;
    //定义id
    private String id = "";

    public static PublicViewPagerFragment newInstance(String id) {
        PublicViewPagerFragment publicViewPagerFragment = new PublicViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putString("id", id);
        publicViewPagerFragment.setArguments(bundle);
        return publicViewPagerFragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_public_viewpager, container, false);
        Bundle arguments = getArguments();
        //加判断，防止空指针异常
        if (arguments!=null){
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
        }).get(PublicViewPagerViewModel.class);

        binding.setViewMoedl(viewModel);
        binding.setLifecycleOwner(this);

        viewModel.getPublicTitleDataList();

        //给recyclerview添加下划线

        binding.recyclerview.addItemDecoration(new DividerItemDecoration(Objects.requireNonNull(getContext())));
        return binding.getRoot();
    }
}