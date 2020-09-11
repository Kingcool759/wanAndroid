package com.example.wanandroid.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.Color;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.wanandroid.R;
import com.example.wanandroid.adapter.DividerItemDecoration;
import com.example.wanandroid.databinding.ActivitySearchBinding;
import com.example.wanandroid.viewmodel.PublicViewPagerViewModel;
import com.example.wanandroid.viewmodel.SearchViewModel;
import com.example.wanandroid.viewmodel.SystemStructurerViewModel;
import com.hjq.toast.ToastUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

import static java.security.AccessController.getContext;

@Route(path = "/wanandroid/searchActivity")
public class SearchActivity extends AppCompatActivity {
    private ActivitySearchBinding binding;
    private SearchViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_search);

        //DataBinding双向数据绑定。
        viewModel = ViewModelProviders.of(this).get(SearchViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        //返回
        binding.goBack.setOnClickListener((View)->{
            finish();
        });

        //获取接口数据
        getCallback();
        binding.rvSearch.addItemDecoration(new DividerItemDecoration(this));
    }

    private void getCallback(){
        viewModel.key.observe(this,it->{
            viewModel.getSearchArticles();
        });
    }
}