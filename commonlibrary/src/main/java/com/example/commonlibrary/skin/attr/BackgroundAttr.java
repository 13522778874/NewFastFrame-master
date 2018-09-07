package com.example.commonlibrary.skin.attr;

import android.view.View;
import android.widget.SeekBar;

import com.example.commonlibrary.utils.CommonLogger;

/**
 * @ClassName: BackgroundAttr
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class BackgroundAttr extends SkinAttr {
    @Override
    public void apply(View view) {
        if (view instanceof SeekBar) {
            CommonLogger.e("这里seekbar");
            return;
        }
        if (isColorType()) {
            applyBackgroundColor(view);
        } else if (isDrawableType()) {
            applyBackgroundDrawable(view);
        }
    }
}
