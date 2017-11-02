package tk.chuanjing.stage2.chapter12.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 利用TCP复制文件，服务端
 * 
 * @author ChuanJing
 */
public class TCPCopyService {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(1566);
			Socket accept = serverSocket.accept();
			OutputStream out = accept.getOutputStream();
//			InputStream in = accept.getInputStream();
			//从文件中读取数据
			FileInputStream fileInputStream = new FileInputStream(new File("D:\\develop\\a.txt"));
			byte[] arr = new byte[1024];
			int len;
			while((len = fileInputStream.read(arr, 0, arr.length)) != -1){
				//发送
				out.write(arr,0,len);
			}
			out.close();
//			in.close();
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
