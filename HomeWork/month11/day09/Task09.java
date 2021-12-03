package month11.day09;

import java.util.Arrays;

/**
 * ClassName: Task09
 * Description:
 *
 * 9.	将一个数组逆序输出
 *
 * date: 2021/11/9 17:04
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task09 {
    /**
     * reverse
     * @desctiptopn

     * @param nums:
     * @version 0.1.0
     * @return void
     * @author Lilin
     * @since 0.1.0
     */
    public static void reverse(int[] nums) {
        for(int i=nums.length-1;i>=0;i--){
            System.out.format("%3d",nums[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {10,23,2,45,6};
        reverse(nums);
    }
}
