package month11.day08;

/**
 * ClassName: Task02
 * Description:
 *
 * 2.	素数也叫质数.是除了1和其本身,不能被其他正整数整除的正整数.
 *      a)	例如：2,3,5,7,11,13,17,19,23.....
 *      b)	写一个方法判断该数是否为素数（设计成一个方法）
 *      c)	输出某个范围内的所有素数，比如100-200之间。
 *
 * date: 2021/11/6 14:46
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task02 {
    /**
     * isPrimer
     * @desctiptopn
            判断是否是素数
     * @param num:
     * @version 0.1.0
     * @return boolean
     * @author Lilin
     * @since 0.1.0
     */
    public static boolean isPrimer(int num){
        int te = 2;
        int one = 1;
        if(num==0){
            return false;
        }
        for(int i=2;i<=num/te;i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int start = 100;
        int end = 200;
        for(int i=start;i<=end;i++){
            if(isPrimer(i)){
                System.out.println(i);
            }
        }
    }
}
