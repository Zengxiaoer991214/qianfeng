package month12.day02;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * ClassName: Test
 * Description:
 * date: 2021/12/2 11:29
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(Arrays.toString(inetAddress.getAddress()));
        System.out.println(inetAddress.getCanonicalHostName());
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());
        InetAddress inetAddress1 = InetAddress.getByName("10.7.165.104");
        System.out.println(inetAddress1.getHostName());
    }
}
