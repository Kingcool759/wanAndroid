package com.example.wanandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.wanandroid.R;
import com.example.wanandroid.bean.ImageUrl;
import com.example.wanandroid.databean.BannerListRes;

import java.util.List;

/**
 * @data on 2020/9/2 11:55 AM
 * @auther
 * @describe
 */
public class BannerRecyclerViewAdapter extends RecyclerView.Adapter<BannerRecyclerViewAdapter.MyViewHolder> {
    private Context context;
    private List<BannerListRes.DataBean> imageUrlList;
    //点击事件
    private BannerDataListener mBannerDataListener;

    public BannerRecyclerViewAdapter(Context context,List<BannerListRes.DataBean> imageUrlList) {
        this.imageUrlList = imageUrlList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner_item_image,parent,false);
        final MyViewHolder myViewHolder = new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.bannerImage.setImageResource(Integer.parseInt(horItem.getImgUrl()));   //本地图片的设置方式
        //Glide.with(mContext).load(dataBean.getList_photo()).into(holder.iv_img);   //网络图片样式
        BannerListRes.DataBean horItem = imageUrlList.get(position);
        Glide.with(context).load(horItem.getImagePath()).into(holder.bannerImage);
        //点击事件处理
        holder.itemView.setOnClickListener((View)-> {
            mBannerDataListener.getBannerData(imageUrlList.get(position).getTitle(),imageUrlList.get(position).getUrl());
        });
    }

    @Override
    public int getItemCount() {
        return imageUrlList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        //图片
        public ImageView bannerImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            bannerImage = itemView.findViewById(R.id.iv_banner_item_image);
        }
    }

    //回调事件
    public interface BannerDataListener{
        void getBannerData(String title, String link);
    }
    public void setBannerDataListener(BannerDataListener bannerDataListener) {
        mBannerDataListener = bannerDataListener;
    }
}
