package month11.day12.zoo;

/**
 * ClassName: Elephant
 * Description:
 * date: 2021/11/12 21:24
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Elephant {
    private String name;
    private int weight;

    public void sprayWater(){
        System.out.println("大象用鼻子喷水");
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Elephant(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
