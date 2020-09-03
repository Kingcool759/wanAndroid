package com.example.wanandroid.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wanandroid.R;


/**
 * @data on 2020/9/1 10:56 AM
 * @auther ArmStrong
 * @describe 装饰类：简单的Recylerview分割线,（高度+颜色）
 */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {
    //分割线
    private int dividerHeight;

    private int mOffsetMagin;

    //定制分割线颜色
    private Paint dividerPaint;


    public DividerItemDecoration(Context context) {

        dividerPaint = new Paint();
        dividerHeight = context.getResources().getDimensionPixelSize(R.dimen.divider_height);
        dividerPaint.setColor(context.getResources().getColor(R.color.dimgray));
        mOffsetMagin = (int) context.getResources().getDimension(R.dimen.divider_bottom);
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = dividerHeight+mOffsetMagin;
    }

    @Override
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.onDraw(c, parent, state);
        //画item的布局
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View view = parent.getChildAt(i);
            float startx = parent.getPaddingLeft()+mOffsetMagin;
            float starty = view.getBottom() + mOffsetMagin;
            float stopx = startx + view.getWidth()-2*mOffsetMagin;
            float stopy = view.getBottom() + mOffsetMagin;
            c.drawLine(startx,starty,stopx,stopy, dividerPaint);
        }
    }
}
