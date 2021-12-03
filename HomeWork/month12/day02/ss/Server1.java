package month12.day02.ss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server1 {
	List<SocketThread> list = new ArrayList<>();

	public void Serv(){
		ServerSocket serv = null;
		try {
			serv = new ServerSocket(8124);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		while (true) {
			Socket socket = null;
			try {
				assert serv != null;
				socket = serv.accept();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(socket.getInetAddress().getHostName() + "  ����������");
			SocketThread sktr = new SocketThread(socket);
			list.add(sktr);
			new Thread(sktr).start();
		}
	}
	public static void main(String[] args) throws IOException {
		new Server1().Serv();
	}

	public class SocketThread implements Runnable {
		Socket socket;
		String name;
		public SocketThread() {
		}
		public SocketThread(Socket socket) {
			super();
			this.socket = socket;
		}
		public void run() {
			BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				name = br.readLine();
				System.out.println("��ӭ" + name + "!!");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			while (true) {
				try {
					BufferedReader br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String msg = br2.readLine();
					sendMsg(name + "˵" + msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		public void sendMsg(String msg) {
			try {
				for (SocketThread sth : list) {
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sth.socket.getOutputStream()));
					bw.write(msg);
					bw.newLine();
					bw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
