package builder.Singleton;

/**
 * ClassName: Singleton04
 * Description:
 * date: 2021/11/16 9:52
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Singleton04 {
    private static class SingletonHolder {
        private static final Singleton04 instance = new Singleton04();
    }
    private Singleton04() {
    }
    public static Singleton04 getInstance() {
        return SingletonHolder.instance;
    }
}
