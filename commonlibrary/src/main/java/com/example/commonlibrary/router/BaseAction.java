package com.example.commonlibrary.router;

/**
 * @ClassName: BaseAction
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public abstract class BaseAction {

    public abstract RouterResult invoke(RouterRequest routerRequest);

}
