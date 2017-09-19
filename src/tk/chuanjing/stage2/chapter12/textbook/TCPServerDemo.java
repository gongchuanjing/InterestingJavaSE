package tk.chuanjing.stage2.chapter12.textbook;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ChuanJing
 * @date 2017年9月18日 下午5:57:57
 * @version 1.0

	使用TCP协议接收数据
 		创建接收端Socket对象
 		监听（阻塞）
 		获取输入流对象
 		获取数据
 		输出数据
 		释放资源
 		
 	ServerSocket：接收端，服务端Socket
 	ServerSocket(int port) 
 	Socket accept() 
 */
public class TCPServerDemo {
	public static void main(String[] args) throws IOException  {
		//创建接收端Socket对象
		ServerSocket ss = new ServerSocket(10086);
 		
		//监听（阻塞）
		Socket s = ss.accept();
 		
		//获取输入流对象
		InputStream is = s.getInputStream();
 		
		//获取数据
		byte[] bys = new byte[1024];
		int len;//用于存储读到的字节个数
		len = is.read(bys);
 		
		//输出数据
		InetAddress address = s.getInetAddress();
		System.out.println("client ---> " + address.getHostName());
		System.out.println(new String(bys,0,len));
 	
		//释放资源
		s.close();
		//ss.close();
	}
}