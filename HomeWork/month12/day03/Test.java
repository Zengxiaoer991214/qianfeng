package month12.day03;

import lombok.SneakyThrows;

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
    }
}
