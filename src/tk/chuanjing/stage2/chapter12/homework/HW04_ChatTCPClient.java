package tk.chuanjing.stage2.chapter12.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 需求：使用TCP协议制作聊天小程序;一个客户端,一个服务端;能聊起来就好.自由发挥;
 * 
 * 客户端
 */
public class HW04_ChatTCPClient {
	public static void main(String[] args) throws IOException{
		Socket s = new Socket(InetAddress.getByName("DESKTOP-274799T"),8888);
		
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("客户端-请输入：");
			String str = br.readLine();
			if("quit".equals(str)) {
				break;
			}
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			pw.println(str);
			
			// 接收
			BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str1 = br1.readLine();
			System.out.println(str1);
		}
	}
}