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

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.wanandroid.R;
import com.example.wanandroid.arouter.ARouterManager;
import com.example.wanandroid.databinding.ActivityWebViewBinding;
import com.hjq.bar.OnTitleBarListener;
import com.hjq.toast.ToastUtils;

@Route(path = "/wanandroid/webviewActivity")
public class WebViewActivity extends AppCompatActivity {
    private ActivityWebViewBinding binding;

    @Autowired(name = "title")   //获取ARouter传过来值需要使用的注解
    String bannerTitle;

    @Autowired(name = "link")
    String bannerLinkUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_web_view);

        //采用ARouter方式，接收公众号，体系，项目的数据
        ARouter.getInstance().inject(this);  //接收参数注解,相当于String bannerTitle = value;    (key,value)中的value,根据key获取

        /**
         *  设置webView
         */
        getWebView();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void getWebView() {
        //设置WebViewTitle标题
        binding.webViewTitleBar.setTitle(bannerTitle);
        binding.webViewTitleBar.setOnTitleBarListener(new OnTitleBarListener() {
            @Override
            public void onLeftClick(View v) {
                //goback
                finish();
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

        //设置WebView加载内容
        binding.webView.getSettings().setJavaScriptEnabled(true);
        binding.webView.setWebChromeClient(new WebChromeClient());
//        webView.setWebViewClient(new WebViewClient());
        binding.webView.loadUrl(bannerLinkUrl);
    }
}

