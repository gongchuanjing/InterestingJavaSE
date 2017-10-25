package tk.chuanjing.stage2.chapter09.test;

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
	
	/**
	 * 测试方法：boolean renameTo(File dest)
	 */
	public static void test() {
		File f = new File("G:\\d.txt");
		File f2 = new File("G:\\e.txt");
		
		//boolean renameTo(File dest) : 将当前File对象所指向的路径 修改为 指定File所指向的路径
		//注意：修改的文件路径不能存在，如果存在则修改失败
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(f.renameTo(f2));
		System.out.println(f);
		System.out.println(f2);
	}
}
