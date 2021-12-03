package month11.day13;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/13 13:33
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car("白色", 4);
        car.startCar();
        Plane plane = new Plane("白色",40);
        plane.startPlane();

        Rectangle rectangle = new Rectangle(4,5.0);
        System.out.println("面积是"+rectangle.getArea());
        System.out.println("周长是"+rectangle.getCircumference());

        Column column = new Column(rectangle,4.0);
        System.out.println("表面积是"+column.getSurfaceArea());
        System.out.println("体积是"+column.getVolume());
    }
}
