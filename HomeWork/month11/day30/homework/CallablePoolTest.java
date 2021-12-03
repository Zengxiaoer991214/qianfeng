package month11.day30.homework;

import month11.day22.result.Result;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * ClassName: RunnablePoolTest
 * Description:
 * date: 2021/11/30 11:45
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class CallablePoolTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int number = 20_000;
        int count = 10;
        int base = number/count;
        int[][] nums= new int[count][base];
        Random r = new Random();
        for (int i=0;i<count;i++){
            for (int j=0;j<base;j++) {
                nums[i][j] = 1;
            }
        }

        ThreadPoolExecutor pool = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        long res =0;
        List<Future<Long>> f = new ArrayList<>();
        for (int i=0;i<count;i++){
            f.add(pool.submit(new CalculatorCallable(nums[i])));
        }

//        while (pool.getCorePoolSize()<f.size()) System.out.println(pool.getCorePoolSize());;
        Thread.sleep(1000);
        for (Future future:f){
            res += (long)future.get();
        }
       System.out.println("多线程结果"+res);
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
