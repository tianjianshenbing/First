package sortUtils;

/**
 * 希尔排序
 *
 * 希尔排序为插入排序的升级版
 *
 * 希尔排序的时间复杂度为 O(n^(1.3—2))   即 O(n^2)
 * 可能你会问为什么区间要以 gap = gap*3 + 1 去计算，
 * 其实最优的区间计算方法是没有答案的，这是一个长期未解决的问题，
 * 不过差不多都会取在二分之一到三分之一附近。
 */
public class XierSort {
    public static int[] xierSort(int[] arr) {
        int length = arr.length;
        //区间
        int gap = 1;
        while (gap < length) {
            gap = gap * 3 + 1;
        }
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                int tmp = arr[i];
                int j = i - gap;
                //跨区间排序
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
            gap = gap / 3;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2,65,42,85,95,7,5};

        int[] array =  XierSort.xierSort(arr);

        for (int a: array
             ) {
            System.out.print(a + "   ");

        }
    }
}
