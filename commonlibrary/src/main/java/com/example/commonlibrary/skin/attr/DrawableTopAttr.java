package com.example.commonlibrary.skin.attr;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.commonlibrary.skin.SkinManager;

/**
 * @ClassName: DrawableTopAttr
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class DrawableTopAttr extends SkinAttr {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void apply(View view) {
        if (isDrawableType()&&view instanceof RadioButton) {
            ((RadioButton) view).setCompoundDrawablesRelativeWithIntrinsicBounds
                    (null, SkinManager.getInstance().getDrawable(getResId()), null, null);
        }
    }
}
