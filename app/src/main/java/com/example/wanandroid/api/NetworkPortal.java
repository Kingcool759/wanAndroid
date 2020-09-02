package com.example.wanandroid.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @data on 2020/9/2 4:46 PM
 * @auther
 * @describe  //处理网络请求
 */
public class NetworkPortal {
    //网络请求
    private Retrofit retrofit;

    private static NetworkPortal mInstance;

    private static Gson mGson;

    //单例模式
    public static NetworkPortal getInstance() {
        if (null == mInstance) {
            mInstance = new NetworkPortal();
        }
        return mInstance;
    }


    private NetworkPortal() {
        mGson = new GsonBuilder()
                .create();
        OkHttpClient.Builder builder = getDefaultBuilder();
        builder.retryOnConnectionFailure(false);
        retrofit = new Retrofit.Builder()
                .baseUrl(AppApi.BaseURL)
                .client(builder.build())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .addConverterFactory(GsonConverterFactory.create(mGson))
                .build();
    }

    private OkHttpClient.Builder getDefaultBuilder() {
        // 创建一个OkHttpClient
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.hostnameVerifier(createHostnameVerifier());
        builder.sslSocketFactory(createSSlSocket(), new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

            }

            @Override
            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        });
        return builder;
    }

    private Retrofit buildRetrofit(String url) {
        OkHttpClient.Builder builder = getDefaultBuilder();
        builder.retryOnConnectionFailure(false);
        return new Retrofit.Builder()
                .baseUrl(url)
                .client(builder.build())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .addConverterFactory(GsonConverterFactory.create(mGson))
                .build();
    }

    /**
     * @return 指定service实例
     */
    public static <T> T getService(Class<T> clazz) {
        return getService(clazz, "");
    }

    /**
     * @return 指定service实例
     */
    public static <T> T getService(Class<T> clazz, String baseURL) {
        T service = null;
        if (baseURL.isEmpty()) {
            service = NetworkPortal.getInstance().buildRetrofit(AppApi.BaseURL).create(clazz);
        }
        return service;
    }

    //抓包用，Https(默认只能抓到http,所以需要用代码设置)
    private HostnameVerifier createHostnameVerifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String s, SSLSession sslSession) {
                return true;
            }
        };
    }

    private SSLSocketFactory createSSlSocket() {
        SSLContext ssl = null;
        try {
            ssl = SSLContext.getInstance("SSL");
            ssl.init(null, new TrustManager[]{new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                }

                @Override
                public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }}, new SecureRandom());
            return ssl.getSocketFactory();
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }
        return null;
    }
}
