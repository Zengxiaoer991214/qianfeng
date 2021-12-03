package month11.day27.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Dog
 * Description:
 * date: 2021/11/27 15:59
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Dog extends Pet{

    @Override
    public HashMap t() {
        System.out.println("返回值是hashmap");
        return null;
    }

    public static void main(String[] args) {
        Pet pet = new Pet();
        Dog dog = new Dog();
        pet.t();
        dog.t();
    }
}
