package tk.chuanjing.stage2.chapter01.test;
/**
 * @author ChuanJing
 * @date 2017年10月8日 上午10:14:53
 * @version 1.0

	执行结果：
		A	静态代码块执行
		B	静态代码块执行
		A	构造代码块执行
		A	无参空构造执行
		B	构造代码块执行
		B	无参空构造执行
		
	总结：JVM去加载子类的class文件时，发现子类继承了父类，所以就先去加载父类的class文件
 */
public class TestStatic2 {

	public static void main(String[] args) {
		B b = new B();
	}
}

class A {
	static {
		System.out.println("A	静态代码块执行");
	}
	
	{
		System.out.println("A	构造代码块执行");
	}
	
	public A() {
		System.out.println("A	无参空构造执行");
	}
}

class B extends A {
	static {
		System.out.println("B	静态代码块执行");
	}
	
	{
		System.out.println("B	构造代码块执行");
	}
	
	public B() {
		System.out.println("B	无参空构造执行");
	}
}