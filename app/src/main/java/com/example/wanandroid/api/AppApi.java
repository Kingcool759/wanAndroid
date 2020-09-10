package com.example.wanandroid.api;

/**
 * @data on 2020/9/2 4:09 PM
 * @auther
 * @describe
 */
public class AppApi {
    public static String BaseURL= "https://www.wanandroid.com/";

    /**
     *  获取banner
     */
    public static final String BANNER_LIST = "banner/json";

    /**
     *  获取home列表
     */
    public static final String HOME_LIST = "article/list/0/json";

    /**
     *  获取answer列表
     */
    public static final String ANSWER_LIST = "wenda/list/1/json";

    /**
     *  获取公众号tab列表
     */
    public static final String PUBLIC_TAB_LIST = "wxarticle/chapters/json";


    /**
     *  获取公众号数据列表（参数为id）
     */
    public static final String PUBLIC_DATA_LIST = "wxarticle/list/{id}/1/json";

    /**
     *  获取项目tab列表
     */
    public static final String PROJECT_TAB_LIST = "project/tree/json";

    /**
     *  获取项目数据列表（参数为id）
     */
    public static final String PROJECT_DATA_LIST = "project/list/1/json";

    /**
     *  获取体系-体系数据
     */
    public static final String SYSETM_DATA_LIST = "tree/json";

    /**
     *  获取体系-导航数据
     */
    public static final String NAVIGATION_DATA_LIST = "navi/json";

    /**
     *  搜索文章
     */
    public static final String SEARCH_ARTICLE = "article/query/{page}/json";

}
