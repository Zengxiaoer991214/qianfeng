package month11.day23.student;


import com.sun.xml.internal.ws.spi.db.RepeatedElementBridge;

import java.util.Collection;
import java.util.TreeSet;

/**
 * ClassName: StudentTest
 * Description:
 * date: 2021/11/23 15:27
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class StudentTest {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>(){{
            add(new Student("张三",20,30000));
            add(new Student("张四",21,30000));
            add(new Student("张五",20,10000));
            add(new Student("张六",22,10000));
            add(new Student("张七",19,90000));
            add(new Student("张八",19,90000));
        }};
        for (Student student:treeSet){
            System.out.println(student);
        }
        System.out.println("=======================================");
        TreeSet<Student> treeSet2 = new TreeSet<Student>((o1, o2) -> o1.getSalary()==o2.getSalary()?
                o1.getAge()-o2.getAge(): o1.getSalary()-o2.getSalary()
        ){{
            add(new Student("李三",20,30000));
            add(new Student("李四",21,30000));
            add(new Student("李五",20,10000));
            add(new Student("李六",22,10000));
            add(new Student("李七",19,90000));
            add(new Student("李八",19,90000));
        }};
        for (Student student:treeSet2){
            System.out.println(student);
        }


    }
}
