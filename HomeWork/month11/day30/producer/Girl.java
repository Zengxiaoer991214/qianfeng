package month11.day30.producer;

import lombok.SneakyThrows;

/**
 * ClassName: Boy
 * Description:
 * date: 2021/11/30 15:18
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Girl implements Runnable {
    final Card card;

    public Girl(Card card) {
        this.card = card;
    }

    @SneakyThrows
    @Override
    public void run() {

        synchronized (card) {
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+"第"+i+"次取钱");
                card.take();
            }
        }
    }
}
