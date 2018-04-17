package tk.chuanjing.stage2.chapter05.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ChuanJing
 * @date 2018年4月17日 下午7:23:05
 * @version 1.0

(1)将当前的时间解析成 xxxx年xx月xx日 xx:xx:xx 这种格式显示;
  	(2)已知一个字符串时间String  date = "2000_02_29#####23-23-23";
   		a. 请将字符串时间转成一个date对象
		b.然后通过对象获取出以上date对象明天这个时候的毫秒值
		c.然后通过获取通过刚才获取的毫秒值获取出明天的date对象;
		d.然后将获取出新的date对象的时间以xxxx年xx月xx日 xx:xx:xx 这种格式显示出来;
 */
public class HW05 {

	public static void main(String[] args) throws ParseException {
		//Demo1();
		//a. 请将字符串时间转成一个date对象
		String  date = "2000_02_29#####23-23-23";
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy_MM_dd#####HH-mm-ss");
		Date parsedate = sdf.parse(date);
		System.out.println(parsedate.toLocaleString());
		
		//然后通过对象获取出以上date对象明天这个时候的毫秒值
		long time = parsedate.getTime();
		
		//c.然后通过获取通过刚才获取的毫秒值获取出明天的date对象;
		long tomory = time+1000L*60*60*24;
		Date date2 = new Date(tomory);
		
		//d.然后将获取出新的date对象的时间以xxxx年xx月xx日 xx:xx:xx 这种格式显示出来;*/
		SimpleDateFormat sdf1  = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String format = sdf1.format(date2);
		System.out.println(format);
		
	}

	private static void Demo1() {
		//将当前的时间解析成 xxxx年xx月xx日 xx:xx:xx 这种格式显示;
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String curr = sdf.format(new Date());
		System.out.println(curr);
	}
}
