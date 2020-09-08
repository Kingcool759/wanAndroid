package com.example.wanandroid.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.wanandroid.api.ApiCallback;
import com.example.wanandroid.api.AppApiService;
import com.example.wanandroid.api.NetworkPortal;
import com.example.wanandroid.databean.NavigationDataListRes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class SystemNavigationViewModel extends ViewModel {

    public MutableLiveData<List<NavigationDataListRes.DataBean>> mNavigationDataList = new MutableLiveData<>();

    /**
     * 获取导航数据
     */
    public void getNavigationPageList() {
        NetworkPortal.getService(AppApiService.class).getNavigationDataList().enqueue(new ApiCallback<NavigationDataListRes>() {
            @Override
            public void onSuccessful(Call<NavigationDataListRes> call, Response<NavigationDataListRes> response) {
                Log.d("onSuccessful", "请求成功了！");
                if (response == null || response.body() == null) {
                    return;
                }
                mNavigationDataList.setValue(response.body().getData());
            }

            @Override
            public void onFail(String message) {
                Log.d("onFail", "啊哦～请求失败了！");
            }
        });
    }
}
