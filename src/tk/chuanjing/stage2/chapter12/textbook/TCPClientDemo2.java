package tk.chuanjing.stage2.chapter12.textbook;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 使用TCP协议发送数据，服务端将接收到的数据转换成大写返回给客户端
 * 
 * 客户端
 * 
 * @author ChuanJing
 * @date 2017年4月27日 下午5:46:14
 * @version 1.0
 */
public class TCPClientDemo2 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket(InetAddress.getByName("127.0.0.1"), 10086);
		// 发送数据
		OutputStream os = s.getOutputStream();
		os.write("ni hao, wo shi tcp, wo you lai le".getBytes());
		
		// 接收数据
		InputStream is = s.getInputStream();
		byte[] bytes = new byte[1024];
		int len = is.read(bytes);
		
		System.out.println("服务器地址：" + s.getInetAddress().getHostAddress()
				+ ", 消息内容：" + new String(bytes, 0, len));
		
		s.close();
	}
}
