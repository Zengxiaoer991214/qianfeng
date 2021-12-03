package month11.day30.time;

import month11.day30.time.test.MyUtil;
import org.junit.internal.runners.statements.RunAfters;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName: TimePoolTest
 * Description:
 * date: 2021/11/30 16:54
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class TimePoolTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            int temp = i;
            pool.execute(() -> {
//                System.out.println(Thread.currentThread().getName() + ":");
                MyUtil.tool();
            });
        }
        pool.shutdown();
//        for (int i = 0; i < 1000; i++) {
//            int temp = i;
//            new Thread(() -> System.out.println(TimeUtil.getTime(temp))).start();
//        }


    }
}
