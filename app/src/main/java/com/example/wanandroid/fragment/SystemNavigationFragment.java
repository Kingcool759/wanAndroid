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
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wanandroid.BR;
import com.example.wanandroid.R;
import com.example.wanandroid.adapter.NavigationListAdapter;
import com.example.wanandroid.adapter.SystemListAdapter;
import com.example.wanandroid.databean.NavigationDataListRes;
import com.example.wanandroid.databean.SystemDataListRes;
import com.example.wanandroid.databinding.FragmentSystemNavigationBinding;
import com.example.wanandroid.viewmodel.SystemNavigationViewModel;
import com.example.wanandroid.viewmodel.SystemStructurerViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @data on 2020/9/8 6:31 PM
 * @auther
 * @describe
 */
public class SystemNavigationFragment extends Fragment {
    private FragmentSystemNavigationBinding binding;
    private SystemNavigationViewModel viewModel;

    //recyclerview
    private List<NavigationDataListRes.DataBean> itemTitles;
    private NavigationListAdapter rvAdapter;
    private LinearLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_system_navigation,container,false);
        viewModel = ViewModelProviders.of(this).get(SystemNavigationViewModel.class);
        binding.setVariable(BR.viewModel,viewModel);  //找不到setViewModel的写法
//        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        getNavigationList();
        //获取接口数据
        viewModel.getNavigationPageList();
        getDataCallback();

        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void getDataCallback(){
        viewModel.mNavigationDataList.observe(getViewLifecycleOwner(),it->{
            itemTitles.addAll(it);
            Log.i("armstrong",itemTitles+"");
            rvAdapter.notifyDataSetChanged();
        });
    }

    private void getNavigationList(){
        itemTitles = new ArrayList<>();
        rvAdapter = new NavigationListAdapter(itemTitles,getActivity());  //把从Api接口解析的数据json解析后的List<databean>传进去
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        binding.navigationRecyclerview.setLayoutManager(layoutManager);  //一定要先于adapter设置
        binding.navigationRecyclerview.setAdapter(rvAdapter);
        binding.navigationRecyclerview.setItemAnimator(new DefaultItemAnimator());
    }
}
