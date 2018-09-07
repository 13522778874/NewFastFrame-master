package com.example.commonlibrary.bean.music;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @ClassName: MusicHistoryInfo
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
@Entity
public class MusicHistoryInfo {
    @Id
    private int position;


    @Generated(hash = 1378218586)
    public MusicHistoryInfo(int position) {
        this.position = position;
    }

    @Generated(hash = 1087470908)
    public MusicHistoryInfo() {
    }


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


}
