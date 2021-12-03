package month12.day02.socketImg;

import lombok.SneakyThrows;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: Test01
 * Description:
 * date: 2021/12/2 14:31
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test01 {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
//        while (true) {
            Socket socket = server.accept();
            InetAddress ia = socket.getInetAddress();
            System.out.println(ia.getHostName()+"登录");
            InputStream is = socket.getInputStream();
            OutputStream os = new FileOutputStream("d:/112/pic.png");
            int len;
            byte[] buf = new byte[1024*18];
            while ((len=is.read(buf))!=-1){
                os.write(buf,0,len);
            }
//            os.flush();
//            os.close();
//            is.close();
            System.out.println("上传完成");
//        }
    }
}


