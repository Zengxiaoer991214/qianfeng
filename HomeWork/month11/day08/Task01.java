package month11.day08;

import java.util.Scanner;

/**
 * ClassName: Task01
 * Description:
 *
 * 1.	键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
 *
 * date: 2021/11/6 14:40
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task01 {
    private int num;

    public Task01(int num) {
        this.num = num;
    }
    public void printTable(){
        for(int i=1;i<=this.num;i++){
            for(int j=1;j<=i;j++){
                System.out.format("%3d*%1d=%2d",i,j,i*j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字（1-9）");
        int num = scanner.nextInt();
        Task01 task01 = new Task01(num);
        task01.printTable();
    }
}
