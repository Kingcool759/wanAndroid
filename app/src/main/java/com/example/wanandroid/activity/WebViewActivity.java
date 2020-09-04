package com.example.wanandroid.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;

import com.example.wanandroid.R;
import com.example.wanandroid.databinding.ActivityWebViewBinding;
import com.hjq.bar.OnTitleBarListener;
import com.hjq.toast.ToastUtils;

public class WebViewActivity extends AppCompatActivity {
    private ActivityWebViewBinding binding;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_web_view);

        Intent intent = getIntent();
        //接收数据-from：Fragment
        String bannerTitle = intent.getStringExtra("bannertitle");
        String bannerLinkUrl = intent.getStringExtra("bannerLinkUrl");
        //设置webViewTitle
        binding.webViewTitleBar.setTitle(bannerTitle);

        binding.webViewTitleBar.setOnTitleBarListener(new OnTitleBarListener() {
            @Override
            public void onLeftClick(View v) {
                //goback
            }

            @Override
            public void onTitleClick(View v) {
                //转动标题
            }

            @Override
            public void onRightClick(View v) {
                //关注
                ToastUtils.show("关注");
                binding.webViewTitleBar.setRightIcon(R.mipmap.heart_select);
            }
        });

        //设置WebView
        binding.webView.getSettings().setJavaScriptEnabled(true);
        binding.webView.setWebChromeClient(new WebChromeClient());
//        webView.setWebViewClient(new WebViewClient());
        binding.webView.loadUrl(bannerLinkUrl);
    }
}

