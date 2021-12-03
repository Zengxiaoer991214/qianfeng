package month11.day24.homework.work02;

import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Description:
 * date: 2021/11/24 17:27
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class EmployeeTest {
    public static void main(String[] args) {
        TreeSet<Employee> treeSet = new TreeSet<Employee>(){{
            add(new Employee("张三",20,2000));
            add(new Employee("李四",22,2100));
            add(new Employee("王五",20,2000));
            add(new Employee("周六",20,2300));
            add(new Employee("刘七",25,2000));
        }};
        for (Employee e:treeSet){
            System.out.println(e);
        }
    }
}
