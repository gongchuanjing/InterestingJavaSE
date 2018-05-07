package tk.chuanjing.stage2.chapter06.test;
/**
 * @author ChuanJing
 * @date 2018年5月6日 下午6:07:08
 * @version 1.0

一道面试题，输出什么？
 */
public class Base {

	private String baseName = "base";
	public Base() {
		callName();
	}
	public void callName() {
		System.out.println("Base：" + baseName);
	}
	
	static class Sub extends Base{
		private String baseName = "sub";
		
		@Override
		public void callName() {
			System.out.println("Sub：" + baseName);
		}
	}
	
	public static void main(String[] args) {
		Base b = new Sub();
	}
}
