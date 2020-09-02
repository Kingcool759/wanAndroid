package com.example.wanandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wanandroid.R;
import com.example.wanandroid.databean.HomeListRes;

import java.util.List;

/**
 * @data on 2020/9/2 4:01 PM
 * @auther
 * @describe
 */
public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.MyViewHolder> {
    private List<HomeListRes.DataBean.DatasBean> datalist;

    public HomeListAdapter(List<HomeListRes.DataBean.DatasBean> dataList) {
        this.datalist = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home_list_item,parent,false);
        final HomeListAdapter.MyViewHolder holder = new HomeListAdapter.MyViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeListRes.DataBean.DatasBean dataBean = datalist.get(position);
        holder.title.setText(dataBean.getTitle());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        //标题
        private TextView title;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_home_item_title);
        }
    }
}
