package builder.Singleton;

/**
 * ClassName: Singleton_01
 * Description:
 *
 * Lazy 线程不安全的单例
 *
 * date: 2021/11/15 21:00
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Singleton01 {

        private static Singleton01 instance;
        Singleton01() {
        }
        public static Singleton01 getInstance(){
            if (null != instance) {
                return instance;
            }
            instance = new Singleton01();
            return instance;
        }

}
