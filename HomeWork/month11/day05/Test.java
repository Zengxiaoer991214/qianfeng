package month11.day05;

import java.util.Scanner;

/**
 * ClassName: Test
 * Description:
 *
 *  输出1900 - 2021有多少个闰年
 *
 * date: 2021/11/5 11:06
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int count = 0;
        for(int i=1900;i<=2021;i++){
            if(i%400==0||(i%4==0&&i%100!=0))
                count++;
        }
        System.out.format("从1900年-2021年，一共有%d个闰年",count);*/

       /* String s = "OK";
        do{
            System.out.println("是否合格？OK/NO");
            String input = scanner.next();
            if(input.equals(s)){
                System.out.println("恭喜你合格了");
                return;
            }
            System.out.println("不合格");
        } while (true);*/
        /*System.out.println("请输入一个非负整数");
        int num = scanner.nextInt();
        int sum = 1;
        for(int i=1;i<=num;i++){
            sum*=i;
        }
        System.out.format("%d的阶乘是%d",num,sum);*/
        /*int sum=0;
        for(int i=0;i<5;){
            System.out.format("请输入第%d个同学的成绩",i+1);
            int score = scanner.nextInt();
            if(score<0||score>100){
                System.out.println("数据错误，重新输入");
                continue;
            }
            i++;
            sum += score;
        }
        System.out.println("他们的平均分是:"+sum/5);*/
        int count = 10;
        for(int i=0;i<=count;i++) {
            if(i<count/2){
                for(int j=count/2-i;j>=0;j--){
                    System.out.print(" ");
                }
                if(i==0){
                    System.out.print("*");
                }
                else {
                    System.out.print("*");
                    for(int j=i*2-1;j>0;j--){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                for(int j=count/2-i;j>=0;j--){
                    System.out.print(" ");
                }
            }
            else{
                for(int j=i-count/2;j>=0;j--){
                    System.out.print(" ");
                }
                if(i==count){
                    System.out.print("*");
                }
                else {
                    System.out.print("*");
                    for(int j=count-1-(i-count/2)*2;j>0;j--){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                for(int j=i-count/2;j>=0;j--){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
