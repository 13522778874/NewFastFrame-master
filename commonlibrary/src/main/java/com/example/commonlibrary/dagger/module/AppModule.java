package com.example.commonlibrary.dagger.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @ClassName: AppModule
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
@Module
public class AppModule {


    private Application application;


    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    public Application getApplication() {
        return application;
    }



    @Singleton
    @Provides
    public Gson provideGson(Application application, GlobalConfigModule.GsonConfig gsonConfig) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        if (gsonConfig != null) {
            gsonConfig.config(application, gsonBuilder);
        }
        return gsonBuilder.create();
    }



    @Singleton
    @Provides
    public SharedPreferences provideSharedPreferences(Application application){
       return application.getSharedPreferences("common", Context.MODE_PRIVATE);
    }


    @Singleton
    @Provides
    public Bundle getBundle() {
        return new Bundle();
    }
}
