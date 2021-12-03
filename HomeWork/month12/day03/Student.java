package month12.day03;

/**
 * ClassName: Student
 * Description:
 * date: 2021/12/3 10:12
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Student {
    private String name;
    private int age;

    public Student(){
    }
    private Student(String name){
        this.name=name;
    }
    private Student(int age){
        this.age = age;
    }
    Student(String name, int age){
        this.name=name;
        this.age = age;
    }
}
