package com.example.commonlibrary.skin.attr;

import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;

import com.example.commonlibrary.skin.SkinManager;
import com.example.commonlibrary.utils.CommonLogger;

/**
 * @ClassName: ThumbAttr
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class ThumbAttr extends SkinAttr {

    @Override
    public void apply(View view) {
        if (isDrawableType()) {
            if (view instanceof SeekBar) {
                ((SeekBar) view).setThumb(SkinManager.getInstance().getDrawable(getResId()));
            }
        }
    }
}
