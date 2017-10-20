package tk.chuanjing.stage2.chapter04.test;
/**
 * @author ChuanJing
 * @date 2017年10月20日 上午9:41:03
 * @version 1.0

	测试：多态中，成员变量编译看左边，运行也看左边，但是……
 */
public class PoymorphicTest {

	public static void main(String[] args) {
		Fu f = new Zi();
		f.setName("ZiWai");
		System.out.println(f.getName());
//		f.name = "ZiWai";
//		System.out.println(f.name);
	}

}

class Fu {
	private String name = "Fu";
//	String name = "Fu";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Zi extends Fu {
//	private String name = "Zi";
	String name = "Zi";
}