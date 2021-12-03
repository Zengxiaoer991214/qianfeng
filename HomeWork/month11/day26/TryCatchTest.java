package month11.day26;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: TryCatchTest
 * Description:
 * date: 2021/11/26 11:12
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class TryCatchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入被除数");
                int num1 = scanner.nextInt();
                System.out.println("请输入除数");
                int num2 = scanner.nextInt();
                System.out.println(num1/num2);
            }catch (InputMismatchException e){
                System.out.println("输入不匹配");
                scanner.next();
            }catch (ArithmeticException e){
                System.out.println("除数不能为0");
            }
            finally {
                System.out.println("关闭资源");
//                scanner.close();
            }
        }

    }
}
