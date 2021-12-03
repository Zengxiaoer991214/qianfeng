package month11.day30.producer;

import sun.java2d.windows.GDIRenderer;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/30 15:25
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Card card = new Card();
        Girl girl = new Girl(card);
        Boy boy = new Boy(card);
        new Thread(girl,"女人").start();
        new Thread(boy, "男人").start();

    }
}
