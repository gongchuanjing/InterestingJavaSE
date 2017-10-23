package tk.chuanjing.stage4web.chapter10.imitateTomcat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class MyService implements Runnable{

	private Socket socket;

	public MyService(Socket socket) throws Exception {
		this.socket = socket;
	}

	@Override
	public void run() {
		/*
		GET /index.html HTTP/1.1
		/index.html
		GET /css/bootstrap.min.css HTTP/1.1
		/css/bootstrap.min.css
		GET /css/bootstrap-theme.min.css HTTP/1.1
		/css/bootstrap-theme.min.css
		GET /js/jquery-1.11.3.min.js HTTP/1.1
		/js/jquery-1.11.3.min.js
		GET /js/bootstrap.min.js HTTP/1.1
		/js/bootstrap.min.js
		*/
		
		// 提供服务
		try{
			InputStream in = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String firstLine = reader.readLine();
			System.out.println(firstLine);
			String path = firstLine.split(" ")[1];
			System.out.println(path);
			// 从文件读， 往浏览器写 
//			File file = new File("webapps"+path);
			File file = new File("imitateTomcat"+path);
			FileInputStream fis = new FileInputStream(file);
			
			OutputStream os = socket.getOutputStream();
			os.write("HTTP/1.1 200 OK\r\n".getBytes());
			os.write("\r\n".getBytes());
			
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer))!=-1) {
				os.write(buffer, 0, len);
			}
			socket.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}