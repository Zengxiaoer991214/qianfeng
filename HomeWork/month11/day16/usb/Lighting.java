package month11.day16.usb;

/**
 * ClassName: Lighting
 * Description:
 * date: 2021/11/16 14:54
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Lighting implements IUsb{

    @Override
    public void service() {
        System.out.println("Lighting实现了USB接口，版本"+VERSION);
    }
}
