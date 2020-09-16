package com.example.wanandroid.popupwindow;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.wanandroid.R;

/**
 * @data on 2020/9/15 1:52 PM
 * @auther
 * @describe
 */
public class PhotoPopupWindow extends PopupWindow {
    Context mContext;
    PhotoDataListener mPhotoDataListener;
    int type = 0;


    public PhotoPopupWindow(Context context) {
        mContext = context;
        View contentView = LayoutInflater.from(context).inflate(R.layout.popup_select_layout, null);
        //封装成CommonPopupWindow类
        setContentView(contentView);
        setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setOutsideTouchable(true);
        // 收起时渐进恢复背景，从半透明-
        setOnDismissListener(new OnDismissListener() {
            @Override
            public void onDismiss() {
                ValueAnimator animator = ValueAnimator.ofFloat(0.5f, 1f).setDuration(500);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        setBackgroundAlpha((Float) animation.getAnimatedValue());
                    }
                });
                animator.start();
            }
        });
        show(contentView);  //展示的时候背景逐渐变暗

        //初始化控件
        TextView takePhoto = (TextView)contentView.findViewById(R.id.take_photo);
        TextView picture = (TextView)contentView.findViewById(R.id.picture);
        TextView cancel = (TextView)contentView.findViewById(R.id.cancel);

        takePhoto.setOnClickListener((View)->{
            Log.i("TestPopupWindow: ","拍照");
            type = 0;
            if(mPhotoDataListener != null){
                mPhotoDataListener.getTestData(type);
            }
            dismiss();
        });

        picture.setOnClickListener((View)->{
            Log.i("TestPopupWindow: ","相册");
            type = 1;
            if(mPhotoDataListener != null){
                mPhotoDataListener.getTestData(type);
            }
            dismiss();
        });
        cancel.setOnClickListener((View)->{
            Log.i("TestPopupWindow: ","取消");
            type = 2;
            if(mPhotoDataListener != null){
                mPhotoDataListener.getTestData(type);
            }
            dismiss();
        });
    }
    //回调事件接口
    public interface PhotoDataListener {
        void getTestData(int type);
    }

    public void setImageClickaListener(PhotoDataListener photoDataListener) {
        mPhotoDataListener = photoDataListener;
    }

    /**
     * 设置PopupWindow下面的内容的透明度
     */
    private void setBackgroundAlpha(float bgAlpha) {
        WindowManager.LayoutParams lp = ((Activity) mContext).getWindow().getAttributes();
        lp.alpha = bgAlpha;
        ((Activity) mContext).getWindow().setAttributes(lp);
    }
    /**
     * 显示弹窗，过程中伴随背景逐渐变暗。
     * 不要改变MaskLayout的背景色，否则会是灰色背景的框框整体向上升起的效果。
     */
    public void show(View parent) {
        ValueAnimator animator = ValueAnimator.ofFloat(1, 0.5f).setDuration(500);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                setBackgroundAlpha((Float) animation.getAnimatedValue());
            }
        });
        animator.start();
    }
}
