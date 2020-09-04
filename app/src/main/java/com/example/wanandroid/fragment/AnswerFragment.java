package com.example.wanandroid.fragment;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wanandroid.R;
import com.example.wanandroid.adapter.AnswerListAdapter;
import com.example.wanandroid.adapter.DividerItemDecoration;
import com.example.wanandroid.adapter.DividerNormalDecoration;
import com.example.wanandroid.adapter.HomeListAdapter;
import com.example.wanandroid.databean.AnswerListRes;
import com.example.wanandroid.databean.HomeListRes;
import com.example.wanandroid.databinding.FragmentAnswerBinding;
import com.example.wanandroid.viewmodel.AnswerViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnswerFragment extends Fragment {

    private FragmentAnswerBinding binding;
    private AnswerViewModel viewModel;

    //问答列表RecyclerView
    private List<AnswerListRes.DataBean.DatasBean> mAnswerList;
    private LinearLayoutManager layoutManager;
    private AnswerListAdapter adapter;

    public static AnswerFragment newInstance() {
        return new AnswerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_answer, container, true);
        viewModel = ViewModelProviders.of(this).get(AnswerViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        /**
         * 调用api接口获取数据
         */
        viewModel.getAnswerPageList();

        getAnswerList();
        getDateCallback();
        return binding.getRoot();
    }
    /**
     * 问答——列表
     */
    private void getAnswerList(){
        mAnswerList = new ArrayList();
        adapter = new AnswerListAdapter(mAnswerList);  //把从Api接口解析的数据json解析后的List<databean>传进去
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        binding.rvAnswerList.setLayoutManager(layoutManager);  //一定要先于adapter设置
        binding.rvAnswerList.setAdapter(adapter);
        binding.rvAnswerList.setItemAnimator(new DefaultItemAnimator());
        binding.rvAnswerList.addItemDecoration(new DividerNormalDecoration(Objects.requireNonNull(getContext())));
    }
    /**
     * 数据回调处理
     */
    private void getDateCallback(){
        viewModel.mAnswerList.observe(getViewLifecycleOwner(),it->{
            mAnswerList.addAll(it);
            adapter.notifyDataSetChanged();
        });
    }
}