package tk.chuanjing.stage2.chapter13.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @author ChuanJing
 * @date 2017年5月2日 下午10:06:49
 * @version 1.0
 */
public class ReflectDeme {
	
	private String className = "tk.chuanjing.stage2.chapter13.reflect.ReflectBean";

	//-----------------------获取类---------------------------
	@Test
	public void demo1() throws ClassNotFoundException {
		Class clazz = Class.forName(className);
		System.out.println(clazz);
	}
	
	@Test
	public void demo2() throws ClassNotFoundException {
		Class clazz = ReflectBean.class;
		System.out.println(clazz);
	}
	
	@Test
	public void demo3() throws ClassNotFoundException {
		ReflectBean rb = new ReflectBean();
		Class clazz = rb.getClass();
		System.out.println(clazz);
	}
	
	
	//-----------------------获取构造---------------------------
	@Test
	public void demo4() throws Exception {
		Class clazz = Class.forName(className);
		Constructor cons = clazz.getConstructor();
		Object obj = cons.newInstance();
		System.out.println(obj);
	}
	
	@Test
	public void demo5() throws Exception {
		Class clazz = Class.forName(className);
		Constructor cons = clazz.getConstructor(String.class);
		Object obj = cons.newInstance("001");
		System.out.println(obj);
	}
	
	@Test
	public void demo6() throws Exception {
		Class clazz = Class.forName(className);
		Object obj = clazz.newInstance();
		System.out.println(obj);
	}

	@Test
	public void demo7() throws Exception {
		Class clazz = Class.forName(className);
		Constructor cons = clazz.getDeclaredConstructor(String.class, String.class);
		
		// 让jvm不检查权限
		cons.setAccessible(true);
		
		Object obj = cons.newInstance("002", "哈哈");
		System.out.println(obj);
	}
	
	
	//-----------------------获取方法---------------------------
	@Test
	public void demo8() throws Exception {
		Class clazz = Class.forName(className);
		Object obj = clazz.newInstance();
		
		Method method1 = clazz.getMethod("setId", String.class);
		method1.invoke(obj, "001");
		
		Method method2 = clazz.getMethod("getId");
		String invoke = (String) method2.invoke(obj);
		System.out.println(invoke);
	}
	
	@Test
	public void demo9() throws Exception {
		Class clazz = Class.forName(className);
		Object obj = clazz.newInstance();
		
		Method method1 = clazz.getDeclaredMethod("show", int.class);
		method1.setAccessible(true);
		method1.invoke(obj, 86);
	}
	
	@Test
	public void demo10() throws Exception {
		Class clazz = Class.forName(className);
		
		Method method1 = clazz.getMethod("main", String[].class);
		String[] args = {"abc", "123", "xxx"};
//		method1.invoke(null, (Object)args);
		method1.invoke(null, new Object[]{args});
	}
	
	
	//-----------------------获取字段---------------------------
	@Test
	public void demo11() throws Exception {
		Class clazz = Class.forName(className);
		Object obj = clazz.newInstance();
		
		Field field = clazz.getField("desc");
		field.set(obj, "描述");
		
		String str = (String) field.get(obj);
		
		System.out.println(obj);
		System.out.println(str);
	}
	
	@Test
	public void demo12() throws Exception {
		Class clazz = Class.forName(className);
		Object obj = clazz.newInstance();
		
		Field field = clazz.getDeclaredField("id");
		field.setAccessible(true);
		field.set(obj, "007");
		
		String str = (String) field.get(obj);
		
		System.out.println(obj);
		System.out.println(str);
	}
}