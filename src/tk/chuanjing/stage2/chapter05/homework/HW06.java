package tk.chuanjing.stage2.chapter05.homework;

import java.util.Calendar;

/**
 * @author ChuanJing
 * @date 2018年4月18日 下午7:25:24
 * @version 1.0

通过Calendar对象获取今天是哪天哪月哪日;
 (1)获取今天在一年中是第几周;
	//思路:查看API Calendar类中的字段.有没年中的周这样的字段.
 (2)获取当前月份在一年中是第几个月;
	//注意月份是从0开始的
 */
public class HW06 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int i = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println(i);
		
		int j = c.get(Calendar.MONTH);
		System.out.println(j+1);
	}
}
