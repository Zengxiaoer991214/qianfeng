package month11.day09;

import java.util.Arrays;

/**
 * ClassName: Task05
 * Description:
 *
 * 5.	利用bubbleSort对数据进行降序排序
 *
 * date: 2021/11/9 15:40
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task05 {
    /**
     * bubbleSort
     * @desctiptopn 
                  
     * @param arr: 
     * @version 0.1.0
     * @return void
     * @author Lilin
     * @since 0.1.0
     */
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] scores = {1,2,9,0,8,6,5,4,3,7};
        bubbleSort(scores);
        System.out.println(Arrays.toString(scores));
    }
}
