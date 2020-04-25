package com.example.common.util.dateFormatTest;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRes {
    public static void main(String[] args) {
        String dstr = "23:45";
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            date= sdf.parse(dstr);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        Long time = date.getTime();
        System.out.println(dstr);
        Time timed = new Time(time);
        System.out.println(timed);
    }
}
