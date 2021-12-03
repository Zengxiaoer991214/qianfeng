package month11.day30.pool;

import java.util.concurrent.*;

/**
 * ClassName: PoolTest
 * Description:
 * date: 2021/11/30 10:40
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class PoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor t = new ThreadPoolExecutor(5, 10,
                30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
    }
}
