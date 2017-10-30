package tk.chuanjing.stage2.chapter10.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * @author ChuanJing
 * @date 2017年4月24日 下午11:31:31
 * @version 1.0

	Properties和IO流结合的功能： 
		void load(Reader reader) 
		
		void list(PrintWriter out)
		void store(Writer writer, String comments) 
 */
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
//		PropertiesTest();
//		propertiesWriter();
//		propertiesReader();
		
		Properties p = new Properties();
		p.setProperty("003", "闸门佛山");
		p.setProperty("004", "所述的");
		
		//创建输出流对象
		FileWriter fw = new FileWriter("PropertiesIO.txt");
		p.store(fw, "zhi shi shuo min wen jian,ke yi bu xie");
		
		fw.close();
	}

	private static void propertiesReader() throws FileNotFoundException,
			IOException {
		Properties p = new Properties();
		
		//创建一个输入流对象
		FileReader fr = new FileReader("PropertiesIO.txt");
		p.load(fr);
		fr.close();
		
		System.out.println(p);
	}

	private static void propertiesWriter() throws FileNotFoundException {
		Properties p = new Properties();
		p.setProperty("007", "七号");
		p.setProperty("008", "八号");
		p.setProperty("009", "九号");
		
		//创建打印流对象
		PrintWriter pw = new PrintWriter("PropertiesIO.txt");
		p.list(pw);
		pw.close();
	}

	private static void PropertiesTest() {
		Properties p = new Properties();
		
		p.put("001", "zhangsan");
		p.put("002", "lishi");
		
		Set<Object> keySet = p.keySet();
		for (Object object : keySet) {
			System.out.println(object + " = " + p.get(object));
		}
		
		System.out.println("----------------------");
		
		Set<Entry<Object, Object>> entrySet = p.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
