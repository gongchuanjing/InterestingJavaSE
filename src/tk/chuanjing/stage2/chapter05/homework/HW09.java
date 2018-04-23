package tk.chuanjing.stage2.chapter05.homework;

import java.util.Calendar;

/**
 * @author ChuanJing
 * @date 2018年4月23日 下午7:31:03
 * @version 1.0

利用Calendar类的方法判断当前年是闰年还是平年
    提示:
        闰年:二月有29天
        将日期设置为3月1号,然后倒退1天至2月底(使用add方法操作),求出2月底是多少天;判断天数即可
 */
public class HW09 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2017, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		if (day == 29) {
			System.out.println("是闰年");
		} else {
			System.out.println("是平年");
		}
	}
}
