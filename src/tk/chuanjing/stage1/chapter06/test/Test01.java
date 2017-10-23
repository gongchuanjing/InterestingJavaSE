package tk.chuanjing.stage1.chapter06.test;
/**
 * @author ChuanJing
 * @date 2017年10月23日 下午3:01:06
 * @version 1.0

	需求：反转数组
 */
public class Test01 {

	private static void swapArray(int[] a) {
		int length = a.length;
		for (int i = 0; i < length/2; i++) {
			int temp = a[i];
			a[i] = a[length-1-i];
			a[length-1-i] = temp;
		}
	}
	
	public static void main(String[] args) {
		swapArray(null);
	}
}
