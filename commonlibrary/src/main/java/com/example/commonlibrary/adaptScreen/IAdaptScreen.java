package com.example.commonlibrary.adaptScreen;

/**
 * @ClassName: IAdaptScreen
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public interface IAdaptScreen {
    public boolean isBaseOnWidth();
    public int getScreenSize();
    public boolean cancelAdapt();
}
