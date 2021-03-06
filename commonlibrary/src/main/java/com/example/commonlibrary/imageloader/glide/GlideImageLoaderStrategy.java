package com.example.commonlibrary.imageloader.glide;

import android.content.Context;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.commonlibrary.imageloader.base.BaseImageLoaderStrategy;

/**
 * @ClassName: GlideImageLoaderStrategy
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class GlideImageLoaderStrategy implements BaseImageLoaderStrategy<GlideImageLoaderConfig> {
    @Override
    public void loadImage(Context context, GlideImageLoaderConfig config) {
        if (config == null || context == null) {
            return;
        }
        DrawableRequestBuilder drawableRequestBuilder;
        drawableRequestBuilder = Glide.with(context).load(config.getUrl())
                .crossFade().centerCrop();
        switch (config.getCacheStrategy()) {
            case GlideImageLoaderConfig.CACHE_ALL:
                drawableRequestBuilder.diskCacheStrategy(DiskCacheStrategy.ALL);
                break;
            case GlideImageLoaderConfig.CACHE_NONE:
                drawableRequestBuilder.diskCacheStrategy(DiskCacheStrategy.NONE);
                break;
            case GlideImageLoaderConfig.CACHE_SOURCE:
                drawableRequestBuilder.diskCacheStrategy(DiskCacheStrategy.SOURCE);
                break;
            case GlideImageLoaderConfig.CACHE_RESULT:
                drawableRequestBuilder.diskCacheStrategy(DiskCacheStrategy.RESULT);
                break;
        }
        if (config.isCenterInside()) {
            drawableRequestBuilder.fitCenter();
        }else {
            drawableRequestBuilder.centerCrop();
        }
        if (config.getBitmapTransformation() != null) {
            drawableRequestBuilder.bitmapTransform(config.getBitmapTransformation());
        }
        if (config.getErrorResId() != 0) {
            drawableRequestBuilder.error(config.getErrorResId());
        }
        if (config.getPlaceHolderResId() != 0) {
            drawableRequestBuilder.placeholder(config.getPlaceHolderResId());
        }
        drawableRequestBuilder.into(config.getImageView());
    }
}
