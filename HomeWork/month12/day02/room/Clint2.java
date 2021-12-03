package month12.day02.room;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName: Clint
 * Description:
 * date: 2021/12/2 17:24
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Clint2 {
//    @SneakyThrows
    public static boolean isOpen = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Socket socket = null;
        try {
            socket = new Socket("10.7.165.103",8124);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        System.out.println("输入你的名字");
        bw.write(scanner.next());
        bw.newLine();
        bw.flush();

        Socket finalSocket = socket;
        Thread thread = new Thread(()->{
        while (!isOpen) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(finalSocket.getInputStream()));
                String message= null;
                if ((message=br.readLine())!=null){
                    System.out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        });
        thread.start();
        while (true){
            System.out.println("请输入消息");
            String str = scanner.next();
            BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw2.write(str);
            bw2.newLine();
            bw2.flush();
            if ("over".equals(str)){
                System.out.println("退出成功");
                isOpen = true;
                break;
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
