package tk.chuanjing.stage2.chapter10.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author ChuanJing
 * @date 2017年4月24日 下午10:44:30
 * @version 1.0
 */
public class TestObjectIO {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		writeObject();
//		readObject();
		
//		writeObjectForArrayList();
		
		readObjectForArrayList();
		
	}

	/**
	 * 读一个集合
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */
	private static void readObjectForArrayList() throws IOException,
			FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectIO.txt"));
		Object readObject = ois.readObject();
		ois.close();
		
		ArrayList<StudentForObjectIO> al =  (ArrayList<StudentForObjectIO>) readObject;
		for (StudentForObjectIO studentForObjectIO : al) {
			System.out.println(studentForObjectIO);
		}
	}

	/**
	 * 写入一个集合
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static void writeObjectForArrayList() throws IOException,
			FileNotFoundException {
		ArrayList<StudentForObjectIO> al = new ArrayList<StudentForObjectIO>();
		al.add(new StudentForObjectIO("王五", 28));
		al.add(new StudentForObjectIO("赵六", 25));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectIO.txt"));
		oos.writeObject(al);
		oos.close();
	}

	/**
	 * 一个一个读
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */
	private static void readObject() throws IOException, FileNotFoundException,
			ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectIO.txt"));
		
		try {
			while(true) {
				Object object1 = ois.readObject();
				System.out.println(object1);
			}
		} catch(EOFException e) {
			System.out.println("读完了");
		}
	}

	/**
	 * 一个一个写
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static void writeObject() throws IOException, FileNotFoundException {
		StudentForObjectIO s1 = new StudentForObjectIO("张三", 20);
		StudentForObjectIO s2 = new StudentForObjectIO("李四", 22);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectIO.txt"));
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.close();
	}

}
