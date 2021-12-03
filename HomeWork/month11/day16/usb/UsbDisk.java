package month11.day16.usb;

/**
 * ClassName: UsbDisk
 * Description:
 * date: 2021/11/16 14:49
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class UsbDisk implements IUsb{

    @Override
    public void service() {
        System.out.println("U盘实现了USB接口，版本"+VERSION);
    }
}
