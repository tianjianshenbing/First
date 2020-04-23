package com.example.common.util.sort;

/**
 * @author : xianzhiyong
 * @Date: 2020/3/22
 * @Description : 插入排序
 *                  扑克牌插牌的方式进行排列
 *                  无法排序 原因????
 */
public class InsertSort {

    public static int[] insertSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j>0 && temp< arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            if(j != i){
                //此处为最初选的坐标i 的值 和 对比过的 j的值作交换  注意变量的实际位置
                arr[j] = temp;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = RandomCreateArr.createArr(5,10);

        long begin = System.currentTimeMillis();

        int[] res = InsertSort.insertSort(arr);

        for (int a: res) {
            System.out.print( a + "  ");
        }


        /*long end = System.currentTimeMillis();

        float ext = (float)(end-begin)/1000;

        System.out.println();
        System.out.println("运行时间： "+ ext);*/
    }
}
