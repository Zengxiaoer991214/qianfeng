package month11.day05;

/**
 * ClassName: Task04
 * Description:
 *
 * 4.	求2～100之内的素数。【素数 ： 只能被1或本身整除的数】
 *
 * date: 2021/11/5 10:44
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task04 {
    public static boolean isPrimer(int num){
        for(int i=2;i<=num/2;i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            if (Task04.isPrimer(i)) {
                System.out.println(i);
            }
        }
    }
}
