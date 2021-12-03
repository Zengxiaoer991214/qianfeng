package month11.day26;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: ThreadStudent
 * Description:
 * date: 2021/11/26 15:24
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class ThreadStudent extends Thread{
    private final String[] student = {"张三", "李四", "王五", "周六", "赵七", "刘八"};
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    @Override
    public void run() {
        do {
            try {
                for (int i = 3; i > 0; i--) {
                    System.out.format("%d秒之后抽取学生\n",i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int num = random.nextInt(6);
            System.out.println("抽取的学生姓名是:     "+ student[num]);
            System.out.println("==========================");
            System.out.println("输入y/n继续");
        }while ("y".equals(scanner.next()));
    }
}
