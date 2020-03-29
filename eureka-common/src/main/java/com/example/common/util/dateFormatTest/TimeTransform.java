package com.example.common.util.dateFormatTest;

import java.util.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author : xianzhiyong
 * @Date: 2020/3/27
 * @Description : 字符串 转 time 类型
 */
public class TimeTransform {
    public static void main(String[] args) {
        String timestr = "00:35:56";
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        try {
            Date time = sdf.parse(timestr);
            Time timesql = new Time(time.getTime());
            System.out.println(timesql);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date = new Date();
        System.out.println(date);
    }
}
