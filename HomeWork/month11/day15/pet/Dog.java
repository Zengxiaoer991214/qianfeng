package month11.day15.pet;

/**
 * ClassName: Dog
 * Description:
 * date: 2021/11/15 17:11
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Dog extends Pet{
    private final String method="狗叫";

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(this.method);
    }
}
