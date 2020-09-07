package com.example.wanandroid.app;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

/**
 * @data on 2020/9/7 5:59 PM
 * @auther
 * @describe
 */
public class WanAdroidApplication extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}
