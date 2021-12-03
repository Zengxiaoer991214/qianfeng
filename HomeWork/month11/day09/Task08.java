package month11.day09;

import java.util.Arrays;

/**
 * ClassName: Task08
 * Description:
 *
 * 8.	提取一个方法，将指定数组中的数组元素进行反转
 * 例如：{10,23,2,45,6}--->{6,45,2,23,10}
 *
 * date: 2021/11/9 16:52
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task08 {
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
     for(int i=0;i<nums.length/2-1;i++){
         int temp = nums[i];
         nums[i] = nums[nums.length-1-i];
         nums[nums.length-1-i] = temp;
     }
    }

    public static void main(String[] args) {
        int[] nums = {10,23,2,45,6};
        System.out.println(Arrays.toString(nums));
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }
}
