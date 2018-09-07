package com.example.commonlibrary.imageloader.base;

import android.content.Context;

/**
 * @ClassName: BaseImageLoaderStrategy
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public interface BaseImageLoaderStrategy<T extends BaseImageLoaderConfig> {
    public void loadImage(Context context, T config);
}
