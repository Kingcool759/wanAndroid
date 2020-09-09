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
import com.example.wanandroid.databean.SystemDataListRes;
import com.hjq.toast.ToastUtils;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * @data on 2020/9/8 4:23 PM
 * @auther
 * @describe  体系-体系
 */
public class SystemListAdapter extends RecyclerView.Adapter<SystemListAdapter.MyViewHolder> {
    private List<SystemDataListRes.DataBean> dataBeanList;
    private Context mContext;

    public SystemListAdapter(List<SystemDataListRes.DataBean> dataBeanList, Context context) {
        this.dataBeanList = dataBeanList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.system_recycler_item, parent, false);
        final SystemListAdapter.MyViewHolder holder = new SystemListAdapter.MyViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SystemListAdapter.MyViewHolder holder, int position) {
        SystemDataListRes.DataBean dataBean = dataBeanList.get(position);

        holder.itemTitle.setText(dataBean.getName());
        holder.itemFlowlayout.setAdapter(new TagAdapter<SystemDataListRes.DataBean.ChildrenBean>(dataBean.getChildren()) {
            @Override
            public View getView(FlowLayout parent, int position, SystemDataListRes.DataBean.ChildrenBean s) {
                TextView tv = (TextView) LayoutInflater.from(mContext).inflate(R.layout.flow_tv_content,
                        holder.itemFlowlayout, false);
                tv.setText(s.getName());
                //点击事件被拦截不可用，只能用holder.itemFlowlayout.setOnTagClickListener做每个textview的点击事件处理
                // tv.setOnClickListener(new View.OnClickListener() {}
                return tv;
            }
        });
        //TagFlowLayout流式布局每个控件的点击事件处理
        holder.itemFlowlayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                Toast.makeText(mContext, dataBean.getChildren().get(position).getName(), Toast.LENGTH_SHORT).show();
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
            itemTitle = itemView.findViewById(R.id.system_recycler_item_title);
            itemFlowlayout = itemView.findViewById(R.id.system_recycler_item_tagflowlayout);
        }
    }
}
