package month12.day03;

import com.sun.org.apache.bcel.internal.Const;
import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * ClassName: Test
 * Description:
 * date: 2021/12/3 10:01
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    @SneakyThrows
    public static void main(String[] args){
        Class<?> clazz = Class.forName("month12.day03.Student");
        System.out.println(clazz);

        Constructor<?>[] constructor = clazz.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructor));
    }
}
