package month11.day19;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: Task02
 * Description:
 *
 * 1. 输出今天是今年中的第几天，第几周
 *
 * date: 2021/11/19 16:12
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.format("今天是今年中的第%d天，第%d周",calendar.get(Calendar.DAY_OF_YEAR), calendar.get(Calendar.WEEK_OF_YEAR));
    }
}
