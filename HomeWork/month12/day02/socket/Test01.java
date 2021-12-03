package month12.day02.socket;

import jdk.internal.util.xml.impl.Input;
import lombok.SneakyThrows;
import month11.day26.Interrupt.Interrupt;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * ClassName: Test01
 * Description:
 * date: 2021/12/2 14:31
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test01 {
    @SneakyThrows
    public static void main(String[] args) {
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            Socket socket = server.accept();
            InetAddress ia = socket.getInetAddress();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = br.readLine();
            System.out.println(ia.getHostAddress()+"--"+str+"登陆了服务器");

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("欢迎"+ia.getHostAddress()+"--"+str+"登录");
            bw.newLine();
            bw.flush();
        }
    }
}
