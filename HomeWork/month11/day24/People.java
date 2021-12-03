package month11.day24;

/**
 * ClassName: People
 * Description:
 * date: 2021/11/24 14:40
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class People {
    private String name;
    private String number;

    public People(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return hashCode()==((People)obj).hashCode();
    }
}
