package tk.chuanjing.stage2.chapter12.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 利用TCP复制文件，客户端
 * 
 * @author ChuanJing
 */
public class TCPCopyClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("localhost"),1566);
//			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			
			FileOutputStream outputStream = new FileOutputStream(new File("D:\\a.txt"));
			//接受
			byte[] arr = new byte[1024];
			int len;
			while((len = in.read(arr, 0, arr.length)) != -1){
				outputStream.write(arr,0,len);
				outputStream.flush();
			}
			outputStream.close();
			in.close();
//			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
