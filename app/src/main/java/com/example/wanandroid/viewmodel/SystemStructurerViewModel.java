package com.example.wanandroid.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.wanandroid.api.ApiCallback;
import com.example.wanandroid.api.AppApiService;
import com.example.wanandroid.api.NetworkPortal;
import com.example.wanandroid.databean.AnswerListRes;
import com.example.wanandroid.databean.SystemDataListRes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * @data on 2020/9/8 4:58 PM
 * @auther
 * @describe
 */
public class SystemStructurerViewModel extends ViewModel {

    public MutableLiveData<List<SystemDataListRes.DataBean>> mSystemDataList = new MutableLiveData<>();

    /**
     * 获取体系数据
     */
    public void getSystemPageList() {
        NetworkPortal.getService(AppApiService.class).getSystemDataList().enqueue(new ApiCallback<SystemDataListRes>() {
            @Override
            public void onSuccessful(Call<SystemDataListRes> call, Response<SystemDataListRes> response) {
                Log.d("onSuccessful", "请求成功了！");
                if (response == null || response.body() == null) {
                    return;
                }
                mSystemDataList.setValue(response.body().getData());
            }

            @Override
            public void onFail(String message) {
                Log.d("onFail", "啊哦～请求失败了！");
            }
        });
    }

}
