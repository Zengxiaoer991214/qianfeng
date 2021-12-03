package month11.day11;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/11 10:21
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {

    public static int getSecondNum(int[] nums){
        int index = -1;
        int indexMax = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[indexMax]) {
                indexMax = i;
            }
        }
        int max = nums[indexMax];
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=max) {
                if(nums[i]<max&&nums[i]>smax) {
                    smax=nums[i];
                    index = i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,2,2};
        System.out.println(Arrays.toString(nums));
        System.out.println("第二大的数的下标是:"+getSecondNum(nums));
        nums = new int[]{1, 1, 1, 1};
        System.out.println(Arrays.toString(nums));
        System.out.println("第二大的数的下标是:"+getSecondNum(nums));
        nums = new int[]{1, 2, 1, 1};
        System.out.println(Arrays.toString(nums));
        System.out.println("第二大的数的下标是:"+getSecondNum(nums));
    }


}
