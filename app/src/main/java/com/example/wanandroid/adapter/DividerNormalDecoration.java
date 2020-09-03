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
 * @data on 2020/9/3 5:09 PM
 * @auther
 * @describe  标准版分割线装饰
 */
public class DividerNormalDecoration extends RecyclerView.ItemDecoration {
    //分割线
    private int dividerHeight;
    //两边间距设置
    private int maginleftorRight;
    //定制分割线颜色
    private Paint dividerPaint;


    public DividerNormalDecoration(Context context) {

        dividerPaint = new Paint();
        dividerHeight = context.getResources().getDimensionPixelSize(R.dimen.divider_height);
        dividerPaint.setColor(context.getResources().getColor(R.color.dimgray));  //暗灰色
        maginleftorRight = context.getResources().getDimensionPixelSize(R.dimen.divider_magin);
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = dividerHeight;
    }

    @Override
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.onDraw(c, parent, state);
        //画item的布局
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {  //最后一个也设置线，不要则 childCount-1
            View view = parent.getChildAt(i);
            float startx = parent.getPaddingLeft()+maginleftorRight;
            float starty = view.getBottom();
            float stopx = startx + view.getWidth()-2*maginleftorRight;
            float stopy = view.getBottom();
            c.drawLine(startx,starty,stopx,stopy, dividerPaint);
        }
    }
}
