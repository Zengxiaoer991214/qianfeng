package month11.day26;

/**
 * ClassName: ThreadClass
 * Description:
 * date: 2021/11/26 14:46
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class ThreadClass extends Thread{
    private  boolean flag=false;
    ThreadClass(boolean flag){
        this.flag = flag;
    }
    @Override
    public void run() {
       for(int i=0;i<10;i++){
           System.out.println(Thread.currentThread().getName()+ "==="+i );
           if (flag&&i==5){
               System.out.println(Thread.currentThread().getName()+"礼让");
           }
       }
    }
}
