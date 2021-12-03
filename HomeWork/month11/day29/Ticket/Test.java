package month11.day29.Ticket;

import org.junit.internal.runners.statements.RunAfters;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/29 17:17
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        TicketWindow ticketWindow = new TicketWindow(100);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 30, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(5));
        for(int i=1;i<=5;i++) {
            pool.execute(ticketWindow);
        }
    }
}
