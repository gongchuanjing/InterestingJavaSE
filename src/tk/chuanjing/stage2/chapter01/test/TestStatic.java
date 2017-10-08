package tk.chuanjing.stage2.chapter01.test;
/**
 * @author ChuanJing
 * @date 2017年4月6日 下午3:06:23
 * @version 1.0

	TestStatic静态代码块执行
	TestStatic的主函数执行了
	
	TestStaticBean静态代码块执行
	TestStaticBean构造代码块执行
	TestStaticBean无参空构造执行
	
	TestStaticBean构造代码块执行
	TestStaticBean无参空构造执行
 */
public class TestStatic {
	
	static {
		System.out.println("TestStatic静态代码块执行");
	}
	
	{
		System.out.println("TestStatic构造代码块执行");
	}
	
	public TestStatic(){
		System.out.println("TestStatic无参构造执行了");
	}

	public static void main(String[] args) {
		System.out.println("TestStatic的主函数执行了");
		TestStaticBean c = new TestStaticBean();
		TestStaticBean c2 = new TestStaticBean();
	}
}

class TestStaticBean {
	static {
		System.out.println("TestStaticBean静态代码块执行");
	}
	
	{
		System.out.println("TestStaticBean构造代码块执行");
	}
	
	public TestStaticBean() {
		System.out.println("TestStaticBean无参空构造执行");
	}
}