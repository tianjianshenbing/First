package com.example.common.util.dateFormatTest;

import com.example.common.util.RandomCreateArr;
import com.example.common.util.sort.BubbleSort;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : xianzhiyong
 * @Date: 2020/3/27
 * @Description : 算时间差
 */
public class TransformDate {

    public static void main(String[] args) {

        Date start = new Date();
        System.out.println("开始时间: " + start);
        //之前的工具类
        for (int i = 0 ; i < 100 ; i++){
            int[] arr = RandomCreateArr.createArr(10000,1000);
            int[] resilt = BubbleSort.bubbleSort(arr);
            int sum = 0;
            for (int a: resilt) {
                sum = sum + a;
            }
            //System.out.println("总合为: " + sum);
        }

        Date end = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:s");
        System.out.println("结束时间: " + end);
        long startT = start.getTime();
        long endT = end.getTime();
        long runT = endT - startT;
        //时间差  *************************************
        Time run = new Time(runT-(long)(3600000*8));
        System.out.println("运行时间: "+ run);

    }
}
