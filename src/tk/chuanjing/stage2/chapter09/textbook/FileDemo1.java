package tk.chuanjing.stage2.chapter09.textbook;

import java.io.File;

/**
 * @author ChuanJing
 * @date 2017年9月12日 下午7:22:08
 * @version 1.0

 * File:文件和目录路径名的抽象表示形式，File 类的实例是不可变的
 * 
 * 构造方法：
 * 		File(File parent, String child) 
 * 		File(String pathname) 
 * 		File(String parent, String child) 	 
 */
public class FileDemo1 {
	public static void main(String[] args) {
		//File(String pathname) ：将指定的路径名转换成一个File对象
		//File f = new File("D:\\a\\b.txt");
		
		//File(String parent, String child) : 根据指定的父路径和文件路径创建File对象
		//File f2 = new File("D:\\a","b.txt");
		
		//File(File parent, String child) :根据指定的父路径对象和文件路径创建File对象
		//File parent = new File("D:\\a");
		//File f3 = new File(parent,"b.txt");
		
		File f4 = new File(new File("D:\\a"),"b.txt");
	}
}
