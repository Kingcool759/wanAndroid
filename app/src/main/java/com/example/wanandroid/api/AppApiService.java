package com.example.wanandroid.api;

import com.example.wanandroid.api.AppApi;
import com.example.wanandroid.databean.AnswerListRes;
import com.example.wanandroid.databean.BannerListRes;
import com.example.wanandroid.databean.HomeListRes;
import com.example.wanandroid.databean.ProjectTabListRes;
import com.example.wanandroid.databean.PublicAccountListRes;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @data on 2020/9/2 4:18 PM
 * @auther
 * @describe
 */
public interface AppApiService {
    /**
     *  获取banner
     */
    @GET(AppApi.BANNER_LIST)
    Call<BannerListRes> getBannerList();

    /**
     * 获取home列表
     * @return
     */

    @GET(AppApi.HOME_LIST)
    Call<HomeListRes> getHomeList();

    /**
     * 获取answer列表
     */
    @GET(AppApi.ANSWER_LIST)
    Call<AnswerListRes> getAnswerList();

    /**
     * 获取公众号tab列表
     */
    @GET(AppApi.PUBLIC_TAB_LIST)
    Call<PublicAccountListRes> getPublicTabList();

    /**
     * 获取项目tab列表
     */
    @GET(AppApi.PROJECT_TAB_LIST)
    Call<ProjectTabListRes> getProjectTabList();
}
