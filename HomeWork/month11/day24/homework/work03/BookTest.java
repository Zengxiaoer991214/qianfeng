package month11.day24.homework.work03;

import java.util.Map;
import java.util.TreeMap;

/**
 * ClassName: BookTest
 * Description:
 * date: 2021/11/24 17:36
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class BookTest {
    public static void main(String[] args) {
        TreeMap<Book,String> bookStringTreeMap = new TreeMap<Book,String>(){{
            put(new Book("格林童话",45.0),"童话书");
            put(new Book("格林童话 第二版",57.0),"童话书");
            put(new Book("C primer plus",77.0),"编程书");
            put(new Book("Effect Java",97.0),"编程书");
        }};
        for (Map.Entry entry:bookStringTreeMap.entrySet()){
            System.out.println(entry.getKey()+"======"+entry.getValue());
        }
    }
}
