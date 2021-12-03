package month11.day19;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName: Task01
 * Description:
 *
 * 传入一个字符串，字符串abbbaccabab
 *
 * date: 2021/11/19 14:01
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task01 {
    public static int[] searchStrAt(String targetString, String pattern){
        ArrayList<Integer> result = new ArrayList<>();
        int index;
        do {
            index = targetString.indexOf(pattern,result.size()>0?result.get(result.size()-1)+1:0);
            if(index!=-1){
                result.add(index);
            }
        } while (index!=-1&&result.get(result.size()-1)<(targetString.length()-pattern.length()));
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        String str = "123abjdaabsdjkabkkkab";
        String str2 = "ab";
        System.out.println(Arrays.toString(searchStrAt(str, str2)));
    }
}
