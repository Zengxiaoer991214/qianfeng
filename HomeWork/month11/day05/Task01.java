package month11.day05;

/**
 * ClassName: Task04
 * Description:
 *
 * 1.	求出1-100之间偶数和
 *
 * date: 2021/11/5 10:44
 *
 * @author: Lilin
 * @since JDK 1.8
 */

public class Task01 {
    public static void main(String[] args) {
        int sum =0;
        for(int i=2;i<100;i=i+2){
            sum+=i;
        }
        System.out.println(sum);
    }
}
