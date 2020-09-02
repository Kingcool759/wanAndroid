package com.example.wanandroid.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.wanandroid.api.ApiCallback;
import com.example.wanandroid.api.AppApiService;
import com.example.wanandroid.api.NetworkPortal;
import com.example.wanandroid.databean.HomeListRes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public MutableLiveData<List<HomeListRes.DataBean.DatasBean>> mHomeList = new MutableLiveData<>();

    /**
     * 获取首页列表
     */
    public void getHomePageList() {
        NetworkPortal.getService(AppApiService.class).getHomeList().enqueue(new ApiCallback<HomeListRes>() {
            @Override
            public void onSuccessful(Call<HomeListRes> call, Response<HomeListRes> response) {
                Log.d("onSuccessful", "请求成功了！");
                if (response == null || response.body() == null) {
                    return;
                }
                mHomeList.setValue(response.body().getData().getDatas());
            }

            @Override
            public void onFail(String message) {
                Log.d("onFail", "啊哦～请求失败了！");
            }
        });
    }
}