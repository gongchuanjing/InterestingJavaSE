package tk.chuanjing.stage1.chapter08;

/**
 * 一道面试题
 * 		运行结果：goodandgbc
 * 
 * @author ChuanJing
 */
public class StringDemo {

	String str = new String("good");
	char[] ch = {'a','b','c'};
	
	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		sd.change(sd.str, sd.ch);
		System.out.print(sd.str+"and");
		System.out.print(sd.ch);
	}

	private void change(String str2, char[] ch2) {
		str2 = "test ok";
		ch2[0] = 'g';
	}

}
