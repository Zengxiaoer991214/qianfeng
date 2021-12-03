package month11.day05;

/**
 * ClassName: Task04
 * Description:
 *
 * 2.	计算从1到100个值以内所有能被3或者17整除的数的和并输出。
 *
 * date: 2021/11/5 10:44
 *
 * @author: Lilin
 * @since JDK 1.8
 */

public class Task02 {
    public static void main(String[] args) {
        int sum =0;
        for(int i=3;i<=100;i++){
            if(i%3==0||i%17==0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
