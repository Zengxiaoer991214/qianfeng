package month12.day02.ss;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client3 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("10.7.165.103", 8124);
		Scanner input = new Scanner(System.in);
		// ��ΪҪͬʱ���ձ��˵����֣���Ҫ����������Ϣ��������Ҫ�࿪һ���߳���������Ϣ
		new Thread(new Runnable() {
			public void run() {
				// ���յ���Ϣ�����������̨
				while (true) {
					BufferedReader reader = null;
					try {
						reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						String msg = reader.readLine();
						System.out.println(msg);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

		// ��������
		System.out.println("���ӳɹ���������������");
		String name = input.next();
		BufferedWriter bwr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bwr.write(name);
		bwr.newLine();
		bwr.flush();

		boolean flag = true;
		// �����������
		while (flag) {
			System.out.println("qingshuru");
			String msg = input.next();
			BufferedWriter bwr2 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bwr2.write(msg);
			bwr2.flush();
		}

	}
}
