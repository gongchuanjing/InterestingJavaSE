package tk.chuanjing.stage2.chapter10.homework;

import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在电脑根目录下放一个文本文件.里面写一首诗(内容随意发挥).把诗的内容输出到控制台.
 * 要求:
 *		1.使用所学过字节流
 *		2.使用打印流;  (PrintWriter)
 */
public class Test4 {
	public static void main(String[] args) throws Exception {
		//创建字节流对象
		FileInputStream fis = new FileInputStream("res//test.txt");
		//创建打印流
//		PrintWriter pw = new PrintWriter(System.out);//这里要用转换流
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int len;
		byte [] arr = new byte [1024*8];
		while ((len = fis.read(arr))!=-1) {
			String s = new String(arr);
			pw.println(s);
		}
		fis.close();
	}
}