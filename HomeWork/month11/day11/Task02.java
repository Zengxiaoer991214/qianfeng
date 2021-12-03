package month11.day11;

/**
 * ClassName: Task02
 * Description:
 *
 * 2. 模拟斗地主发牌
 *
 * date: 2021/11/11 15:02
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task02 {

    public static void main(String[] args) {
        Cards cards = new Cards();
        cards.shuffle();
        cards.handOutPoker();
    }
}
