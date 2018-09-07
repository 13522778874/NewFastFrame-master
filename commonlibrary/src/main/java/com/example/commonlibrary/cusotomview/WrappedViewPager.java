package com.example.commonlibrary.cusotomview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.example.commonlibrary.utils.CommonLogger;

/**
 * @ClassName: WrappedViewPager
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class WrappedViewPager extends ViewPager {
    public WrappedViewPager(Context context) {
        super(context);
    }

    public WrappedViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        try {
            return super.onTouchEvent(ev);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        try {
            if (ev.getAction() == MotionEvent.ACTION_MOVE) {
                CommonLogger.e("move");
            }
            return super.onInterceptTouchEvent(ev);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return true;
    }
}
