package month11.day30.homework;

import month11.day26.homework.work01.Calculator;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName: RunnablePoolTest
 * Description:
 * date: 2021/11/30 11:45
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class RunnablePoolTest {
    public static void main(String[] args) throws InterruptedException {
        int number = 20_000;
        int count = 10;
        int base = number/count;
        int[][] nums= new int[count][base];
//        long startTime = System.currentTimeMillis();
        Random r = new Random();
        for (int i=0;i<count;i++){
            for (int j=0;j<base;j++) {
                nums[i][j] = 1;
            }
        }
//        Thread.sleep(100);newFixedThreadPool
        ExecutorService pool = Executors.newFixedThreadPool(20);
        for (int i=0;i<count;i++){
            pool.execute(new CalculatorRunnable(nums[i]));
        }
        Thread.sleep(1000);
        System.out.println("多线程计算结果"+CalculatorRunnable.result);
        long re = 0;
        for (int[] nu:nums){
            for (int n:nu){
                re+=n;
            }
        }
        System.out.println(re);
        pool.shutdown();
    }
}
