package month11.day26.homework.work02;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/26 19:11
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        int ticketCount = 100;
        TicketWindow ticketWindow = new TicketWindow(ticketCount);
        new Thread(ticketWindow,"售票窗口1").start();
        new Thread(ticketWindow,"售票窗口2").start();
        new Thread(ticketWindow,"售票窗口3").start();
    }
}
