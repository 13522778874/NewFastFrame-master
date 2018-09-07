package com.example.commonlibrary.rxbus.event;

/**
 * @ClassName: PwChangeEvent
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class PwChangeEvent {
    private String old;
    private String news;
    private boolean isSuccess;
    private String errorMsg;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "PwChangeEvent{" +
                "old='" + old + '\'' +
                ", news='" + news + '\'' +
                ", isSuccess=" + isSuccess +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
