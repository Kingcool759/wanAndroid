package com.example.wanandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wanandroid.R;
import com.example.wanandroid.databean.NavigationDataListRes;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.List;

/**
 * @data on 2020/9/8 4:23 PM
 * @auther
 * @describe  体系-导航
 */

public class NavigationListAdapter extends RecyclerView.Adapter<NavigationListAdapter.MyViewHolder> {

    private List<NavigationDataListRes.DataBean> dataBeanList;
    private Context mContext;

    public NavigationListAdapter(List<NavigationDataListRes.DataBean> dataBeanList, Context context) {
        this.dataBeanList = dataBeanList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.navigatino_recycler_item, parent, false);
        final NavigationListAdapter.MyViewHolder holder = new NavigationListAdapter.MyViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NavigationListAdapter.MyViewHolder holder, int position) {
        NavigationDataListRes.DataBean dataBean = dataBeanList.get(position);

        holder.itemTitle.setText(dataBean.getName());  //使用dataBean.getArticles.get(position).getchapterName() 会产生数组越界，因为name和chapterName值相同，但json结构不同。
        holder.itemFlowlayout.setAdapter(new TagAdapter<NavigationDataListRes.DataBean.ArticlesBean>(dataBean.getArticles()) {
            @Override
            public View getView(FlowLayout parent, int position, NavigationDataListRes.DataBean.ArticlesBean s) {
                TextView tv = (TextView) LayoutInflater.from(mContext).inflate(R.layout.flow_tv_content,
                        holder.itemFlowlayout, false);
                tv.setText(s.getTitle());
                //点击事件被拦截不可用，只能用holder.itemFlowlayout.setOnTagClickListener做每个textview的点击事件处理
                // tv.setOnClickListener(new View.OnClickListener() {}
                return tv;
            }
        });
        //TagFlowLayout流式布局每个控件的点击事件处理
        holder.itemFlowlayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                Toast.makeText(mContext, dataBean.getArticles().get(position).getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataBeanList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //title
        private TextView itemTitle;

        //flowlayout
        private TagFlowLayout itemFlowlayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.navigation_recycler_item_title);
            itemFlowlayout = itemView.findViewById(R.id.navigation_recycler_item_tagflowlayout);
        }
    }
}
