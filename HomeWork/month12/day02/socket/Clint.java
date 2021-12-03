package month12.day02.socket;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

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
//        Socket socket = new Socket("10.7.165.104",8124);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        System.out.println("输入你的名字");
        bw.write(scanner.next());
        bw.newLine();
        bw.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println(str);
    }
}
