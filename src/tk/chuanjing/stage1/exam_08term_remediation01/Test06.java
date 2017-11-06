package tk.chuanjing.stage1.exam_08term_remediation01;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月31日 下午3:55:07
 * @version 1.0

案例6:(键盘录入,面向对象)
	a.创建学生类(属性:姓名,年龄,学号)
	b.键盘先录入一个学生姓名,年龄,学号.创建学生对象
	c.在学生类中定义show方法，该方法能够打印出姓名和年龄
 */
public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入姓名：");
		String name = sc.nextLine();
		
		System.out.println("输入年龄：");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("输入学号：");
		String id = sc.nextLine();
		
		//类名 对象名 = new 类名();
		Student s1 = new Student(name, age, id);
//		System.out.println(s1.getName() + s1.getAge() + s1.getId());
		
		// 调用学生自己的方法，能够打印出姓名和年龄
		s1.show();

	}

}
