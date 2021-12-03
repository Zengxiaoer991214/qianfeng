package month11.day11;

/**
 * ClassName: Task01
 * Description:
 *
 * 1-10_000 有多少个5的因子
 *
 * date: 2021/11/11 14:33
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task01 {

    /**
     * findTheNumberOfFactors
     * @description:
     *
     * 使用递归
     *
     * @params [int, int]
     * @return int
     * @author Lilin
     * @date 2021/11/11 17:59
     */
    public static int findTheNumberOfFactors(int number, int factor){
        if(number==0){
            return 0;
        }else {
            return number/factor + findTheNumberOfFactors(number/factor, factor);
        }
    }
    public static void main(String[] args) {
        int num = 10_000_000;
//        num = 10;
        int factor = 5;
        System.out.format("1-%d含有 %d个%d的因子",num,findTheNumberOfFactors(num,factor),factor);
    }
}
