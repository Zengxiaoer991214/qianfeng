package month11.day30.producer;

import lombok.SneakyThrows;

/**
 * ClassName: Card
 * Description:
 * date: 2021/11/30 15:14
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Card {
    double money;
    @SneakyThrows
    public void  save(){
        if (money>0){
            System.out.println("卡里还有");
            this.wait();
        }
        this.money+=1000.0;
        System.out.println(Thread.currentThread().getName()+"存了钱，余额是"+this.money);
        this.notify();
    }
    @SneakyThrows
    public void  take(){
        if (money<=0){
            System.out.println("卡里没钱");
            this.wait();
        }
        this.money-=1000.0;
        System.out.println(Thread.currentThread().getName()+"取了钱，余额是"+this.money);
        this.notify();
    }
}
