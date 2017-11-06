package tk.chuanjing.stage1.exam_08term_remediation02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author ChuanJing
 * @date 2017年4月1日 下午3:49:40
 * @version 1.0

案例3:(集合,遍历,if语句,I/O流)
	1.ArrayList存储自定义学生(属性name,age)对象并遍历
	2.打印所有年龄为18的学生.
	3.把集合中学生信息写入文本文件(F://stu.txt)中.格式：姓名,年龄
 */
public class Test03 {

	public static void main(String[] args) throws IOException {
		// 1.ArrayList存储自定义学生(属性name,age)对象并遍历
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student("张飞1", 19);
		Student s2 = new Student("张飞2", 18);
		Student s3 = new Student("张飞3", 50);
		Student s4 = new Student("张飞4", 10);
		Student s5 = new Student();
		s5.setName("小黑");
		s5.setAge(20);
		s3.setAge(18);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		for (int i = 0; i < al.size(); i++) {
			Student ss = al.get(i);
//			System.out.println("姓名：" + ss.getName() + "，年龄：" + ss.getAge());
			ss.show();
		}
		
		System.out.println("--------------------------------------");
		
		// 2.打印所有年龄为18的学生.
		for (int i = 0; i < al.size(); i++) {
			Student student = al.get(i);
			int age = student.getAge();
			if (18 == age) {
//				System.out.println("姓名：" + student.getName() + "，年龄：" + student.getAge());
				student.show();
			}
		}
		
		// 3.把集合中学生信息写入文本文件(F://stu.txt)中.格式：姓名,年龄
		BufferedWriter bw = new BufferedWriter(new FileWriter("F://stu.txt"));
		// 写一行：
//		Student student = al.get(0);
//		bw.write(student.getName() + "," + student.getAge());//姓名,年龄
//		bw.newLine();
//		bw.close();
//		System.out.println("写完了！");
		
		// 写所有行：
		for (int i = 0; i < al.size(); i++) {
			Student sss = al.get(i);
			String str = sss.getName() + "," + sss.getAge();
			bw.write(str);
			bw.newLine();
		}
		bw.close();
		System.out.println("写完了！");
	}

}
