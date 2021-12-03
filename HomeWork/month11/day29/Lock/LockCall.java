package month11.day29.Lock;

/**
 * ClassName: LockCall
 * Description:
 * date: 2021/11/29 16:07
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class LockCall extends Thread {
    private Integer a=1;
    private Integer b=2;

    LockCall(Integer a, Integer b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void run() {
        synchronized (a){
            synchronized (b){
                System.out.println(a+b);
            }
        }
    }
}
