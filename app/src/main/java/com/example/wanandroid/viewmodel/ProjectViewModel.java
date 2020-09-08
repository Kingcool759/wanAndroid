package com.example.wanandroid.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.wanandroid.api.ApiCallback;
import com.example.wanandroid.api.AppApiService;
import com.example.wanandroid.api.NetworkPortal;
import com.example.wanandroid.databean.ProjectTabListRes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class ProjectViewModel extends ViewModel {
    //tabs
    public MutableLiveData<List<ProjectTabListRes.DataBean>> mProjectTabList = new MutableLiveData<>();

    /**
     * 获取项目tab
     */
    public void getProjectTabTitleList() {
        NetworkPortal.getService(AppApiService.class).getProjectTabList().enqueue(new ApiCallback<ProjectTabListRes>() {
            @Override
            public void onSuccessful(Call<ProjectTabListRes> call, Response<ProjectTabListRes> response) {
                Log.d("onSuccessful", "请求成功了！");
                if (response == null || response.body() == null) {
                    return;
                }else {
                    mProjectTabList.setValue(response.body().getData());
                }
            }

            @Override
            public void onFail(String message) {
                Log.d("onFail", "啊哦～请求失败了！");
            }
        });
    }
}