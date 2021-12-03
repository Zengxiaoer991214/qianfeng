package month11.day09;

/**
 * ClassName: Task07
 * Description:
 *
 * 7.	定义一个长度为10的int数组,统计数组中的最大值、最小值、以及奇数和偶数的个数
 *
 * date: 2021/11/9 16:42
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task07 {
    /**
     * getResult
     * @desctiptopn

     * @param nums:
     * @version 0.1.0
     * @return double[]
     * @author Lilin
     * @since 0.1.0
     */
    private static double[] getResult(int[] nums) {
        double[] result = new double[4];
        for (int num : nums) {
            if (result[0] < num) {
                result[0] = num;
            }
            if (result[1] > num) {
                result[1] = num;
            }
            if (num % 2 == 1) {
                result[2]++;
            } else {
                result[3]++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,9,0,8,6,5,4,3,7};
        double[] result = getResult(nums);
        System.out.format("最大值是%.2f,最小值是%.2f,奇数的个数是%.0f,偶数的个数%.0f", result[0], result[1], result[2], result[3]);
    }
}
