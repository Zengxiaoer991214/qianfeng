package month11.day16;

/**
 * ClassName: Dog
 * Description:
 * date: 2021/11/16 10:53
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Dog extends Pet{
    private int loves;

    public Dog() {
    }

    public Dog(int loves) {
        this.loves = loves;
    }

    public Dog(String name, int age, int loves) {
        super(name, age);
        this.loves = loves;
    }

    @Override
    public void show() {
        System.out.println("小狗吃");
    }

    public static void main(String[] args) {
        Pet pet = new Dog("小狗",23,100);
        pet.show();
    }
}
