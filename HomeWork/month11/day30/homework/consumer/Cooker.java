package month11.day30.homework.consumer;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName: Cooker
 * Description:
 * date: 2021/11/30 19:04
 *
 * @author: Lilin
 * @since JDK 1.8
 */
@Getter
@Setter
public class Cooker implements Runnable{
    private final Table table;
    private int count;
    private int time;

    public Cooker(Table table, int count, int time) {
        this.table = table;
        this.count = count;
        this.time = time;
    }

    @Override
    public void run() {
        while (true){
            table.produce(count,time);
        }
    }
}
