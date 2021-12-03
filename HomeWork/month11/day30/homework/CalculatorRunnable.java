package month11.day30.homework;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName: CalculatorRunnable
 * Description:
 * date: 2021/11/30 11:41
 *
 * @author: Lilin
 * @since JDK 1.8
 */
@Getter
@Setter
public class CalculatorRunnable implements Runnable{
    public static long result=0;
    private int[] nums;

    public CalculatorRunnable(int[] nums) {
        this.nums = nums;
    }

    @Override
    public void run() {
        int re=0;
        for (int i:nums){
            re +=i;
        }
        result+=re;
    }
//    @Override
//    public void run() {
//
//        for (int i:nums){
//            result +=i;
//        }
//    System.out.println(result);
//    }
}
