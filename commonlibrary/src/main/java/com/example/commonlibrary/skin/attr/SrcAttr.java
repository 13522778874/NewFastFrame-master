package com.example.commonlibrary.skin.attr;

import android.view.View;
import android.widget.ImageView;

/**
 * @ClassName: SrcAttr
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class SrcAttr extends SkinAttr {
    @Override
    public void apply(View view) {
        if (isDrawableType() && view instanceof ImageView) {
            applyImageDrawable(view);
        }
    }
}
