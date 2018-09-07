package com.example.music;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName: GuideAdapter
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class GuideAdapter extends PagerAdapter {


    private List<View> viewList;



    public GuideAdapter(List<View> viewList){
        if (viewList == null) {
            this.viewList=new ArrayList<>();
        }else {
            this.viewList=viewList;
        }
    }




    @Override
    public int getCount() {
        return viewList.size();
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(viewList.get(position));
        return viewList.get(position);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(((View) object));
    }
}
