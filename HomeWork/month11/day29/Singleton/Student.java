package month11.day29.Singleton;

/**
 * ClassName: Student
 * Description:
 * date: 2021/11/29 14:14
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Student {
    public static final Student STUDENT = new Student();
    private Student(){

    }
    public static Student getInstance(){
        return STUDENT;
    }
}
