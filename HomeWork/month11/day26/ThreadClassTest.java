package month11.day26;

/**
 * ClassName: ThreadClassTest
 * Description:
 * date: 2021/11/26 14:47
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class ThreadClassTest {
    public static void main(String[] args) {
//        ThreadStudent threadStudent = new ThreadStudent();
//        threadStudent.start();

        new ThreadClass(true).start();
        new ThreadClass(false).start();

    }
}
