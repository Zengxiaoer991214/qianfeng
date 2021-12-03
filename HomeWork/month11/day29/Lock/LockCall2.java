package month11.day29.Lock;

/**
 * ClassName: LockCall
 * Description:
 * date: 2021/11/29 16:07
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class LockCall2 implements Runnable {
    private Integer a=1;
    private Integer b=2;

    LockCall2(Integer a, Integer b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void run() {
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        synchronized (a){
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            synchronized (b){
                System.out.println(a+b);
            }
        }
    }
}
