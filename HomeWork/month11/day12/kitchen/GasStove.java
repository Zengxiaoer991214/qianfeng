package month11.day12.kitchen;

/**
 * ClassName: GasStove
 * Description:
 * date: 2021/11/12 19:52
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class GasStove {
    private String name;
    private double price;

    public void open(){
        System.out.println("打开煤气灶");
    }

    public void close(){
        System.out.println("关闭煤气灶");
    }
    @Override
    public String toString() {
        return "GasStove{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public GasStove(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
