package tk.chuanjing.stage2.chapter05;

import java.util.Date;

/**
 * @author ChuanJing
 * @date 2017年9月6日 下午3:19:59
 * @version 1.0
 */
public class DemoDate {

	public static void main(String[] args) {
		Date d = new Date(1000L * 60 * 60 * 24 * 365);
		System.out.println(d.toLocaleString());
	}

}
