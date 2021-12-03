package month11.day14;

/**
 * ClassName: StaticTest
 * Description:
 *
 * 测试有关于static的执行顺序
 *
 * date: 2021/11/14 17:03
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class StaticTest {
    public static void main(String[] args) {
        Son son = new Son();
        son.out();
    }
}
