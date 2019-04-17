package tk.chuanjing.interview;

import java.util.Date;

/**
 * @author ChuanJing
 * @date 2019年4月17日 下午3:57:29
 * @version 1.0
 */
public class D20190417_Interview {
	public static void main(String[] args) {
//		long i = 1000 * 60 * 60 * 24 * 365;
//		System.out.println(new Date(i));
		long i = 1000 * 60 * 60 * 24 * 365L;//31536000000
		System.out.println(i);
		System.out.println(new Date(i));
	}
}
