package month11.day19;

import java.lang.reflect.Field;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/19 10:28
 *
 * @author: Lilin
 * @since JDK 1.8
 */
import java.lang.reflect.Field;
import java.util.Random;

public class Test {
    public static void main(String[] args){

        String reg = "^(19[0-9][0-9])|((20)[0-1][0-9])|((20)2[0-1])$";
        System.out.println("2022".matches(reg));
        System.out.println("2021".matches(reg));
        System.out.println("1997".matches(reg));
        System.out.println("1900".matches(reg));
        System.out.println("1899".matches(reg));
        System.out.println("2000".matches(reg));

    }
}
