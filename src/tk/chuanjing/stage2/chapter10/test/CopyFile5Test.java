package tk.chuanjing.stage2.chapter10.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用五种方式复制文件
 * 
 * @author ChuanJing
 * @date 2017年4月1日 上午9:15:04
 * @version 1.0
 */
public class CopyFile5Test {

	public static void main(String[] args) throws IOException {
		String srcFileName = "res\\我爱学习.txt";
		String destFileName = "res\\b.txt";
		
//		method1(srcFileName,destFileName);
		method2(srcFileName,destFileName);
//		method3(srcFileName,destFileName);
//		method4(srcFileName,destFileName);
//		method5(srcFileName,destFileName);
	}

	/**
	 * 基本流一次读写一个字符
	 * @param srcFileName
	 * @param destFileName
	 * @throws IOException
	 */
	public static void method1(String srcFileName,String destFileName) throws IOException {
		//创建输入流对象
		FileReader fr = new FileReader(srcFileName);
		//创建输出流对象
		FileWriter fw = new FileWriter(destFileName);
		
		//一次读写一个字符
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		
		//释放资源
		fw.close();
		fr.close();
	}
	
	/**
	 * 基本流一次读写一个字符数组
	 * @param srcFileName
	 * @param destFileName
	 * @throws IOException
	 */
	public static void method2(String srcFileName,String destFileName) throws IOException {
		//创建输入流对象
		FileReader fr = new FileReader(srcFileName);
		//创建输出流对象
		FileWriter fw = new FileWriter(destFileName);
		
		//一次读写一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs,0,len);
		}
		
		//释放资源
		fw.close();
		fr.close();
	}

	/**
	 * 缓冲流一次读写一个字符
	 * @param srcFileName
	 * @param destFileName
	 * @throws IOException
	 */
	public static void method3(String srcFileName,String destFileName) throws IOException {
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileName));
		
		//一次读写一个字符
		int ch;
		while((ch=br.read())!=-1) {
			bw.write(ch);
		}
		
		//释放资源
		bw.close();
		br.close();
	}

	/**
	 * 缓冲流一次读写一个字符数组
	 * @param srcFileName
	 * @param destFileName
	 * @throws IOException
	 */
	public static void method4(String srcFileName,String destFileName) throws IOException {
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileName));
		
		//一次读写一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			bw.write(chs,0,len);
		}
		
		//释放资源
		bw.close();
		br.close();
	}

	/**
	 * 缓冲流一次读写一个字符串
	 * @param srcFileName
	 * @param destFileName
	 * @throws IOException
	 */
	public static void method5(String srcFileName,String destFileName) throws IOException {
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileName));
		
		//一次读写一个字符串
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
		br.close();
	}


}
