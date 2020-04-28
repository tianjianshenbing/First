package shuzu;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ShuzuTest {
    public static void main(String[] args) {
        /*for(int i = 1 ; i < 10 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j+ "*" + i + "=" + i*j+ "    ");
            }
            System.out.println();
        }*/


       /* int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 6;
        arr[7] = 7;
        arr[8] = 8;
        arr[9] = 9;
        for(int a : arr){
            System.out.println(a+ "   ");
        }*/

        ShuzuTest.table(4,10);

        DecimalFormat s = new DecimalFormat("0.000");
    }

    public static void table(int a , int b ) {
        for(int i = a ; i <= b ; i++){
            for(int j = a ; j <= i ; j++){
                System.out.print(j+ " * " + i + " = " + i*j+ "    ");
            }
            System.out.println();
        }
    }

}
