package month11.day29.Lock;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/29 16:10
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Integer a=1;
        Integer b=2;
        LockCall2 l1= new LockCall2(a,b);
        LockCall2 l2= new LockCall2(b,a);
        Thread thread1 = new Thread(l1);
        Thread thread2 = new Thread(l2);
        thread1.start();
        thread2.start();
    }
}
