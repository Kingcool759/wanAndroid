package com.example.wanandroid.adapter;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wanandroid.R;
import com.example.wanandroid.databean.HomeListRes;
import com.example.wanandroid.utils.DateUtil;

import java.util.List;

/**
 * @data on 2020/9/2 4:01 PM
 * @auther
 * @describe
 */
public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.MyViewHolder> {
    private List<HomeListRes.DataBean.DatasBean> datalist;
    //点击事件
    private BannerDataListener mBannerDataListener;

    public HomeListAdapter(List<HomeListRes.DataBean.DatasBean> dataList) {
        this.datalist = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_list,parent,false);
        final HomeListAdapter.MyViewHolder holder = new HomeListAdapter.MyViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeListRes.DataBean.DatasBean dataBean = datalist.get(position);
        holder.title.setText(Html.fromHtml(dataBean.getTitle()));
        holder.tvShareUser.setText(dataBean.getShareUser());

        //时间戳转成String类型
        DateUtil dateUtil = new DateUtil();
        holder.tvDate.setText(dateUtil.getDateToString(dataBean.getShareDate()));

//        holder.tvTime.setText(dataBean.getNiceShareDate());  //几天前
        holder.tvSuperChapterName.setText(dataBean.getSuperChapterName());
        holder.tvChapterName.setText(dataBean.getChapterName());
//        //点击事件处理-关注
//        holder.ivRedHeart.setOnClickListener((View)->{
//
//            holder.ivRedHeart.setImageResource(R.drawable.heart_gray_selector);
//        });
        //点击事件处理
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBannerDataListener.getBannerData(datalist.get(position).getTitle(), datalist.get(position).getLink());
            }
        });

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //分享者
        private TextView tvShareUser;
        //日期
        private TextView tvDate;
        //时间
        private TextView tvTime;
        //标题
        private TextView title;
        //类型
        private TextView tvSuperChapterName;
        //具体
        private TextView tvChapterName;

        //关注
        private ImageView ivRedHeart;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvShareUser = itemView.findViewById(R.id.tv_share_user);
            tvDate = itemView.findViewById(R.id.tv_share_date);
            tvTime = itemView.findViewById(R.id.tv_share_date_time);
            title = itemView.findViewById(R.id.tv_home_item_title);
            tvSuperChapterName = itemView.findViewById(R.id.tv_super_chapterName);
            tvChapterName = itemView.findViewById(R.id.tv_chapterName);
            ivRedHeart = itemView.findViewById(R.id.iv_red_heart);
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
