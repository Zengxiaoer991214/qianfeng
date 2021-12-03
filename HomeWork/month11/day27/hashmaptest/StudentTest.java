package month11.day27.hashmaptest;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: StudentTes
 * Description:
 * date: 2021/11/27 10:36
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class StudentTest {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<Student, String>(){{
            put(new Student("小李", 22),"四川");
            put(new Student("小李", 21),"四川");
            put(new Student("小张", 23),"四川");
        }};
        for (Map.Entry<Student, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
    }
}
