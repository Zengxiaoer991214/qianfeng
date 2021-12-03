package month11.day29;

import month11.day26.homework.work01.Calculator;
import month11.day26.homework.work01.Result;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/26 17:50
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class TestCall {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int num = 20_000;
        int[] nums= new int[num];
        long startTime = System.currentTimeMillis();
        Random r = new Random();
        for (int i=0;i<num;i++){
            nums[i] = r.nextInt(num);
        }
        int count=10;
        int base = num/count;
        CalculatorCall calculatorCall;
        List<FutureTask<Integer>> list= new ArrayList<>();
        FutureTask<Integer>      futureTask;
        for (int i=0;i<count;i++){
            calculatorCall =  new CalculatorCall(base*i,base*(i+1),nums);
            futureTask = new FutureTask<>(calculatorCall);

            new Thread(futureTask).start();
            list.add(futureTask);
        }
//        System.out.println(calculator.getEnd());
        int result = 0;
        for (FutureTask<Integer> f:list){
            result+=f.get();
        }
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("多线程：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        long count2 = 0;
        for(int i =0;i<num;i++) {
            count2 += nums[i];
        }
        System.out.println(count2);
        endTime = System.currentTimeMillis();
        System.out.println("单线程：" + (endTime - startTime) + "ms");
    }
}
