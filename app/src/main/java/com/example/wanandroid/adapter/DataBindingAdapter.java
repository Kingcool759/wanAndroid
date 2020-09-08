package com.example.wanandroid.adapter;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.example.wanandroid.R;

/**
 * @data on 2020/9/8 10:53 AM
 * @auther
 * @describe  //项目的xml文件的自定义属性集合
 */
public class DataBindingAdapter {
    @BindingAdapter(value = "exImageUrl", requireAll = false)
    public static void setUrl(ImageView imageView, String url) {
        if (url != null) {
            Glide.with(imageView).load(url).into(imageView);
        }
    }
}
