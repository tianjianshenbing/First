package com.example.util;

import java.util.Random;
/**
 * @author : xianzhiyong
 * @Date: 2020/3/22
 * @Description : 自动生成数组
 */
public class RandomCreateArr {
    public static int[] createArr(Integer len ,Integer scope){
        if(len == null || scope == null){
            int[] arrTemp = {0,1,2,3,4,5,6,7,8,9};
            return arrTemp;
        }
        int[] arr = new int[len];
        Random rand =new Random();
        for ( int j = 0; j <=len-1 ; j++) {
            arr[j] =rand.nextInt(scope);
        }
        return  arr;
    }
}
