package com.example.wanandroid.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.wanandroid.api.ApiCallback;
import com.example.wanandroid.api.AppApiService;
import com.example.wanandroid.api.NetworkPortal;
import com.example.wanandroid.databean.AnswerListRes;
import com.example.wanandroid.databean.HomeListRes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class AnswerViewModel extends ViewModel {

    public MutableLiveData<List<AnswerListRes.DataBean.DatasBean>> mAnswerList = new MutableLiveData<>();

    /**
     * 获取问答列表
     */
    public void getAnswerPageList() {
        NetworkPortal.getService(AppApiService.class).getAnswerList().enqueue(new ApiCallback<AnswerListRes>() {
            @Override
            public void onSuccessful(Call<AnswerListRes> call, Response<AnswerListRes> response) {
                Log.d("onSuccessful", "请求成功了！");
                if (response == null || response.body() == null) {
                    return;
                }
                mAnswerList.setValue(response.body().getData().getDatas());
            }

            @Override
            public void onFail(String message) {
                Log.d("onFail", "啊哦～请求失败了！");
            }
        });
    }
}