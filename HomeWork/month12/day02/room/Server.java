package month12.day02.room;

import lombok.SneakyThrows;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Server
 * Description:
 * date: 2021/12/2 16:58
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Server {

    private final List<Clint> clints = new ArrayList<>();
    @SneakyThrows
    private void start() {
        ServerSocket server = new ServerSocket(8888);
        while (true){
            Socket socket = server.accept();
            Clint clint =  new Clint(socket);
            clints.add(clint);
            System.out.println(socket.getInetAddress().getHostName()+"进入");
            new Thread(clint).start();
        }
    }
    private class Clint implements Runnable{
        private final Socket socket;
        private String name;
        public Clint(Socket socket) {
            this.socket = socket;
        }
        @SneakyThrows
        @Override
        public void run() {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.name = br.readLine();
            sendMessage("欢迎"+this.name+"进入");
            while (true){
                try {
                    BufferedReader br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String message;
                    if ((message=br2.readLine()).equals("over")){
                        sendMessage(name+"退出聊天室");
                        clints.remove(this);
                        break;
                    }
                    sendMessage(name+"说"+message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        @SneakyThrows
        public void sendMessage(String s){
            for (Clint clint:
                clints ) {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clint.socket.getOutputStream()));
                bw.write(s);
                bw.newLine();
                bw.flush();
            }
        }
    }
    public static void main(String[] args) {
        new Server().start();
    }
}
