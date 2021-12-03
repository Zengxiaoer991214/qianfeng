package month11.day30.time.test;

import java.text.SimpleDateFormat;

/**
 * ClassName: MyUtil
 * Description:
 * date: 2021/11/30 23:03
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class MyUtil {
     static final StringBuffer bf = new StringBuffer("HHHHHH");
     static ThreadLocal<StringBuffer> tl = ThreadLocal.withInitial(() -> {
//         System.out.println(Thread.currentThread().getName());
//         StringBuffer s = new StringBuffer("HHHHHH");
         return bf;
     });
     public static void tool(){
         if (Thread.currentThread().getName().equals("pool-1-thread-4")){
             tl.set(tl.get().append(Thread.currentThread().getName()));
         }
         System.out.println(Thread.currentThread().getName()+"--"+tl.get().hashCode());
     }
}
