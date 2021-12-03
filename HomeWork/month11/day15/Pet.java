package month11.day15;

/**
 * ClassName: pet
 * Description:
 * date: 2021/11/15 10:41
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Pet {
    private String name;
    private int age;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Pet() {
    }

    public Pet(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }
}
