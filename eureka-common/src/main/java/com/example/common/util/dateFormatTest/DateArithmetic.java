package com.example.common.util.dateFormatTest;

import java.util.Date;

public class DateArithmetic {
    public static void main(String[] args) {
        Date date1 = new Date();
        int sum = 0 ;
        for (int i = 0; i <100 ; i++) {
            sum = sum + i;
        }
        Date date2 = new Date();
        System.out.println(date2);
    }
}
