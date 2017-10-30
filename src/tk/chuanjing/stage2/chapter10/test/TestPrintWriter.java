package tk.chuanjing.stage2.chapter10.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ChuanJing
 * @date 2017年4月23日 下午5:39:27
 * @version 1.0
 */
public class TestPrintWriter {

	public static void main(String[] args) throws IOException {
//		PrintWriter pw = new PrintWriter("result.txt");
//		pw.println("发掘埃及");
//		pw.println("wdw");
//		pw.println("ddsdssd");
//		pw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("res//我爱学习.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("res//result.txt"));
		
		String line = null;
//		while(br.readLine() != null) {
//			line = br.readLine();
//			pw.println(line);
//		}
		
		while((line = br.readLine()) != null) {
			pw.println(line);
		}
		
		br.close();
		pw.close();
	}

}
