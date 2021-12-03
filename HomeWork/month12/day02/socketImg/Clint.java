package month12.day02.socketImg;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName: Clint
 * Description:
 * date: 2021/12/2 14:35
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Clint {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Socket socket = new Socket("10.7.165.103",8888);
        InputStream is = new FileInputStream("d:/111/pic.png");
        OutputStream op = socket.getOutputStream();

        int len;
        byte[] buf = new byte[1024*8];
        while ((len=is.read(buf))!=-1){
            op.write(buf,0,len);
        }
        op.flush();
        is.close();

    }
}
