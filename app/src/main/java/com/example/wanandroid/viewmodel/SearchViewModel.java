package com.example.wanandroid.viewmodel;

import android.util.Log;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.wanandroid.BR;
import com.example.wanandroid.R;
import com.example.wanandroid.api.ApiCallback;
import com.example.wanandroid.api.AppApiService;
import com.example.wanandroid.api.NetworkPortal;
import com.example.wanandroid.databean.ProjectDataListRes;
import com.example.wanandroid.databean.PublicDataListRes;
import com.example.wanandroid.databean.SearchArticleListRes;
import com.hjq.toast.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import retrofit2.Call;
import retrofit2.Response;

/**
 * @data on 2020/9/10 3:12 PM
 * @auther
 * @describe
 */
public class SearchViewModel extends ViewModel {

    public int pageId = 0;
    public MutableLiveData<String> key =  new MutableLiveData<>();
    public MutableLiveData<String> getKey() {
        return key;
    }

    //使用itemBinding填充RecyclerView,避免了创建RecyclerViewAdapter(内部自动创建和绑定RecyclerViewAdapter)
    //public ObservableList<SearchArticleListRes.DataBean.DatasBean> datas = new ObservableArrayList<>();   //直接监听数据源，RecyclerView更新数据源的时候会出现闪一闪问题，而采用LiveData则不会闪一闪。

    public MutableLiveData<List<SearchArticleListRes.DataBean.DatasBean>> items = new MutableLiveData<>();
    public ItemBinding<SearchArticleListRes.DataBean.DatasBean> itemBinding = ItemBinding.<SearchArticleListRes.DataBean.DatasBean>of(BR.item, R.layout.item_search_list)
            .bindExtra(BR.viewModel, this);

    /**
     *  按页码和关键字搜索文章
     */
    public void getSearchArticles() {
        String keykey = getKey().getValue().trim();  // 转一下类型
        Log.i("getSearchArticles: ",keykey+"");
       // if(!keykey.equals("")){
        NetworkPortal.getService(AppApiService.class).getSearchArticlesList(pageId,keykey).enqueue(new ApiCallback<SearchArticleListRes>() {
            @Override
            public void onSuccessful(Call<SearchArticleListRes> call, Response<SearchArticleListRes> response) {
                Log.d("onSuccessful", "请求成功了！");
                if (response == null || response.body() == null) {
                    return;
                }else {
                   // for(int i=1;i<response.body().getData().getDatas().size();i++){
//                        if (datas.size()>0){
//                            datas.clear();
//                        }
                        items.setValue(response.body().getData().getDatas());
                    //}
                }
            }

            @Override
            public void onFail(String message) {
                Log.d("onFail", "啊哦～请求失败了！");
            }
        });
//        }else {
//            ToastUtils.show("您输入的关键字为空，请重新输入！");
//        }
    }
}
