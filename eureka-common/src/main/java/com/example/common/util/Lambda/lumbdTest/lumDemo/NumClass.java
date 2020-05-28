package com.example.common.util.Lambda.lumbdTest.lumDemo;


import lombok.Data;

@Data
public class NumClass {
    private  Integer a;
    private  Integer b;
    private  Integer sum;
    NumClass(Integer a,Integer b ,Integer sum){
        this.a =a ;
        this.b =b ;
        this.sum =sum ;
    }
}
