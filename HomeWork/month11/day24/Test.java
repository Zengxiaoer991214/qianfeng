package month11.day24;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/24 16:38
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {

//        Collections
        List<Integer> numberList = Arrays.asList(1);
        numberList.add(2);

        for (Integer num : numberList) {
            System.out.println(num);
        }
    }
}
