package tk.chuanjing.stage2.chapter12.textbook;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 使用TCP协议发送数据，服务端将接收到的数据转换成大写返回给客户端
 * 
 * 服务端
 * 
 * @author ChuanJing
 * @date 2017年4月27日 下午5:54:48
 * @version 1.0
 */
public class TCPServerDemo2 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
		Socket s = ss.accept();
		
		// 接收消息
		InputStream is = s.getInputStream();
		byte[] bytes = new byte[1024];
		int len = is.read(bytes);
		
		String str = new String(bytes, 0, len);
		System.out.println("客户端地址：" + s.getInetAddress().getHostAddress()
				+ ", 消息内容：" + str);
		
		// 转换成大写
		str = str.toUpperCase();
		
		// 发给客户端
		OutputStream os = s.getOutputStream();
		os.write(str.getBytes());
		
		s.close();
//		ss.close();//服务端一般不关闭
	}

}
