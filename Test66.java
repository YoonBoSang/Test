package Test;

import java.io.*;
import java.net.*;
import java.util.*;

import ch19.lecture.p01network.*;

public class Test66 {
	private String input;
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public String getInput() {
		return input;
	}
	


	public static void main(String[] args) {
		Test66 o1 = new Test66();
		// ip주소
		String ip = "172.30.1.32";
		boolean run = true;
		o1.setInput(" ");
		// port 번호
		int port = 50500;
		try (Socket socket = new Socket(ip, port);) {
			while (run) {
				Thread t1 = new Thread(() -> {
					try {
						OutputStream os = socket.getOutputStream();
						BufferedOutputStream bos = new BufferedOutputStream(os);
						PrintStream ps = new PrintStream(bos);

						try {
							Scanner scanner = new Scanner(System.in);
							System.out.println("서버에게 보낼 데이터 작성>");
							o1.setInput(scanner.nextLine());
						} catch (Exception e) {
							e.printStackTrace();
						}
						ps.print(o1.getInput());

						ps.flush();
					} catch (Exception e) {
						e.printStackTrace();
					} 
				});
				t1.start();
				t1.join();
				if (o1.getInput().equals("종료")) {
					run = false;
				}
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		System.out.println("클라이언트 종료");
	}
}