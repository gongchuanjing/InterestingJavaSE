package tk.chuanjing.stage2.chapter05.test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author ChuanJing
 * @date 2017年9月6日 下午3:19:59
 * @version 1.0
 */
public class DemoDate {

	public static void main(String[] args) {
//		Date d = new Date(1000L * 60 * 60 * 24 * 365);//注意，这个地方传参必须是long类型
//		System.out.println(d.toLocaleString());
		
//		test01();
		test02();
	}

	/**
	 * 通过date对象获取当前时间的毫秒值, 然后计算出明天这个时间的毫秒
	 * 值,然后将明天的这个时候的毫秒值转成Date对象，没有思路，不会做
	 * 
	 * 思路：
	 	1、	计算一天的毫秒值是多少；
		2、	得到今天此时的毫秒值；
		3、	用今天此时的毫秒值加上一天的毫秒值，得出明天此时的毫秒；
		4、	把明天的毫秒值转换成date对象。
	 */
	private static void test01() {
		// 1、	计算一天的毫秒值是多少；
		long oneDay = 1000 * 60 * 60 * 24;
		
		// 2、	得到今天此时的毫秒值；
		long now = new Date().getTime();
		
		// 3、	用今天此时的毫秒值加上一天的毫秒值，得出明天此时的毫秒；
		long  tomorrow = now + oneDay;
		
		// 4、	把明天的毫秒值转换成date对象。
		Date tomorrowDate = new Date(tomorrow);
		
		System.out.println(tomorrowDate.toLocaleString());
	}
	
	/**
	 * 月是从0开始的，所以，想表示3月，写2就行了，然后在得到月时需要加一再输出。
	 */
	public static void test02() {
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.YEAR, 2000);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.DAY_OF_MONTH, 1);	
		c.add(Calendar.DAY_OF_MONTH,-1);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;	
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日");
	}
}