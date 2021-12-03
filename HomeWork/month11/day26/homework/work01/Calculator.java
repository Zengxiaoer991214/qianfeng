package month11.day26.homework.work01;

import lombok.Getter;
import lombok.Setter;

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
public class Calculator extends Thread{
    private final int start;
    private final int end;

    Calculator(int start, int end){
        this.start=start;
        this.end=end;
    }
    @Override
    public void run() {
        for(int i=this.start;i<this.end;i++){
            Result.result+=i;
        }
    }
}
