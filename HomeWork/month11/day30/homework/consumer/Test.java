package month11.day30.homework.consumer;

import javafx.scene.control.Tab;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/30 19:21
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Table table = new Table();
        Buyer buyer1 = new Buyer(table,1,500);
        Buyer buyer2 = new Buyer(table,1,1500);
        Buyer buyer3 = new Buyer(table,1,1000);
        Cooker cooker = new Cooker(table,1,1000);
        new Thread(cooker, "糕点师").start();
        while (true) {
            new Thread(buyer1, "小明").start();
            new Thread(buyer2, "小红").start();
            new Thread(buyer3, "小绿").start();
        }



    }
}
