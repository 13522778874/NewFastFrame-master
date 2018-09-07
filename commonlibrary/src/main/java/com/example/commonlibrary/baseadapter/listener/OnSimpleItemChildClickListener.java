package com.example.commonlibrary.baseadapter.listener;

import android.view.View;

import com.example.commonlibrary.baseadapter.adapter.BaseRecyclerAdapter;

/**
 * @ClassName: OnSimpleItemChildClickListener
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public abstract class OnSimpleItemChildClickListener implements BaseRecyclerAdapter.OnItemClickListener {
    @Override
    public void onItemClick(int position, View view) {

    }

    @Override
    public boolean onItemLongClick(int position, View view) {
        return false;
    }

    @Override
    public boolean onItemChildLongClick(int position, View view, int id) {
        return false;
    }


}
