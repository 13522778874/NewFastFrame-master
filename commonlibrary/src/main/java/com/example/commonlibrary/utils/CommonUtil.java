package com.example.commonlibrary.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: CommonUtil
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class CommonUtil {
    public static String getTime(long time,String format){
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(format);
        return simpleDateFormat.format(new Date(time));
    }

}
