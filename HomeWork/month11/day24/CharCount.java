package month11.day24;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: CharCount
 * Description:
 * date: 2021/11/24 14:02
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class CharCount {
    public static void main(String[] args) {

        HashMap<Character, Integer> count = new HashMap<>();
        String s= "abbasddppdappkljlkzdsndladnzczxc";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!count.containsKey(ch)){
                count.put(ch,1);
            }else {
                count.put(ch, count.get(ch)+1);
            }
        }
        System.out.println(count);
        for (Character ch:count.keySet()){
            System.out.println(ch);
        }
        for(Integer integer:count.values()){
            System.out.println(integer);
        }
        for (Map.Entry<Character,Integer> entry:count.entrySet()){
            System.out.println(entry.getKey()+"++"+entry.getValue());
        }

    }
}
