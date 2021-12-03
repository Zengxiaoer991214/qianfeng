package month11.day05;

import java.util.Scanner;

/**
 * ClassName: Task05
 * Description:
 *
 * 5.	模拟ATM取款机的三次密码校验，当天达到3次输入密码错误，
 *      则提示“账号被冻结”，其他情况则提示还有多少次输入机会.
 *
 * date: 2021/11/5 10:44
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count =3;
        String password ="123";
        String input;
        while (count>0){
            System.out.println("请输入密码");
            input = scanner.next();
            if(!input.equals(password)){
                count--;
                System.out.format("密码错误,还剩%d次\n",count);
                System.out.println("是否继续输入密码？Y/N");
                String flag = scanner.next();
                if(!"Y".equals(flag)){
                    return;
                }
            }
            else {
                System.out.println("密码正确");
                return;
            }
        }
        System.out.println("账号被冻结");
    }
}
