package com.example.wanandroid.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.wanandroid.api.ApiCallback;
import com.example.wanandroid.api.AppApiService;
import com.example.wanandroid.api.NetworkPortal;
import com.example.wanandroid.databean.HomeListRes;
import com.example.wanandroid.databean.PublicAccountListRes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class PublicViewModel extends ViewModel {

    public MutableLiveData<List<PublicAccountListRes.DataBean>> mPublicAccountList = new MutableLiveData<>();

    /**
     * 获取公众号tab
     */
    public void getPublicWexinList() {
        NetworkPortal.getService(AppApiService.class).getPublicAccountList().enqueue(new ApiCallback<PublicAccountListRes>() {
            @Override
            public void onSuccessful(Call<PublicAccountListRes> call, Response<PublicAccountListRes> response) {
                Log.d("onSuccessful", "请求成功了！");
                if (response == null || response.body() == null) {
                    return;
                }else {
                    mPublicAccountList.setValue(response.body().getData());
                }
            }

            @Override
            public void onFail(String message) {
                Log.d("onFail", "啊哦～请求失败了！");
            }
        });
    }

}