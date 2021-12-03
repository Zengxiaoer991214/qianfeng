package month11.day16.usb;

/**
 * ClassName: TypeC
 * Description:
 * date: 2021/11/16 14:52
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class TypeC implements IUsb{

    @Override
    public void service() {
        System.out.println("TypeC 实现了USB接口，版本"+VERSION);
    }
}
