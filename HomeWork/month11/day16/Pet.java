package month11.day16;

/**
 * ClassName: Pet
 * Description:
 * date: 2021/11/16 10:49
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public abstract class Pet {
    private String name;
    private int age;

    public Pet() {
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void show();
}
