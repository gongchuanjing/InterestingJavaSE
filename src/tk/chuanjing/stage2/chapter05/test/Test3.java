package tk.chuanjing.stage2.chapter05.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
	编写程序，该程序启动后用户可以按“yyyy-MM-dd”的格式输入一
	个日期，程序计算这一天是星期几，并且计算出是一年中的第几天
 		打印格式：
 			请输入数字日期字符串(格式:2015-10-20):
 			2017-07-22
 			2017年-07月-22日是 星期六，是 2017年的第 203 天
 */
public class Test3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字日期字符串(格式:xxxx-xx-xx):");
		String time = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(time);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);

		SimpleDateFormat sdf1 = new SimpleDateFormat("EEE,DDD");
		String format = sdf1.format(date);
		String[] split = format.split(",");
		System.out.println(time + "是" + split[0] + ",是" + year + "年的第" + split[1] + "天");
	}
}