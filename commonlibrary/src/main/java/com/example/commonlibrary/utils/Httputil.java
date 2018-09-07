package com.example.commonlibrary.utils;

import com.example.commonlibrary.BaseApplication;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @ClassName: Httputil
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class Httputil {

    private static OkHttpClient okHttpClient = BaseApplication.getAppComponent().getOkHttpClient();


    public static String getContent(String url) {
        try {
            CommonLogger.e("地址1" + url);
            Request request = new Request.Builder().url(url).build();
            CommonLogger.e("地址啦12");
            Response response = okHttpClient.newCall(request).execute();
            if (response.isSuccessful()) {
                CommonLogger.e("成功啦12");
                String content = response.body().string();
                CommonLogger.e("21content:" + content);
                return content;
            } else {
                CommonLogger.e("2没有成功啦");
            }
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            CommonLogger.e("获取内容出错" + e.getMessage());
        }
        return null;
    }


}
