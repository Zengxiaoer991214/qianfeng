package month12.day01.homework.task01;


/**
 * ClassName: Rabbit
 * Description:
 * 有一对兔子，从出生后第3个月起每个月都生一对，
 * 小兔子长到第三个月每个月又生了一对兔子，
 * 假如兔子都不死，问第8个月的兔子对数为多少？
 * 请先分析出其中的规律，然后使用代码实现求第N个月共会有多少对兔子
 * 难点：找规律，
 * 1，1，
 * public static int get(int month){}
 * 斐波那契数列
 * date: 2021/12/1 18:50
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Rabbit {
    public static int fun(int date){
        if (date==1||date==2){
            return 1;
        }
        else return fun(date-1)+fun(date-2);
    }

    public static void main(String[] args) {

        System.out.println(fun(40));
    }
}
