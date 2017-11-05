package tk.chuanjing.stage2.chapter13.reflect_test;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

/**
 * @author ChuanJing
 * @date 2017年5月3日 下午11:31:08
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) throws Exception {
		BeanConfig bc = getBeanConfig();
		
		Class clazz = Class.forName(bc.getClassName());
		Object obj = clazz.newInstance();
		
		Properties pro = bc.getPro();
		Set<String> names = pro.stringPropertyNames();
		for (String name : names) {
			String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
			Method method = clazz.getMethod(methodName, String.class);
			method.invoke(obj, pro.getProperty(name));
		}
		
		System.out.println(obj);
	}

	private static BeanConfig getBeanConfig() throws Exception {
		String filePath = "src//tk//chuanjing//stage2//chapter13//reflect_test";
		
		// 读取bean.properties
		Properties beanPro = new Properties();
		//InputStreamReader beanProReader = new InputStreamReader(new FileInputStream("res\\bean.properties"), "UTF-8");
		InputStreamReader beanProReader = new InputStreamReader(new FileInputStream(filePath + "\\bean.properties"), "UTF-8");
		beanPro.load(beanProReader);
		beanProReader.close();
		
		// 读取data.properties
		Properties dataPro = new Properties();
		//InputStreamReader dataProReader = new InputStreamReader(new FileInputStream("res\\data.properties"), "UTF-8");
		InputStreamReader dataProReader = new InputStreamReader(new FileInputStream(filePath + "\\data.properties"), "UTF-8");
		dataPro.load(dataProReader);
		dataProReader.close();
		
		// 创建BeanConfig对象，并为属性赋值
		BeanConfig bc = new BeanConfig();
		bc.setId(beanPro.getProperty("id"));
		bc.setClassName(beanPro.getProperty("className"));
		
		Set<String> names = dataPro.stringPropertyNames();
		for (String name : names) {
			bc.getPro().setProperty(name, dataPro.getProperty(name));
		}
		
//		System.out.println(bc);
		return bc;
	}

}