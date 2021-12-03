package month11.day06;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/6 9:54
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println("s1的hashcode"+s1.hashCode());
        System.out.println("s2的hashcode"+s1.hashCode());
        System.out.println(s2.equals(s1));
        System.out.println(s2 == s1);
    }
}
