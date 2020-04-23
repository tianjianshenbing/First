package com.example.common.util.dateFormatTest;

import java.sql.Time;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(0-(long)8*3500*1000);
        long time  = t.getTime();
        System.out.println(t);
        System.out.println("*************************************");


        Date start = new Date();
        System.out.println(start);

        Date end = new Date(start.getTime()+time+(long)8*3600*1000  );

        System.out.println(end);
    }
}
