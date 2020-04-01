package com.example.common.util.dateFormatTest;

import java.sql.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(0-(long)8*3600*1000);
        long time  = t.getTime();
        System.out.println(t);
    }
}
