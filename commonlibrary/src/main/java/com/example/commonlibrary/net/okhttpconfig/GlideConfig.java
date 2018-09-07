package com.example.commonlibrary.net.okhttpconfig;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.GlideModule;
import com.example.commonlibrary.BaseApplication;
import com.example.commonlibrary.utils.CommonLogger;

import java.io.InputStream;

/**
 * @ClassName: GlideConfig
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class GlideConfig implements GlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        CommonLogger.e("applyOptions");
    }

    @Override
    public void registerComponents(Context context, Glide glide) {
        CommonLogger.e("registerComponents");
        glide.register(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(BaseApplication.getAppComponent().getOkHttpClient()));
    }
}
