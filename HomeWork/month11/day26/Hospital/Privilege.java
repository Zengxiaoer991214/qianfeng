package month11.day26.Hospital;

/**
 * ClassName: Privilege
 * Description:
 * date: 2021/11/26 16:17
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Privilege extends Thread{

    Privilege(String name){
        super(name);
    }
    @Override
    public void run() {
        int count = 20;
        for(int i=0;i<count;i++){
            System.out.println(this.getName()+"==="+i);
        }
    }
}
