package month11.day09;

/**
 * ClassName: Task03
 * Description:
 *
 * 3.	给定一个整型数组，数组成员10个,求该数组中第二大的数的下标
 *
 * date: 2021/11/9 11:35
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task03 {
    /**
     * getSecond
     * @desctiptopn

     * @param nums:
     * @version 0.1.0
     * @return int
     * @author Lilin
     * @since 0.1.0
     */
    public static int getSecond(int[] nums){
        //如果返回值是-1代表没有第二大数
        int index = -1;
        //获取到了最大数的下标
        int indexMax = getMax(nums);
        //抽象能力
        int max = nums[indexMax];
        //循环数组去查找第二大值
        int smax = Integer.MIN_VALUE;
        //2,8,8,8,8,8,8,8,8,8,8,1
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=max) {
                if(nums[i]>=smax) {
                    smax=nums[i];
                    index = i;
                }
            }
        }
        return index;
    }


   /**
    * getMax
    * @desctiptopn

    * @param nums:
    * @version 0.1.0
    * @return int
    * @author Lilin
    * @since 0.1.0
    */
    public static int getMax(int[] nums) {
        // 默认让第一个数最小
        int index = 0;
        int max = nums[0];
        // 打擂台
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                // 记录当前最小值
                max = nums[i];
                // 记录当前最小值的下标
                index = i;
            }
        }
        return index;
    }

    /**
     * getMin
     * @desctiptopn
     * 这个方法是获取最小值的方法 返回下标 0-length-1
     * @param nums:
     * @version 0.1.0
     * @return int
     * @author Lilin
     * @since 0.1.0
     */
    public static int getMin(int[] nums) {
        // 默认让第一个数最小
        int index = 0;
        int min = nums[0];
        // 打擂台
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                // 记录当前最小值
                min = nums[i];
                // 记录当前最小值的下标
                index = i;
            }
        }
        return index;
    }


    public static void main(String[] args){
//        int[] nums = {1,2,9,0,8,6,5,4,3,7,9,7};
        int[] nums = {1,1,1,1};
//        int[] nums = {2,1,2,2};
        System.out.println("第二大的数的下标是:"+getSecond(nums));
    }
}
