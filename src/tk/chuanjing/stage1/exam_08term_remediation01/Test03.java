package tk.chuanjing.stage1.exam_08term_remediation01;
/**
 * @author ChuanJing
 * @date 2017年3月31日 上午11:41:27
 * @version 1.0

案例3: (方法的编写)
	1.定义一个方法名为isEq(int n,int m)的方法,判断2个数字是否相等.并将结果打印.
	2.定义一个方法名为isContain方法.功能: 判断一个数是否是0.将结果以boolean类型返回.
 */
public class Test03 {

	public static void main(String[] args) {
		String s = isEq(5, 4);
		System.out.println(s);
		
		boolean b = isContain(9);
		System.out.println(b);
	}
	
	/**
	 * 传入两个整数，比较两个整数是否相等
	 * @param n		第一个整数
	 * @param m		第二个整数
	 * @return		返回 相等 或者 不相等
	 */
	public static String isEq(int n,int m) {
//		if (n == m) {
//			return "相等";
//		} else {
//			return "不相等";
//		}
		
		// 使用  三目运算符，如果 n == m 成立，则返回"相等"，否则返回"不相等"
		return n == m ? "相等" : "不相等";
//		return n == m;如果返回值为boolean类型可以这样写
	}
	
	/**
	 * 传入一个数字，判断它是否是0
	 * @param a
	 * @return
	 */
	public static boolean isContain(int a) {
//		if (a == 0) {
//			return true;
//		} else {
//			return false;
//		}
		
		// 0 == a 执行完后是一个boolean，正好就是他两是否相等，直接返回给调用者即可
		return 0 == a;
	}

}
