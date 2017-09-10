package tk.chuanjing.stage2.chapter07.errordemo;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年9月10日 下午7:29:10
 * @version 1.0

	需求：
	1.创建Star明星这个类.属性为name;
	3.键盘输入若干个名字.通过名字创建明星类对象,
	4.将明星存储到适当的集合中.保证明星的唯一性(名字相同我们认为是同一个明星)
	
	问题：
	循环输入明星名字，创建明星对象，存入HashSet集合中，输入多个名字，但最终集
	合中只有一个明星对象。
	问题分析：
	每次输入完一个姓名都要new一个明星对象，然后立马放到集合中，也就是说：new
	对象和向集合中添加的代码也要写在循环中。
 */
public class Test01 {

	public static void main(String[] args) {
		HashSet<Star> hs = new HashSet<Star>();
		Scanner sc = new Scanner(System.in);
		String name;
		while (true) {
			name = sc.nextLine();
			
			if ("y".equals(name)) {
				break;
			}
			
			Star s = new Star(name);
			hs.add(s);
		}
		
//		Star s = new Star(name);
//		hs.add(s);
		System.out.println(hs);
	}

}

class Star{
	private String name;
	
	public Star() {
		super();
	}

	public Star(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Star [name=" + name + "]";
	}
}