package tk.chuanjing.stage1.exam_08term;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年4月2日 上午8:57:49
 * @version 1.0
 */
public class Exam02 {

	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<User> list = new ArrayList<User>();

		// 给集合添加数据
		list.add(new User("Rose", 23));
		list.add(new User("Jack", 33));
		list.add(new User("Jerry", 43));

		// 创建键盘录入对象并接收数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数(年龄小于此整数的都将会被删除)：");
		int age = sc.nextInt();

		// 调用方法
		delUser(list, age);

		// 判断集合内是否还有元素
		if (list.size() == 0) {
			
			// 如果没有元素，就输出：信息已全部删除
			System.out.println("信息已全部删除");
		} else {
			
			// 如果有元素，就遍历集合，输出集合信息
			for (int x = 0; x < list.size(); x++) {
				User u = list.get(x);
				System.out.println(u.getName() + "\t" + u.getAge());
			}
		}
	}

	public static void delUser(ArrayList<User> list, int num) {
		// 遍历集合获取每一个集合元素
		for (int x = 0; x < list.size(); x++) {
			User u = list.get(x);

			// 判断集合元素的age属性是否小于输入的指定数据
			if (u.getAge() < num) {
				// 小于指定数据，就将该元素删除，同时x--，返回上一个元素重新检查
				list.remove(x);
				x--;
			}
		}
	}

}

class User {
	// 定义属性(成员变量)
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}