package month11.day24.homework.work04;

import java.util.*;

/**
 * ClassName: Work04
 * Description:
 * date: 2021/11/24 17:50
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Work04 {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>(){{
            put("张三",24);
            put("李四",23);
            put("王五",22);
            put("周六",21);
        }};
        List<Map.Entry> list = new ArrayList<>(stringIntegerHashMap.entrySet());
        list.sort(Comparator.comparingInt(o -> (int) o.getValue()));

        Collections.sort(list, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return (int)o1.getValue()-(int) o2.getValue();
            }
        });

        System.out.println(list);
        HashMap<String, Integer> map = new HashMap<>();
        for (Map.Entry entry: list){
            System.out.println(entry);
            map.put((String)entry.getKey(),(Integer) entry.getValue());
        }
        System.out.println(map);
        System.out.println(map);
        System.out.println(map);
        System.out.println(map);
        System.out.println(map);

    }
}
