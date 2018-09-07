package com.example.commonlibrary.net;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @ClassName: OkHttpGlobalHandler
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public interface OkHttpGlobalHandler {


    public Response onResultResponse(String printResult, Interceptor.Chain chain, Response response);

    public Request onRequestBefore(Interceptor.Chain chain, Request request);


    //    内部实现一个默认的中断处理handler
    public static OkHttpGlobalHandler DEFAULT_HANDLER = new OkHttpGlobalHandler() {
        @Override
        public Response onResultResponse(String printResult, Interceptor.Chain chain, Response response) {
            return response;
        }

        @Override
        public Request onRequestBefore(Interceptor.Chain chain, Request request) {
            return request;
        }
    };


}
