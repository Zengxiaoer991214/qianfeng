package month11.day09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/9 11:00
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    /**
     * printArray
     * @desctiptopn

     * @param arr:
     * @version 0.1.0
     * @return void
     * @author Lilin
     * @since 0.1.0
     */
    public static void printArray(int[] arr){

        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                System.out.format(" %d",arr[i]);
            }
            else {
                System.out.format(" %d,",arr[i]);
            }
        }
        System.out.print("]\n");

    }
    /**
     * fibonacci
     * @desctiptopn

     * @param nums:
     * @version 0.1.0
     * @return void
     * @author Lilin
     * @since 0.1.0
     */
    public static void fibonacci(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(i==0){
                nums[i]=0;
            }else if(i==1){
                nums[i]=1;
            }else {
                nums[i] = nums[i-1] + nums[i-2];
            }

        }

    }
    public static void main(String[] args) {
        int[] nums = new int[40];
        fibonacci(nums);
        System.out.println(Arrays.toString(nums));



/*        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[3];
        for(int i=0;i<scores.length;i++){
            System.out.format("请输入第%d个成绩",i+1);
            scores[i] = scanner.nextInt();
        }
        printArray(scores);*/

/*        int[] nums = new int[5];
        for(int i=0;i<nums.length;i++){
            System.out.format("请输入第%d个数",i+1);
            nums[i] = scanner.nextInt();
        }
        for (int i=0;i<nums.length;i++){
            System.out.format("a[%d]=%d\n",i,nums[i]);
        }*/
    }
}
