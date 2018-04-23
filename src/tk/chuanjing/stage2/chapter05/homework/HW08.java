package tk.chuanjing.stage2.chapter05.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2018年4月20日 下午7:28:23
 * @version 1.0

分析以下需求，并用代码实现
    (1)从键盘录入一个日期字符串,格式为 xxxx-xx-xx,代表该人的出生日期
    (2)利用人出生日期到当前日期所经过的毫秒值计算出这个人活了多少天
 */
public class HW08 {

	public static void main(String[] args) throws ParseException {
		System.out.println("请输入固定格式的年月日yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		String age = sc.nextLine();
		
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(age);
		long time = date.getTime();
		long millis = System.currentTimeMillis();
		long day  = (millis- time)/(1000*60*60*24);
		System.out.println(day);
		
		
//		Calendar c = Calendar.getInstance();
//		long year1  =  c.get(Calendar.YEAR);
//		System.out.println(c.get(Calendar.YEAR));
//		//把dete的时间设置给了caleandar对象
//		c.setTime(date);
//		System.out.println(c.get(Calendar.YEAR));
//		long year = c.get(Calendar.YEAR);
//		
//		long myAge =  year1 - year;
//		 
//		System.out.println(myAge);
		
	}
}
