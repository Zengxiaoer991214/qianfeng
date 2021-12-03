package month11.day15;

/**
 * ClassName: Cat
 * Description:
 * date: 2021/11/15 10:43
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Cat extends Pet{
    private String strain;
    public Cat(String strain) {
        this.strain = strain;
    }

    public Cat(String name, int age, int health, String strain) {
        super(name, age, health);
        this.strain = strain;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("猫猫",3,100,"miaomiao");
        System.out.println(cat);
    }
}
