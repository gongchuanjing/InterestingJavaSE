package tk.chuanjing.stage4web;
/**
 * @author ChuanJing
 * @date 2017年10月20日 上午10:47:53
 * @version 1.0
 */
public class Test02 {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		byte[] bs = {1,2,3,4};
		String s = new String(bs);
		System.out.println(s);
	}
}