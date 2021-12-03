package month11.day13.util;

import java.util.Arrays;

/**
 * ClassName: MyArrays
 * Description:
 * date: 2021/11/13 11:53
 *
 * @author: Lilin
 * @since JDK 1.8
 */


public class MyArrays {
    public static int getMinIndex(int[] arr){
        int minIndex=0;
        for (int i=1;i<arr.length;i++){
            if(arr[minIndex]>arr[i]){
                minIndex=i;
            }
        }
        return minIndex;
    }
    public static int getMaxIndex(int[] arr){
        int maxIndex=0;
        for (int i=1;i<arr.length;i++){
            if(arr[maxIndex]<arr[i]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static void sort(int[] arr){
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        System.out.println("util MyArrays");
    }
}
