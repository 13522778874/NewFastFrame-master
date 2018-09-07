package com.example.commonlibrary.net.upload;

/**
 * @ClassName: UpLoadProgressListener
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public interface UpLoadProgressListener {

    public void onUpdate(long hasUpLoadSize, long totalUpLoadSize);

}
