package month11.day13;

import month11.day13.Vehicle;

/**
 * ClassName: Plane
 * Description:
 *
 * date: 2021/11/13 13:31
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Plane extends Vehicle {
    public Plane(String color, int sitCount) {
        super(color, sitCount);
    }
    public void startPlane(){
        super.start();
        System.out.format("飞机\n");
    }
}
