package month11.day26;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Random;

/**
 * ClassName: Test02
 * Description:
 * date: 2021/11/26 15:36
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String s = "java.lang.Character";
        Class cl = Class.forName(s);
        Object o = cl.getConstructor().newInstance('a');
        System.out.println(o.getClass());
    }
}
