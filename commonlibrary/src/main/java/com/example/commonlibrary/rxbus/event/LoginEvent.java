package com.example.commonlibrary.rxbus.event;

/**
 * @ClassName: LoginEvent
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class LoginEvent {
    private boolean isSuccess=false;
    private UserInfoEvent userInfoEvent;
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public UserInfoEvent getUserInfoEvent() {
        return userInfoEvent;
    }

    public void setUserInfoEvent(UserInfoEvent userInfoEvent) {
        this.userInfoEvent = userInfoEvent;
    }
}
