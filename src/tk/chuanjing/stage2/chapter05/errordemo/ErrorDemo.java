package tk.chuanjing.stage2.chapter05.errordemo;
/**
 * @author ChuanJing
 * @date 2017年10月20日 上午10:47:53
 * @version 1.0
 */
public class ErrorDemo {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
//		byte[] bs = {1,2,3,4};
		byte[] bs = {65,66,67,68};
		String s = new String(bs);
		System.out.println(s);
	}
}