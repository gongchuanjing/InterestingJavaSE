package tk.chuanjing.stage3.chapter03.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

/**
 * @author ChuanJing
 * @date 2017年5月3日 下午10:25:00
 * @version 1.0
 */
public class TestProperties {

	private String filePath = "src//tk//chuanjing//stage3//chapter03//properties//pro.properties";
	
	@Test
	public void demo1() {
		Properties pro = new Properties();
		pro.setProperty("k01", "v01");
		pro.setProperty("k02", "v02");
		pro.setProperty("k03", "v03");
		
		String value = pro.getProperty("k02");
		System.out.println(value);
		
		System.out.println("-------------------------------");
		
		Set<String> names = pro.stringPropertyNames();
		for (String name : names) {
			System.out.println(name + " : " + pro.getProperty(name));
		}
	}
	
	@Test
	public void demo2() throws Exception {
		Properties pro = new Properties();
		pro.setProperty("k01", "v01我爱");
		pro.setProperty("k02", "v02学习");
		pro.setProperty("k03", "v03真的");
		
		Writer writer = new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8");
		pro.store(writer , "描述信息");
		writer.close();
	}
	
	@Test
	public void demo3() throws Exception {
		Properties pro = new Properties();
		Reader reader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
		pro.load(reader);
		reader.close();
		
		Set<String> names = pro.stringPropertyNames();
		for (String name : names) {
			System.out.println(name + " : " + pro.getProperty(name));
		}
	}
}
