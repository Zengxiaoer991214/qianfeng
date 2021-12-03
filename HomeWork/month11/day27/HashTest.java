package month11.day27;

/**
 * ClassName: HashTest
 * Description:
 * date: 2021/11/27 9:29
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class HashTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        String s5 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println("== comparison : " + (s1 == s5));
        System.out.println("== comparison : " + (s1 == s2));
        System.out.println("Using equals method : " + s1.equals(s2));
        System.out.println("== comparison : " + s3 == s4);
        System.out.println("== comparison : " + s3 == s1);
        System.out.println("Using equals method : " + s3.equals(s4));
    }
}
