package month11.day30.time;

import java.util.concurrent.Executors;

/**
 * ClassName: Time
 * Description:
 * date: 2021/11/30 17:37
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Time {

    public static void main(String[] args) {
        ThreadLocal<String> tl = new ThreadLocal<>();

        Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            int temp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    tl.set(String.valueOf(temp/100));
                    System.out.println(tl.get().hashCode()+"--"+Thread.currentThread().getName());
                }
            }).start();
        }
    }
}
