package month11.day13;

/**
 * ClassName: Car
 * Description:
 * date: 2021/11/13 13:29
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Car extends Vehicle{
    public Car(String color, int sitCount) {
        super(color, sitCount);
    }
    public void startCar(){
        super.start();
        System.out.print("汽车\n");
    }
}
