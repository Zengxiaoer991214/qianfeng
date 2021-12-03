package month11.day19;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Task03
 * Description:
 *
 * 2. 把当前的时间以 2016年9月5日 18:00:00 的格式输出
 *
 * date: 2021/11/19 16:16
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task03 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
    }
}
