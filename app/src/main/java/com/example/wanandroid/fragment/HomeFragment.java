package com.example.wanandroid.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.wanandroid.R;
import com.example.wanandroid.activity.WebViewActivity;
import com.example.wanandroid.adapter.BannerRecyclerViewAdapter;
import com.example.wanandroid.adapter.DividerItemDecoration;
import com.example.wanandroid.adapter.HomeListAdapter;
import com.example.wanandroid.arouter.ARouterManager;
import com.example.wanandroid.bean.ImageUrl;
import com.example.wanandroid.databean.BannerListRes;
import com.example.wanandroid.databean.HomeListRes;
import com.example.wanandroid.databinding.FragmentHomeBinding;
import com.example.wanandroid.viewmodel.HomeViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private HomeViewModel viewModel;

    //首页RecyclerView
    //banner
    private List<BannerListRes.DataBean> mBannerList;
    private LinearLayoutManager bannerLayoutManager;
    private BannerRecyclerViewAdapter bannerAdapter;

    //列表
    private List<HomeListRes.DataBean.DatasBean> mHomeList;
    private LinearLayoutManager homeLayoutManager;
    private HomeListAdapter homeAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        //使用databinding绑定viewmodel
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        viewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        getBanner();
        getHomeList();
        getDataCallBack();
        getRefresh();

        /**
         * 调用api接口获取数据
         */
        viewModel.getBannerViewList();
        viewModel.getHomePageList();

        return binding.getRoot();
    }

    /***
     * 首页——轮播图
     */
    private void getBanner() {
        mBannerList = new ArrayList();
        //Recyclerview
        bannerAdapter = new BannerRecyclerViewAdapter(getContext(), mBannerList);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(binding.banner);
        bannerLayoutManager = new LinearLayoutManager(getContext());
        bannerLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        binding.banner.setLayoutManager(bannerLayoutManager); //先设置manager,再设置adapter
        binding.banner.setAdapter(bannerAdapter);
        binding.banner.setItemAnimator(new DefaultItemAnimator());
        binding.banner.setHasFixedSize(true);
    }

    /**
     * 首页-列表
     */
    private void getHomeList() {
        mHomeList = new ArrayList();
        homeAdapter = new HomeListAdapter(mHomeList);  //把从Api接口解析的数据json解析后的List<databean>传进去
        homeLayoutManager = new LinearLayoutManager(getContext());
        homeLayoutManager.setOrientation(RecyclerView.VERTICAL);
        binding.rvList.setLayoutManager(homeLayoutManager);  //一定要先于adapter设置
        binding.rvList.setAdapter(homeAdapter);
        binding.rvList.setItemAnimator(new DefaultItemAnimator());
        binding.rvList.addItemDecoration(new DividerItemDecoration(Objects.requireNonNull(getContext())));
        binding.rvList.setHasFixedSize(true);
    }

    /**
     * 数据回调处理
     */
    private void getDataCallBack() {
        //首页-banner
        viewModel.mBannerList.observe(getViewLifecycleOwner(), it -> {
            mBannerList.addAll(it);
            bannerAdapter.notifyDataSetChanged();
        });
        //获取点击事件数据
        bannerAdapter.setBannerDataListener((title, link) -> {
            //使用ARouter路由跳转
            ARouter.getInstance().build(ARouterManager.WEBVIEW_DETAILS)
                    .withString("title",title)
                    .withString("link",link)
                    .navigation();
        });

        //首页-列表
        viewModel.mHomeList.observe(getViewLifecycleOwner(), it -> {   //lambda表达式
            mHomeList.addAll(it);
            homeAdapter.notifyDataSetChanged();
        });
        //获取点击事件数据
        homeAdapter.setBannerDataListener(new HomeListAdapter.BannerDataListener() {
            @Override
            public void getBannerData(String title, String link) {
                //使用ARouter路由跳转
                ARouter.getInstance().build(ARouterManager.WEBVIEW_DETAILS)
                        .withString("title",title)
                        .withString("link",link)
                        .navigation();
            }
        });
    }

    /**
     * 智能刷新
     */
    private void getRefresh() {

    }
}