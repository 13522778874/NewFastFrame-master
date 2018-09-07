package com.example.commonlibrary.skin.attr;

import android.view.View;
import android.widget.TextView;

/**
 * @ClassName: TextColorAttr
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class TextColorAttr extends SkinAttr {
    @Override
    public void apply(View view) {
        if (isColorType() && view instanceof TextView) {
            applyTextColor(view);
        }
    }
}
