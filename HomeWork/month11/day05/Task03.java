package month11.day05;

/**
 * ClassName: Task04
 * Description:
 *
 *3.	3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。
 *
 * date: 2021/11/5 10:44
 *
 * @author: Lilin
 * @since JDK 1.8
 */

public class Task03 {
    public static void main(String[] args) {
        int day=0;
        int length = 3000;
       do{

            length/=2;
            day++;
        } while(length>=5);
        System.out.println(day);
    }
}
