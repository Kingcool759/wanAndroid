package com.example.wanandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wanandroid.R;
import com.example.wanandroid.databean.AnswerListRes;
import com.example.wanandroid.databean.HomeListRes;
import com.example.wanandroid.utils.DateUtil;

import java.util.List;

/**
 * @data on 2020/9/3 3:36 PM
 * @auther
 * @describe
 */
public class AnswerListAdapter extends RecyclerView.Adapter<AnswerListAdapter.MyViewHolder> {
    private List<AnswerListRes.DataBean.DatasBean> datalist;
    //点击事件
    private BannerDataListener mBannerDataListener;

    public AnswerListAdapter(List<AnswerListRes.DataBean.DatasBean> dataList) {
        this.datalist = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_answer_list_item,parent,false);
        final AnswerListAdapter.MyViewHolder holder = new AnswerListAdapter.MyViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        AnswerListRes.DataBean.DatasBean dataBean = datalist.get(position);
        holder.title.setText(dataBean.getTitle());
        holder.author.setText(dataBean.getAuthor());
        holder.link.setText(dataBean.getLink());

        //时间戳转成String类型
        DateUtil dateUtil = new DateUtil();
        holder.tvDate.setText(dateUtil.getDateToString(dataBean.getShareDate()));

        holder.tvSuperChapterName.setText(dataBean.getSuperChapterName());
        holder.tvChapterName.setText(dataBean.getChapterName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBannerDataListener.getBannerData(datalist.get(position).getTitle(),datalist.get(position).getLink());
            }
        });
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //作者
        private TextView author;
        //日期+时间
        private TextView tvDate;
        //标题
        private TextView title;
        //链接
        private TextView link;
        //类型
        private TextView tvSuperChapterName;
        //具体
        private TextView tvChapterName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.tv_answer_author);
            tvDate = itemView.findViewById(R.id.tv_answer_share_date);
            title = itemView.findViewById(R.id.tv_answer_title);
            link = itemView.findViewById(R.id.tv_answer_link);
            tvSuperChapterName = itemView.findViewById(R.id.tv_answer_super_chapterName);
            tvChapterName = itemView.findViewById(R.id.tv_answer_chapterName);
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
