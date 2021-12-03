package month11.day29.Ticket;

/**
 * ClassName: TicketWindow
 * Description:
 * date: 2021/11/26 19:04
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class TicketWindow implements Runnable {

    private int remains;

    public TicketWindow(int ticketCount) {
        this.remains=ticketCount;
    }

    @Override
    public void run() {

        while (this.remains>0){

            System.out.println(Thread.currentThread().getName()
                    + "卖掉了第"
                    + this.remains--
                    + "张票");
        }


    }
}
