package month11.day26.Hospital;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: Common
 * Description:
 * date: 2021/11/26 16:13
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Common extends Thread{
    public int number =20;
    private final Thread privilege;
    Common(String name,Thread privilege){
        super(name);
        this.privilege = privilege;
    }

    @Override
    public void run() {
        int count = 50;
        for(int i=0;i<count;i++){
            System.out.println(this.getName()+"==="+i);
            if(i==10){
                try {
                    System.out.println("开始特需号");
                    privilege.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
//        Integer
    }
}
