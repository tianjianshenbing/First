package com.example.common.util.stringTest;

import java.util.Arrays;

public class StringSortTest {
    public static final String str1 = "adfdadfda";
    public static final String str2 = "asd,adsf,fda,asdf";
    public static final String str3 = "fdad,adsfdsafafa,";
    public static final String str4 = "adfa asdfasfd fdaf a";
    public static void main(String[] args) {
        char[] charArr = str1.toCharArray();
        int[] intArr = new int[charArr.length];
        for (int i = 0 ; i<charArr.length;i++) {
            intArr[i] = charArr[i];
        }
        Arrays.sort(charArr);
        for (int i = 0 ; i<charArr.length;i++ ) {
            System.out.println("intArr[i]: "+ charArr[i]);
        }
    }
}
