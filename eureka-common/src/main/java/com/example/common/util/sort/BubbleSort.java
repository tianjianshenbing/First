package com.example.common.util.sort;


/**
 * @author : xianzhiyong
 * @Date: 2020/3/22
 * @Description : 冒泡排序  没啥好说的
 */
public class BubbleSort {

    public static int[] arr = {5,6,8,9,4,23,6,21,4,2};

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
           boolean flag = true;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    flag =false;
                }
            }
            if(flag){
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        long  begin = System.currentTimeMillis();
        int[] res = BubbleSort.bubbleSort(arr);
        long end = System.currentTimeMillis();
        for (int a : res) {
            System.out.print(a + "  ");
        }
        System.out.println();
        float excTime=(float)(end-begin)/1000;
        System.out.println("执行时间："+excTime+"s");
    }
}
