package month11.day08;

/**
 * ClassName: Task03
 * Description:
 *
 * 3.	闰年，能被4整除而且不能被100整除，或者能被400整除就是闰年
 *      a) 判断某个年份是否为闰年(设计成一个方法)
 *      b) 输出一个范围内的哪些年份是闰年（从2000至2020年）
 *
 * date: 2021/11/6 14:54
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task03 {
    public static boolean isLeapYear(int year){
        return (year%400==0)||(year%4==0&&year%100!=0);
    }
    public static void main(String[] args) {
        int start = 2000;
        int end = 2020;
        for(int i=start;i<=end;i++){
            if(isLeapYear(i)){
                System.out.format("%d年是闰年\n",i);
            }
            else {
                System.out.format("%d年不是闰年\n",i);
            }
        }
    }
}
