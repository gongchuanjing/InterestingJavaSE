package tk.chuanjing.stage2.chapter13.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

//1.通过反射创建附件中Demo对象, 然后通过反射对其成员变量和方法进行赋值和调用;
public class Demo5 {
	public static void main(String[] args) throws Exception {
//		Class<?> forName = Class.forName("tk.chuanjing.stage2.chapter13.reflect.Demo5$Demoone");
		Class<?> forName = Class.forName("tk.chuanjing.stage2.chapter13.reflect.Demoone");
		
		Constructor<?> constructor = forName.getConstructor();
		Object newInstance = constructor.newInstance();
		
		Field declaredField = forName.getDeclaredField("age");
		declaredField.setAccessible(true);
		declaredField.set(newInstance, 12);
		
//		System.out.println(declaredField);
//		Method declaredMethod = forName.getDeclaredMethod("getAge");
//		declaredMethod.setAccessible(true);
//		Object invoke = declaredMethod.invoke(newInstance);
//		System.out.println(invoke);
		
		System.out.println(newInstance);
	}
}

class Demoone {

	private int age;
	
	public Demoone() {
	}
	
	@Override
	public String toString() {
		return "Demo [age=" + age + "]";
	}

	private int getAge() {
		return age;
	}
}