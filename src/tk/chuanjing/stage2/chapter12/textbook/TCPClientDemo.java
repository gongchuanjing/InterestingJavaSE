package tk.chuanjing.stage2.chapter12.textbook;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author ChuanJing
 * @date 2017年9月18日 下午5:33:37
 * @version 1.0

	使用TCP协议发送数据
		创建发送端Socket对象（创建连接）
		获取输出流对象
		发送数据
		释放资源
		
	Socket(InetAddress address, int port) 
	Exception in thread "main" java.net.ConnectException: Connection refused: connect

 */
public class TCPClientDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端Socket对象（创建连接）
		Socket s = new Socket(InetAddress.getByName("DESKTOP-274799T"),10086);
		
		//获取输出流对象
		OutputStream os = s.getOutputStream();
		
		//发送数据
		String str = "hello tcp,im comming!!!";
		os.write(str.getBytes());
		
		//释放资源
		//os.close();
		s.close();
	}
}