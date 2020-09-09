package com.example.wanandroid.viewmodel;

import android.util.Log;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.wanandroid.BR;
import com.example.wanandroid.R;
import com.example.wanandroid.api.ApiCallback;
import com.example.wanandroid.api.AppApiService;
import com.example.wanandroid.api.NetworkPortal;
import com.example.wanandroid.arouter.ARouterManager;
import com.example.wanandroid.databean.PublicDataListRes;
import com.hjq.toast.ToastUtils;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import retrofit2.Call;
import retrofit2.Response;

public class PublicViewPagerViewModel extends ViewModel {

    private String mId;

    public PublicViewPagerViewModel(String id) {
        mId = id;
    }

    //使用itemBinding填充RecyclerView,避免了创建RecyclerViewAdapter(内部自动创建和绑定RecyclerViewAdapter)
    public ObservableList<PublicDataListRes.DataBean.DatasBean> items = new ObservableArrayList<>();
    public ItemBinding<PublicDataListRes.DataBean.DatasBean> itemBinding = ItemBinding.<PublicDataListRes.DataBean.DatasBean>of(BR.item, R.layout.item_public_list)
            .bindExtra(BR.viewModel, this);

    /**
     * 获取公众号数据列表
     */
    public void getPublicTitleDataList() {
        NetworkPortal.getService(AppApiService.class).getPublicDataList(mId).enqueue(new ApiCallback<PublicDataListRes>() {
            @Override
            public void onSuccessful(Call<PublicDataListRes> call, Response<PublicDataListRes> response) {
                Log.d("onSuccessful", "请求成功了！");
                if (response == null || response.body() == null) {
                    return;
                }else {
                    for(int i=1;i<response.body().getData().getDatas().size();i++){
//                        mPublicDataList.setValue(response.body().getData().getDatas().get(i));
                        items.addAll(response.body().getData().getDatas());
                    }
                }
            }

            @Override
            public void onFail(String message) {
                Log.d("onFail", "啊哦～请求失败了！");
            }
        });
    }

    /**
     *  进入公众号列表详情
     *
     */
    public void onItemClick(PublicDataListRes.DataBean.DatasBean item){
        ARouter.getInstance().build(ARouterManager.WEBVIEW_DETAILS)
                .withString("title",item.getTitle())
                .withString("link",item.getLink())
                .navigation();
    }
}