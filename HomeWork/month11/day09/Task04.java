package month11.day09;

/**
 * ClassName: Task04
 * Description:
 *
 * 4.	B哥去参加青年歌手大奖赛,有10个评委打分,(去掉一个最高一个最低)求平均分?
 *
 * date: 2021/11/9 11:39
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task04 {
    /**
     * getAverage
     * @desctiptopn

     * @param nums:
     * @version 0.1.0
     * @return double
     * @author Lilin
     * @since 0.1.0
     */
    public static double getAverage(double[] nums){
        double max = 0;
        double min = 0;
        for (double num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        double sum=0;
        for (double num : nums){
            sum+=num;
        }
        sum-=max;
        sum-=min;
        return sum/(nums.length-2);
    }

    public static void main(String[] args) {
//        Integer.MAX_VALUE
        double[] scores = {9,8,7,7,8,7,7,8,8,6};
        System.out.println("B哥的平均分是"+getAverage(scores));
    }
}
