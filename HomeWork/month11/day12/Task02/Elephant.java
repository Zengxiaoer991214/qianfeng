package month11.day12.Task02;

/**
 * ClassName: Elephant
 * Description:
 * date: 2021/11/12 22:42
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Elephant {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                '}';
    }

    public Elephant(String name) {
        this.name = name;
    }
}
