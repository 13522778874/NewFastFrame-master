package com.example.commonlibrary.net.download;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * @ClassName: DownLoadApi
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public interface DownLoadApi {
    @Streaming
    @GET
    public Observable<ResponseBody>   downLoad(@Header("RANGE") String start, @Url String url);

}
