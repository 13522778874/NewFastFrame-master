package com.example.commonlibrary.repository;

import org.greenrobot.greendao.AbstractDaoSession;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Retrofit;

/**
 * @ClassName: BaseRepositoryManager
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class BaseRepositoryManager<D extends AbstractDaoSession> implements IRepositoryManager<D> {
    protected Retrofit retrofit;
    private D daoSession;
    private Map<String, Object> stringRetrofitMap;

    public BaseRepositoryManager(Retrofit retrofit, D abstractDaoSession) {
        this.retrofit = retrofit;
        this.daoSession = abstractDaoSession;
        stringRetrofitMap = new HashMap<>();
    }

    @Override
    public <T> T getApi(Class<T> retrofitClass) {
        T result = null;
        if (stringRetrofitMap != null) {
            synchronized (stringRetrofitMap) {
                result = (T) stringRetrofitMap.get(retrofitClass.getName());
                if (result == null) {
                    result = retrofit.create(retrofitClass);
                    stringRetrofitMap.put(retrofitClass.getName(), result);
                }
            }
        }
        return result;
    }

    @Override
    public <T> void clearApi(Class<T> retrofitClass) {
        if (stringRetrofitMap != null) {
            synchronized (stringRetrofitMap) {
                if (stringRetrofitMap.containsKey(retrofitClass.getName())) {
                    stringRetrofitMap.remove(retrofitClass.getName());
                }
            }
        }
    }

    @Override
    public D getDaoSession() {
        return daoSession;
    }

    @Override
    public void clearAllCache() {
        if (stringRetrofitMap != null) {
            synchronized (stringRetrofitMap) {
                stringRetrofitMap.clear();
            }
        }

    }
}
