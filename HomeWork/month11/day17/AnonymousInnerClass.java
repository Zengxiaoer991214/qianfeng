package month11.day17;

/**
 * ClassName: AnonymousInnerClass
 * Description:
 * date: 2021/11/17 16:03
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {

        Inner inner = () -> System.out.println("匿名内部类");
        inner.show();

    }
}
