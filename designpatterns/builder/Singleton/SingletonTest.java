package builder.Singleton;

/**
 * ClassName: SingletonTest
 * Description:
 * date: 2021/11/15 21:02
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class SingletonTest {
    public static void main(String[] args) {

        /*
        * 测试线程不安全的单例
        * */
//        Singleton01 singleton011 = Singleton01.getInstance();
//        Singleton01 singleton012 = Singleton01.getInstance();
//        System.out.println(singleton011.equals(singleton011));
//        System.out.println(singleton011==singleton011);
//        System.out.println(singleton011.hashCode());
//        System.out.println(singleton012.hashCode());

        Singleton01 singleton011 = new Singleton01();
        Singleton01 singleton012 = new Singleton01();
        System.out.println(singleton011.equals(singleton012));
        System.out.println(singleton011==singleton012);
        System.out.println(singleton011.hashCode());
        System.out.println(singleton012.hashCode());

        /*
        * 测试线程安全的单例
        * */
        Singleton02 singleton021 = Singleton02.getInstance();
        Singleton02 singleton022 = Singleton02.getInstance();
        System.out.println(singleton021.equals(singleton022));
        System.out.println(singleton021==singleton022);
        System.out.println(singleton021.hashCode());
        System.out.println(singleton022.hashCode());


    }
}
