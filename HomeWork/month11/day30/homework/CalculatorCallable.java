package month11.day30.homework;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Callable;

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
public class CalculatorCallable implements Callable<Long> {
    private int[] nums;

    public CalculatorCallable(int[] nums) {
        this.nums = nums;
    }

    @Override
    public Long call() throws Exception {
        long re=0;
        for (int i:nums){
            re +=i;
        }
        return re;
    }
}
