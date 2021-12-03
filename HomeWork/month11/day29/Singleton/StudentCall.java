package month11.day29.Singleton;

import java.util.concurrent.Callable;

/**
 * ClassName: StudentCall
 * Description:
 * date: 2021/11/29 14:17
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class StudentCall implements Callable<Student> {
    @Override
    public Student call() throws Exception {
        Student student = Student.getInstance();
        System.out.println(student.hashCode());
        return student;
    }
}
