package month11.day29.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * ClassName: ArrayListTest
 * Description:
 * date: 2021/11/29 14:40
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class ArrayListTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<=100;i++) {
            CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
            Thread t1 = new Thread(() -> arrayList.add("a"));
            Thread t2 = new Thread(() -> arrayList.add("b"));
            Thread t3 = new Thread(() -> arrayList.add("c"));
            t1.start();
            t2.start();
            t3.start();
            Thread.sleep(5);
            System.out.println(arrayList);
        }

//        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(){{
//            for(int i=0;i<10;i++)
//                add(i);
//        }};
//        for (int i=0;i<5;i++){
//            new Thread(()->
//                    System.out.println(list.remove(2))
//            ).start();
//        }
    }
}
