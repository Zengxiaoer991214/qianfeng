package month11.day30.time;

import sun.nio.ch.SelectorImpl;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: TimeUtil
 * Description:
 * date: 2021/11/30 16:55
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class TimeUtil {
//    static final Object object = new Object();
//    public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd: hh:mm:ss");
//    public  static String getTime(int num){
////                System.out.println(num);
//            return sdf.format(new Date(num));
//
//    }
    ThreadLocal<SimpleDateFormat> tl = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.hashCode());
            return sdf;
        }
    };

//    Thread
    public static String getTime(int i) {
        String result = "";
        SimpleDateFormat sd =  new TimeUtil().tl.get();
        System.out.println(Thread.currentThread().getName()+"=="+sd);
        result = sd.format(new Date(i));
        return result;
    }

}
