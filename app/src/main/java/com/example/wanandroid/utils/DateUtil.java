package com.example.wanandroid.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @data on 2020/9/3 10:51 AM
 * @auther
 * @describe  java 13位时间戳转成字符串
 */
public class DateUtil {
    private static SimpleDateFormat sf = null;

    public static String getDateToString(long time) {
        Date d = new Date(time);
        sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sf.format(d);
    }
}
