package month11.day29;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Callable;

/**
 * ClassName: calculator
 * Description:
 * date: 2021/11/26 17:45
 *
 * @author: Lilin
 * @since JDK 1.8
 */
@Getter
@Setter
public class CalculatorCall implements Callable<Integer> {
    private final int start;
    private final int end;
    private final int[] nums;
    CalculatorCall(int start, int end, int[] nums){
        this.start=start;
        this.end=end;
        this.nums=nums;
    }

    @Override
    public Integer call() {
        int sum=0;
        for(int i=this.start;i<this.end;i++) {
            sum+=nums[i];
        }
        return sum;
    }
}
