package month11.day30.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: TimeTest
 * Description:
 * date: 2021/11/30 16:24
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class TimeTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int temp = i;
            new Thread(() ->
                System.out.println(TimeUtil.getTime(temp * 1000))).start();
        }
    }
}
