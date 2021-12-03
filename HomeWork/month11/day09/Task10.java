package month11.day09;

import java.util.Arrays;

/**
 * ClassName: Task10
 * Description:
 *
 * 10.	输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
 *
 * date: 2021/11/9 17:23
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task10 {
    /**
     * exchange
     * @desctiptopn

     * @param nums:
     * @version 0.1.0
     * @return void
     * @author Lilin
     * @since 0.1.0
     */
    public static void exchange(int[] nums){
        int min=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[min]>nums[i]){
                min=i;
            }

        }
        int temp = nums[nums.length-1];
        nums[nums.length-1] = nums[min];
        nums[min] = temp;
        for(int i=1;i<nums.length;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        temp = nums[0];
        nums[0] = nums[max];
        nums[max] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,9,0,8,6,5,4,3,7};
        System.out.println(Arrays.toString(nums));
        exchange(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{9,8,7,6,5,4};
        System.out.println(Arrays.toString(nums));
        exchange(nums);
        System.out.println(Arrays.toString(nums));
    }
}
