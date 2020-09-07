package com.example.wanandroid.api;

import com.example.wanandroid.databean.AnswerListRes;
import com.example.wanandroid.databean.BannerListRes;
import com.example.wanandroid.databean.HomeListRes;
import com.example.wanandroid.databean.ProjectTabListRes;
import com.example.wanandroid.databean.PublicDataListRes;
import com.example.wanandroid.databean.PublicTabListRes;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

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
    Call<PublicTabListRes> getPublicTabList();

    /**
     * 获取公众号数据列表（参数为id）
     */
    @GET(AppApi.PUBLIC_DATA_LIST)
    Call<PublicDataListRes> getPublicDataList(@Path("id") String chapterId);

    /**
     * 获取项目tab列表
     */
    @GET(AppApi.PROJECT_TAB_LIST)
    Call<ProjectTabListRes> getProjectTabList();
}
