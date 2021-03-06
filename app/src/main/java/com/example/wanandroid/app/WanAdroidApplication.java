package com.example.wanandroid.app;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @data on 2020/9/7 5:59 PM
 * @auther
 * @describe  //解决项目 类+方法数>65536 的bug问题
 */
public class WanAdroidApplication extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        ARouter.init(this);
    }
}
