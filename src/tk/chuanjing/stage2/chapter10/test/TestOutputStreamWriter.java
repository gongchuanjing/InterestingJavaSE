package tk.chuanjing.stage2.chapter10.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author ChuanJing
 * @date 2017年4月23日 下午4:43:35
 * @version 1.0

 * 需求：读取项目根目录下的我爱学习.txt，并输出到命令行
 * 数据源：项目根目录下的我爱学习.txt		BufferedReader
 * 目的地：命令行	System.out
 */
public class TestOutputStreamWriter {

	public static void main(String[] args) throws IOException {
		String FilePath = "res//我爱学习.txt";
		BufferedReader br = new BufferedReader(new FileReader(FilePath));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line;
		while ( (line = br.readLine()) != null ) {
			bw.write(line);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}
