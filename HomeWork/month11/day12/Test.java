package month11.day12;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/12 16:30
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("小白",100,100);
        cat.setLives(100);
        Dog dog = new Dog("小黄",100,100);
        dog.setStrain("柴犬");
        System.out.println(cat.toString());
        System.out.println(dog.toString());
    }
}
