package month11.day12.kitchen;

/**
 * ClassName: Fridge
 * Description:
 * date: 2021/11/12 17:49
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Fridge {
    private String name;
    private String size;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Fridge(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void open(){
        System.out.println("打开了冰箱");
    }
    public void close(){
        System.out.println("关闭了冰箱");
    }
}
