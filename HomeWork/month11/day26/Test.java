package month11.day26;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/26 9:19
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {1,0,2,1,2,1,1,2,2,0,0,0,1,1};
//        for(int i=0,j=0,k=nums.length-1;j<=k;j++){
//            if(nums[j]==0){
//                nums[j]=nums[i];
//                nums[i++]=0;
//            } else if(nums[j]==2){
//                nums[j--]=nums[k];
//                nums[k--]=2;
//            }
//        }
        int[] nums2 = Arrays.copyOf(nums,5);
        System.out.println(Arrays.toString(nums2));
        int[] nums3 = Arrays.copyOfRange(nums,2,4);
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums));
//        Comparator
//        LinkedHashMap
    }
}
