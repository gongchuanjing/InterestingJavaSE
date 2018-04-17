package tk.chuanjing.stage2.chapter05.homework;

import java.util.Date;

/**
 * @author ChuanJing
 * @date 2018年4月17日 下午7:21:45
 * @version 1.0

通过date对象获取当前时间的毫秒值, 然后计算出明天这个时间的毫秒值,然后将明天的这个时候的毫秒值转成Date对象
 */
public class HW04 {
	public static void main(String[] args) {
		Date date = new Date();
		long tomory = date.getTime()+1000L*60*60*24;
		Date date2 = new Date(tomory);
		System.out.println(date2.toLocaleString());
	}
}
