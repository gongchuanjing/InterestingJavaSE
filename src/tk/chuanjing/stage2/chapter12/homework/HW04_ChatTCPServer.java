package tk.chuanjing.stage2.chapter12.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author ChuanJing
 *
 */
public class HW04_ChatTCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();
		
		while(true) {
			// 接收
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str = br.readLine();
			System.out.println(str);
			
			// 从键盘读取
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("服务端-请输入：");
			String readLine = br1.readLine();
			
			if("quit".equals(readLine)) {
				break;
			}
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			pw.println(readLine);
		}
		
	}
}