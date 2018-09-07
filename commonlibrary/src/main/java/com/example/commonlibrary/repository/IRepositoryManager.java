package com.example.commonlibrary.repository;


import org.greenrobot.greendao.AbstractDaoSession;

/**
 * @ClassName: IRepositoryManager
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public interface IRepositoryManager<D extends AbstractDaoSession> {
    <T> T getApi(Class<T> retrofitClass);


    <T> void clearApi(Class<T> retrofitClass);



    D getDaoSession();




    void clearAllCache();


//    DaoSession getDaoSession();



}
