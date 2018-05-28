package tk.chuanjing.stage2.chapter10.exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
	编写程序，该程序启动后用户可以按“yyyy-MM-dd”的格式输入一个日期，程序计算这一天是星期几，并且计算出是一年中的第几天
	打印格式：
		请输入数字日期字符串(格式:2015-10，-20):
		2017-07-22
		2017年-07月-22日是 星期六，是  2017年的第 203 天

 * @author ChuanJing
 * @date 2018年5月14日 下午12:11:39
 * @version 1.0
 */
public class Exam33 {
	public static void main(String[] args) throws Exception {
		//1.创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字日期字符串(格式:2015-10-20):");
		
		//2.获取键盘录入的字符串日期
		String dateStr = sc.nextLine();
		
		//3.定义格式化和解析日期的对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年-MM月-dd日是 EE");
		
		//4.将输入的字符串日期转换成日期对象
		Date date = sdf.parse(dateStr);
		
		//5.将日期对象转换成Calendar对象
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		//6.获取该日期对象是一年中的第几天
		int day = c.get(Calendar.DAY_OF_YEAR);
		
		//7.格式化date对象用于打印
		String dateStr2 = sdf2.format(date);
		System.out.println(dateStr2+"，是  "+c.get(Calendar.YEAR)+"年的第 "+day+" 天");
	}
}