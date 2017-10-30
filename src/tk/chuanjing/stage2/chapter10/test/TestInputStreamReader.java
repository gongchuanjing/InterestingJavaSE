package tk.chuanjing.stage2.chapter10.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ChuanJing
 * @date 2017年4月23日 下午5:06:06
 * @version 1.0

 	需求：读取键盘录入的数据，并输出到项目根目录下的a.txt文件中
 * 
 * 数据源：读取键盘录入的数据	System.in
 * 目的地：项目根目录下的a.txt	FileWriter
 * 
 * 转换流：需要把字节输入流转换成字符输入流，InputStreamReader
 * InputStreamReader(InputStream in) 
 */
public class TestInputStreamReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
		
		String line;
		while( (line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		br.close();
		bw.close();
	}

}
