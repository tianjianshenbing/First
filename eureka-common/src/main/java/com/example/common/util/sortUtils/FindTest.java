package sortUtils;
import	java.util.ArrayList;
import	java.util.List;

public class FindTest {

    public static List<Integer> find(int[] arr, int data){
        List<Integer> result = new ArrayList<Integer> ();
        for (int i = 0; i < arr.length; i++){
            if (data == arr[i]){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,2,3,5,877,4,};
        int data = 5 ;
        List<Integer> list = FindTest.find(arr,data);
        System.out.println( "要查询的元素为：" + data);
        if (list.size() > 0){
            for (Integer integer: list) {
                System.out.println( "该元素坐标为:" + integer + " ");
            }
        }else {
            System.out.println("未查寻到该元素");
        }
    }
}
