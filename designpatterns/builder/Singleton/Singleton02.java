package builder.Singleton;

/**
 * ClassName: Singleton_01
 * Description:
 *
 * Lazy线程安全的单例
 *
 * date: 2021/11/15 21:00
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Singleton02 {

    private static Singleton02 instance;
    private Singleton02() {
    }
    public static synchronized Singleton02 getInstance(){
        if (null != instance) {
            return instance;
        }
        instance = new Singleton02();
        return instance;
    }

}
