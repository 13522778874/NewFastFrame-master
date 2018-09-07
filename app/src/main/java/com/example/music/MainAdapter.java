package com.example.music;

import android.animation.Animator;
import android.animation.ObjectAnimator;

import com.example.commonlibrary.baseadapter.adapter.BaseRecyclerAdapter;
import com.example.commonlibrary.baseadapter.viewholder.BaseWrappedViewHolder;

/**
 * @ClassName: MainAdapter
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class MainAdapter extends BaseRecyclerAdapter<MainItemBean,BaseWrappedViewHolder>{
    @Override
    protected int getLayoutId() {
        return R.layout.item_activity_main;
    }

    @Override
    protected void convert(BaseWrappedViewHolder holder, MainItemBean data) {
        holder.setText(R.id.tv_item_activity_main_name,data.getName())
                .setImageResource(R.id.iv_item_main_activity_image,data.getResId())
                .setOnItemClickListener();
    }


    @Override
    protected Animator[] getItemAnimator(BaseWrappedViewHolder holder) {
        if (holder.getAdapterPosition() % 2 == 0) {
            return new Animator[]{ObjectAnimator.ofFloat(holder.itemView,"translationX",holder.itemView.getLeft()+holder.itemView.getWidth(),0)};
        }else {
            return new Animator[]{ObjectAnimator.ofFloat(holder.itemView,"translationX",holder.itemView.getWidth(),0)};
        }
    }
}
