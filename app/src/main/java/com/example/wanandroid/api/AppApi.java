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
     *  获取公众号列表
     */
    public static final String PUBLIC_ACCOUNT_LIST = "wxarticle/chapters/json";
}
