package sortUtils;

/**
 * 插入排序
 */
public class InsertSort {

    /**
     * 插入排序
     * 最好情况的时间复杂度是 O(n)，最坏情况的时间复杂度是 O(n2)，
     * 然而时间复杂度这个指标看的是最坏的情况，而不是最好的情况，
     * 所以插入排序的时间复杂度是 O(n2)。
     * @param arr
     * @return
     */
   public static int[] insertSort(int[] arr) {
       int n = arr.length;
       for (int i = 1; i < n; ++i) {
           int value = arr[i];
           int j = 0;//插入的位�?
           for (j = i-1; j >= 0; j--) {
               if (arr[j] > value) {
                   arr[j+1] = arr[j];//移动数据
               } else {
                   break;
               }
           }
           arr[j+1] = value; //插入数据
       }
       return arr;
   }

    public static void main(String[] args) {
        int[] arr = {0, 9,6,5,82,4,3};
        int[] arr1 = InsertSort.insertSort(arr);
        for (int a:arr1
             ) {
            System.out.print(a+  "  ");

        }
    }
}
