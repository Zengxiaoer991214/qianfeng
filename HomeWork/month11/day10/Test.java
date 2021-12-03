package month11.day10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/10 9:28
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {

    public static void bubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void countSort(int[] arr){
        int min = 0;
        int max = 0;
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
            if (max < value) {
                max = value;
            }
        }
        int[] counts = new int[max-min+1];
        for (int value : arr) {
            counts[value - min]++;
        }
        int[] newArr = new int[arr.length];
        for(int i=1;i<counts.length;++i){
            counts[i]=counts[i]+counts[i-1];
        }
        for(int i=arr.length-1;i>=0;--i){
            newArr[--counts[arr[i]-min]]=arr[i];
        }
        System.arraycopy(newArr, 0, arr, 0, arr.length);

//        int index = 0;
//        for (int i=0;i<counts.length;i++){
//            for(int j=0;j<counts[i];j++){
//                arr[index++] = i+min;
//            }
//        }
    }
    public static int[] expansion(int[] nums,int length){
        int[] newNums = new int[length];
        length = Math.min(nums.length, length);
        for (int i=0;i<length;i++){
            newNums[i] = nums[i];
        }
        return newNums;
    }
    public static int binarySearch(int elem, int[] arr){
        int start=0;
        int end = arr.length-1;
        int mid;
        while (start<=end){
            mid=(start+end)/2;
            if(arr[mid]==elem){
                return mid;
            }else if (arr[mid]<elem){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static boolean delete(int[] arr, int elem){
        int index=0;
        for(;index<arr.length;index++){
            if (arr[index]==elem){
                break;
            }
        }
        if(index==arr.length){
            return false;
        }
        System.out.println(index);
        for(int i=index;i<arr.length-1;i++){
            System.out.println(i);
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return true;
    }
    public static boolean isSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void monkeySort(int[] arr){
        Random r = new Random();
        int length = arr.length;

        do {
            int r1 = r.nextInt(length);
            int r2 = r.nextInt(length);
        }while (!isSort(arr));
    }
    public static void main(String[] args) {
//        int[] arr1 = {2, 1, 2, 3, 4, 5};
//        System.out.println(delete(arr1,3));
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(delete(arr1,7));
//        System.out.println(Arrays.toString(arr1));


//        System.out.println(Arrays.toString(expansion(arr1, 5)));
//        int[] arr2 = new int[5];
//        int[] arr3 = new int[5];
//        System.out.println(Arrays.toString(arr1));
//        arr2 = arr1;
//        System.out.println(Arrays.toString(arr2));
//        for(int i=0;i<arr1.length;i++){
//            arr3[i] = arr1[i];
//        }
//        System.out.println(Arrays.toString(arr3));
//        int[] nums = {1,3,4,5,6,7,8,9};
//        Scanner scanner = new Scanner(System.in);
//        int input;
//        int flag;
//        do{
//            System.out.println("请输入你需要查找的数");
//            input = scanner.nextInt();
//            flag = binarySearch(input, nums);
//            if(flag==-1){
//                System.out.println("该数没有在数组中");
//            }else {
//                System.out.println("该数在数中的位置是"+flag);
//            }
//            System.out.println("是否继续输入?Y/N");
//        }while (scanner.next().charAt(0)=='Y');
//
//
//        int[] nums = {4,4,4,4,4,4,1,2,2,1,2,6,7,8,9,3,4,0,5};
//        int[] bigNums = new int[1_000_000];
//        Random r = new Random(1);
//        for (int i=0;i<bigNums.length;i++){
//            bigNums[i] =r.nextInt(100);
//        }
//        System.out.println(Arrays.toString(bigNums));
//        int[] newBigNums = new int[1_000_000];
//        System.arraycopy(newBigNums, 0, bigNums, 0, bigNums.length);
        int[] bigNums =  {4,4,4,4,4,4,1,2,2,1,2,6,7,8,9,3,4,0,5,0};
        int[] bigNums2 = {4,4,4,4,4,4,1,2,2,1,2,6,7,8,9,3,4,0,5,0};
        int[] bigNums3 = {4,4,4,4,4,4,1,2,2,1,2,6,7,8,9,3,4,0,5,0};

        long startTime = System.currentTimeMillis();
        countSort(bigNums);
        long endTime = System.currentTimeMillis();
        System.out.println("计数排序运行时间：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        bubbleSort(bigNums2);
        endTime = System.currentTimeMillis();
        System.out.println("冒泡排序运行时间：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        monkeySort(bigNums3);
        endTime = System.currentTimeMillis();
        System.out.println("猴子排序运行时间：" + (endTime - startTime) + "ms");




//        System.out.println(Arrays.toString(nums));
//        countSort(nums);
//        System.out.println(Arrays.toString(nums));
    }
}
