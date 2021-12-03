package month11.day24.homework.work01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: StudentTest
 * Description:
 * date: 2021/11/24 17:10
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class StudentTest {
    public static void main(String[] args) {
        char a = '中';
        System.out.println(a);

        HashMap<Student,Integer> hashSet = new HashMap<Student,Integer>(){{
            put(new Student("张三",1111),1);
            put(new Student("李四",2222),1);
            put(new Student("王五",3333),1);
        }};
        hashSet.put(new Student("张三",4444),1);
        hashSet.put(new Student("张三",1111),1);
        System.out.println(hashSet);
    }
}
