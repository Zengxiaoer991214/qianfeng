package month11.day12;

/**
 * ClassName: Dog
 * Description:
 * date: 2021/11/12 16:28
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Dog extends Animal{
    public Dog(String name, int health, int love) {
        super(name, health, love);
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    private String strain;

    @Override
    public String toString() {
        return "Dog{" +super.toString()+
                "strain='" + strain + '\'' +
                '}';
    }
}
