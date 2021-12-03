package month11.day29.Singleton;

import java.util.concurrent.FutureTask;

/**
 * ClassName: StudentCallTest
 * Description:
 * date: 2021/11/29 14:18
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class StudentCallTest {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
           new Thread(() -> System.out.println(Student.getInstance())).start();
        }
    }
}
