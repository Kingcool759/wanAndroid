package com.example.wanandroid.api;

import com.example.wanandroid.api.AppApi;
import com.example.wanandroid.databean.HomeListRes;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @data on 2020/9/2 4:18 PM
 * @auther
 * @describe
 */
public interface AppApiService {

    /**
     * 获取首页列表
     * @return
     */

    @GET(AppApi.HOME_LIST)
    Call<HomeListRes> getHomeList();
}
