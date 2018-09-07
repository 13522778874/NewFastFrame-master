package com.example.commonlibrary.baseadapter.foot;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.commonlibrary.baseadapter.SuperRecyclerView;

/**
 * @ClassName: OnLoadMoreScrollListener
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public abstract class OnLoadMoreScrollListener extends RecyclerView.OnScrollListener {

    @Override
    public void onScrolled(final RecyclerView recyclerView, int dx, int dy) {
    }

    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int result=1;
        if (recyclerView instanceof SuperRecyclerView) {
            SuperRecyclerView superRecyclerView= (SuperRecyclerView) recyclerView;
            result+=superRecyclerView.getHeaderContainer().getChildCount();
        }
        int visibleItemCount = layoutManager.getChildCount();
        boolean triggerCondition = visibleItemCount > result
                && newState == RecyclerView.SCROLL_STATE_IDLE
                && canTriggerLoadMore(recyclerView);
        if (triggerCondition) {
            onLoadMore(recyclerView);
        }
    }

    public boolean canTriggerLoadMore(RecyclerView recyclerView) {
        View lastChild = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        int position = recyclerView.getChildLayoutPosition(lastChild);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int totalItemCount = layoutManager.getItemCount();
        return totalItemCount - 1 == position;
    }

    public abstract void onLoadMore(RecyclerView recyclerView);
}
