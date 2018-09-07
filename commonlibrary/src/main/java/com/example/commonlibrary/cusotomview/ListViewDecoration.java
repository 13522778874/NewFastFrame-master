package com.example.commonlibrary.cusotomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.commonlibrary.R;
import com.example.commonlibrary.skin.SkinManager;


/**
 * @ClassName: ListViewDecoration
 * @Description: (recyclerview的分隔线)
 * @author sunweixing
 * @date 2018-09-07
 */
public class ListViewDecoration extends RecyclerView.ItemDecoration {
    private Drawable divider;

    public ListViewDecoration(Context context) {
        divider = SkinManager.getInstance().getDrawable(R.drawable.recycler_divider);
    }


    public ListViewDecoration(){
        divider = SkinManager.getInstance().getDrawable(R.drawable.recycler_divider);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int count = parent.getChildCount();
        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();
        View child = null;
        for (int i = 0; i < count; i++) {
            if (count == 1) {
                break;
            }
            child = parent.getChildAt(i);
            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
            int top = child.getBottom() + params.bottomMargin;
            int bottom = top + divider.getIntrinsicHeight();
            divider.setBounds(left, top, right, bottom);
            divider.draw(c);
        }
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.set(0, 0, 0, divider.getIntrinsicHeight());
    }
}
