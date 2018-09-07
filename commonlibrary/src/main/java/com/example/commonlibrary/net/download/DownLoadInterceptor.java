package com.example.commonlibrary.net.download;

import com.example.commonlibrary.net.download.DownloadProgressListener;
import com.example.commonlibrary.net.download.DownloadResponseBody;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * @ClassName: DownLoadInterceptor
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class DownLoadInterceptor implements Interceptor {
    private DownloadProgressListener listener;


    public DownLoadInterceptor(DownloadProgressListener listener) {
        this.listener = listener;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response = chain.proceed(chain.request());
        return response.newBuilder().body(new DownloadResponseBody(response.body(), listener)).build();
    }
}
