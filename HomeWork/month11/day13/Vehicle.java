package month11.day13;

/**
 * ClassName: Vehicle
 * Description:
 * date: 2021/11/13 13:28
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Vehicle {
    private String color;

    public Vehicle(String color, int sitCount) {
        this.color = color;
        this.sitCount = sitCount;
    }

    private int sitCount;
    public void start(){
        System.out.print("启动");
    }
}
