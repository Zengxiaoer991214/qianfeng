package month12.day02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * ClassName: test03
 * Description:
 * date: 2021/12/2 20:11
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class test03 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<String,String>(){{
           put(null, "abc");
           put("aaa", "AAA");
           put("bbb", "BBB");
           put("ccc", "CCC");
        }};
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){

            String s;
            if ("aaa".equals(s=iterator.next()))
                hashMap.remove("aaa");
            System.out.println(s);
        }
        System.out.println(hashMap);

//        Hashtable<String,String> hashtable = new Hashtable<String,String>(){{
//           put("null", "null");
//        }};
//        System.out.println(hashtable);
    }
}
