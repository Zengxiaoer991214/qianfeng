package month11.day26.Interrupt;

/**
 * ClassName: Interrupt
 * Description:
 * date: 2021/11/26 16:50
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Interrupt extends Thread{
    @Override
    public void run() {
        while (true){
            if (this.isInterrupted()){
                System.out.println("被中断");
                break;
            }
        }
    }
}
