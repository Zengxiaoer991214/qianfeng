package month11.day30.homework.consumer;

import lombok.SneakyThrows;

/**
 * ClassName: Customer
 * Description:
 * date: 2021/11/30 19:12
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Buyer implements Runnable {
    private final Table table;
    private int count;
    private int time;
    public Buyer(Table table, int count,int time) {
        this.table = table;
        this.count = count;
    }
    @SneakyThrows
    @Override
    public void run() {
//        while (true){
            Thread.sleep(time);
            table.consume(count);
//        }
    }
}
