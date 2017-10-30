package tk.chuanjing.stage2.chapter10.test;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

//定义员工类employee ,员工有姓名,年龄,工号属性, 员工有工作的方法, 
//   键盘录入三组数据, 数据格式(姓名,年龄,工号) 例如:张三,23,9527;
//通过数据,创建员工对象, 然后通过对象流将三个对象储存到文本文件中;
//最后读取文本文件中的对象,然后将对象的属性打印到控制台上;
public class Test04 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		method();
		method1();
	}

	private static void method1() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectIO.txt"));
//		Object readObject = ois.readObject();
		
		try{
			while(true) {
				Object readObject = ois.readObject();
//				ArrayList<Employee1> list=(ArrayList<Employee1>) readObject;
				System.out.println(readObject);
			}
		} catch(EOFException e) {
			System.out.println("完了");
		}
		
		
		
		/*
		for (Employee1 employee : list) {
			System.out.println(list);
		}
		*/
		ois.close();
	}

	private static void method() throws IOException, FileNotFoundException {
		ArrayList<Employee1> list = new ArrayList<>();
		//创建高效的标准输入流
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectIO.txt"));
		
		//键盘录入的数据创建员工对象
		String line;
		while((line=reader.readLine()) != null){
			if ("1".equals(line)) {
				break;
			}
			String[] split = line.split(",");
			int i = Integer.parseInt(split[1]);
			Employee1 employee = new Employee1(split[0], i, split[2]);
			list.add(employee);
			System.out.println(list);
//			oos.writeObject(list);
//			oos.flush();
		}
		oos.writeObject(list);
		oos.flush();
		reader.close();
		oos.close();
	}
}
class Employee1 implements Serializable{

	private static final long serialVersionUID = -2823677245109371258L;
	
	private String name;
	private int age;
	private String id;
	public Employee1(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
}