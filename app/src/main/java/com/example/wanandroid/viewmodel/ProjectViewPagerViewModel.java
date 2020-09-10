package com.example.wanandroid.viewmodel;

import android.text.Html;
import android.util.Log;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.ViewModel;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.wanandroid.BR;
import com.example.wanandroid.R;
import com.example.wanandroid.api.ApiCallback;
import com.example.wanandroid.api.AppApiService;
import com.example.wanandroid.api.NetworkPortal;
import com.example.wanandroid.arouter.ARouterManager;
import com.example.wanandroid.databean.ProjectDataListRes;
import com.example.wanandroid.databean.PublicDataListRes;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import retrofit2.Call;
import retrofit2.Response;

/**
 * @data on 2020/9/8 9:29 AM
 * @auther
 * @describe
 */
public class ProjectViewPagerViewModel extends ViewModel {
    private String mId;

    public ProjectViewPagerViewModel(String id) {
        mId = id;
        Log.d("id ====>",mId);
    }

    //使用itemBinding填充RecyclerView,避免了创建RecyclerViewAdapter(内部自动创建和绑定RecyclerViewAdapter)
    public ObservableList<ProjectDataListRes.DataBean.DatasBean> items = new ObservableArrayList<>();
    public ItemBinding<ProjectDataListRes.DataBean.DatasBean> itemBinding = ItemBinding.<ProjectDataListRes.DataBean.DatasBean>of(BR.item, R.layout.item_project_list)
            .bindExtra(BR.viewModel, this);

    /**
     * 获取项目数据列表
     */
    public void getProjectTitleDataList() {
        NetworkPortal.getService(AppApiService.class).getProjectDataList(mId).enqueue(new ApiCallback<ProjectDataListRes>() {
            @Override
            public void onSuccessful(Call<ProjectDataListRes> call, Response<ProjectDataListRes> response) {
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
     *  进入项目列表详情
     *
     */
    public void onItemClick(ProjectDataListRes.DataBean.DatasBean item){
        ARouter.getInstance().build(ARouterManager.WEBVIEW_DETAILS)
                .withString("title", String.valueOf(Html.fromHtml(item.getTitle())))
                .withString("link",item.getLink())
                .navigation();
    }
}
