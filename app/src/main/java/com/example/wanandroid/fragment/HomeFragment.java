package com.example.wanandroid.fragment;

import android.os.Bundle;
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
import androidx.recyclerview.widget.RecyclerView;

import com.example.wanandroid.R;
import com.example.wanandroid.adapter.BannerRecyclerViewAdapter;
import com.example.wanandroid.adapter.DividerItemDecoration;
import com.example.wanandroid.adapter.HomeListAdapter;
import com.example.wanandroid.bean.ImageUrl;
import com.example.wanandroid.databean.HomeListRes;
import com.example.wanandroid.databinding.FragmentHomeBinding;
import com.example.wanandroid.viewmodel.HomeViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private HomeViewModel viewModel;

    //首页列表RecyclerView
    private List<HomeListRes.DataBean.DatasBean> mHomeList;
    private LinearLayoutManager layoutManager;
    private HomeListAdapter adapter;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //使用databinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,true);
        viewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        /**
         * RecyclerView制作的banner轮播图-->之后使用ViewPager换掉
         */
        getBanner();
        /**
         * 首页——列表RecyclerView
         */
        mHomeList = new ArrayList();
        adapter = new HomeListAdapter(mHomeList);  //把从Api接口解析的数据json解析后的List<databean>传进去
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        binding.rvList.setLayoutManager(layoutManager);  //一定要先于adapter设置
        binding.rvList.setAdapter(adapter);
        binding.rvList.setItemAnimator(new DefaultItemAnimator());
        binding.rvList.addItemDecoration(new DividerItemDecoration(Objects.requireNonNull(getContext())));
        binding.rvList.setHasFixedSize(true);

        /**
         * 获取接口数据，实现首页列表数据装载
         */
        viewModel.getHomePageList();
        viewModel.mHomeList.observe(getViewLifecycleOwner(),it->{
            mHomeList.addAll(it);
            adapter.notifyDataSetChanged();
        });
        /**
         * 智能刷新
         */
        getRefresh();
        return binding.getRoot();
    }


    /***
     * 首页——轮播图
     */
    private void getBanner(){
        List<ImageUrl> imageUrlList = new ArrayList();
        for(int i = 1 ; i < 5 ; i++){
            imageUrlList.add(new ImageUrl("https://www.wanandroid.com/blogimgs/bb0747bd-f59f-4733-8d29-0735502f0c6c.png"));
        }
        //Recyclerview
        BannerRecyclerViewAdapter adapter = new BannerRecyclerViewAdapter(getContext(), imageUrlList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        binding.banner.setLayoutManager(layoutManager); //先设置manager,再设置adapter
        binding.banner.setAdapter(adapter);
        binding.banner.setItemAnimator(new DefaultItemAnimator());
        binding.banner.setHasFixedSize(true);
    }

    /**
     * 智能刷新
     */
    private void getRefresh(){
//        binding.srlSmartRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
//            @Override
//            public void onRefresh(RefreshLayout refreshlayout) {
//                refreshlayout.finishRefresh(2000/*,false*/);//传入false表示刷新失败
//            }
//        });
//        binding.srlSmartRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
//            @Override
//            public void onLoadMore(RefreshLayout refreshlayout) {
//                refreshlayout.finishLoadMore(2000/*,false*/);//传入false表示加载失败
//            }
//        });
    }


}