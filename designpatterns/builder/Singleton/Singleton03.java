package builder.Singleton;

/**
 * ClassName: Singleton03
 * Description:
 *
 * 饿汉单例
 *
 * date: 2021/11/16 9:49
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Singleton03 {
    private static final Singleton03 INSTANCE = new Singleton03();
    private Singleton03() {
    }
    public static Singleton03 getInstance() {
        return INSTANCE;
    }
}
