package month11.day30.homework.consumer;

import lombok.SneakyThrows;

import java.util.ArrayList;

/**
 * ClassName: Table
 * Description:
 * date: 2021/11/30 19:06
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Table {
    private final int capacity=5;
    private final ArrayList<Cake> cakes = new ArrayList<>(capacity);
    public Table() {
    }

    @SneakyThrows

    public void produce(int count, int time){

        synchronized (cakes){
            while (cakes.size()>=capacity){
                System.out.println(Thread.currentThread().getName()+"说：还有蛋糕，不制作");
                cakes.wait();
            }
            for (int i=0;i<count;i++){
                Thread.sleep(time);
                cakes.add(new Cake());
                System.out.println(Thread.currentThread().getName()+"制作了"+count+"个蛋糕，还有"+cakes.size()+"个");
                cakes.notifyAll();
            }

        }
    }
    @SneakyThrows
    public void consume(int count){

        synchronized (cakes){
            while (cakes.isEmpty()){
                System.out.print(Thread.currentThread().getName());
                System.out.println("没有蛋糕，无法购买");
                cakes.wait();
            }
//            for (int i=0;i<count;i++){
//                if(cakes.isEmpty()){
//                    System.out.println("当前不够，请等待");
//                    cakes.wait();
//                }else {
//                    cakes.remove(0);
//                }
//            }
            cakes.remove(0);

            System.out.println(Thread.currentThread().getName()+"购买了"+count+"个蛋糕，"+"还剩余"+cakes.size()+"个");
            cakes.notifyAll();
        }

    }
}
