package com.example.common.util.stringTest;

/**
 * @author : xianzhiyong
 * @Date: 2020/4/23
 * @Description : String 转数组
 */
public class StringCahrtArr {

    public static void main(String[] args) {
        String str = "asdf,ds,zcv";
        String strTo = "asdf,sd,zcv";
        String strArr = "[A,B,C,D]";
        strArr.replace("[","");
        strArr.replace("]","");
        System.out.println(strArr);
        int num = str.compareTo(strTo);
        System.out.println(num);
    }
}
