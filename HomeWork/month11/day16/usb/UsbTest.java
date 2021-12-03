package month11.day16.usb;

/**
 * ClassName: UsbTest
 * Description:
 * date: 2021/11/16 14:55
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class UsbTest {
    public static void main(String[] args) {
        IUsb[] usbs = new IUsb[3];
        usbs[0] = new UsbDisk();
        usbs[1] = new TypeC();
        usbs[2] = new Lighting();
        for (IUsb u : usbs){
            u.service();
        }
    }
}
