package Test;

import java.io.*;
import java.net.*;
import java.util.*;

import ch19.lecture.p01network.*;

public class Test67 {
	public static void main(String[] args) {
		Test66 o1 = new Test66();
		String ip = "172.30.1.32";
		int port = 50500;
		boolean run = true;
		o1.setInput("");

		try (ServerSocket serverSocket = new ServerSocket(port);
				Socket socket1 = new Socket(ip, port);) {
			while (run) {
				System.out.println("연결 기다리는중.....");
				Socket socket = serverSocket.accept();
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos);
				Thread t = new Thread(() -> {
					try (
							InputStream is = socket.getInputStream();
							BufferedInputStream bis = new BufferedInputStream(is);
							InputStreamReader isr = new InputStreamReader(bis);) {
						Scanner scanner = new Scanner(System.in);
//						System.out.println("서버에게 보낼 데이터 작성>");
						o1.setInput(scanner.nextLine());
						char[] data = new char[1024];
						int len = 0;
//						System.out.println("입력 받는중.....");
						while ((len = isr.read(data)) != -1) {
							o1.setInput(new String(data, 0, len));
							System.out.println(o1.getInput());
						}

					} catch (Exception e) {
						e.printStackTrace();
					}

				});
				t.start();
				t.join();
				if (o1.getInput().equals("종료")) {
					run = false;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}
}
