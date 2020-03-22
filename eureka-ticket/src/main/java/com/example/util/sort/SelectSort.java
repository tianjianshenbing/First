package com.example.util.sort;


import com.example.util.RandomCreateArr;

/**
 * @author : xianzhiyong
 * @Date: 2020/3/22
 * @Description :  选择排序
 *                  主要是选下标
 *                  一轮对比完才互换位置 比冒泡操作少很多
 */
public class SelectSort {
    public static int[] arr = {5,6,8,9,4,23,6,21,4,2};

    public static int[] selectSort(int[] arr){

        for(int i = 0 ; i<arr.length;i++){
            int min  = i ;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!= i){
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }

        return  arr;
    }

    public static void main(String[] args) {
       /*
        int[] res = SelectSort.selectSort(arr);
        for (int a: res) {
            System.out.print( a + "   ");
        }
        */
        int[] arr = RandomCreateArr.createArr(10,50);
        for (int a : arr) {
            System.out.print(a + "  ");
        }
    }


}
