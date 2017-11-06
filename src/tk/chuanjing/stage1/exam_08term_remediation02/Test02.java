package tk.chuanjing.stage1.exam_08term_remediation02;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年4月1日 上午10:38:56
 * @version 1.0

案例二:(键盘录入，字符串查找，字符串切割，循环)
	1.键盘录入一个大字符串,再录入一个小字符串
	2.统计小字符串在大字符串中出现的次数
	3.删除大串中所有的小串
	3.代码运行打印格式:
		请输入大字符串:uuujavammjava I love java l like javava I enjoy javajavajavakkkk
		请输入小字符串:java
		控制台输出:小字符串在大字符串中共出现3次，删除小串后的大串为： I love  l like va I enjoy 
 */
public class Test02 {

	public static void main(String[] args) {
		// 1.键盘录入一个大字符串,再录入一个小字符串
		String max;
		String min;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个大串：");
		max = sc.nextLine();
		
		System.out.println("请输入一个小串：");
		min = sc.nextLine();
		
		// 2.统计小字符串在大字符串中出现的次数
		int count = diyi(max, min);
		
		// 3.删除大串中所有的小串
		String newMax = dier(max, min);
		
		System.out.println("小字符串在大字符串中共出现"+ count +"次,删除小串后的大串为： "+ newMax);
	}
	
	public static String dier(String max, String min){
		// 方法一：
		// uuujavammjava I love java l like javava I enjoy javajavajavakkkk
		// uuu, mm,  I love , l like ……
//		String[] s;
//		s = max.split(min);
//		
//		String newMax = "";
//		for (int i = 0; i < s.length; i++) {
//			String ss = s[i];
//			newMax += ss;
//		}
//		return newMax;
		
		// 方法二：
//		String newMax = max.replace(min, "");
//		return newMax;
		return max.replace(min, "");
	}
	
	public static int diyi(String max, String min){
		// 1、大串调用indexOf方法，传入小串，返回小串第一次出现的位置
		// 2、第一次小串出现的位置加上小串的长度就是要截取大串的开始位置
		// 3、大串调用subString方法，把第二步的结果的位置传给subString的参数，返回截取之后的大串,并且count++
		// 4、把截取之后的大串重新赋值给大串
		// 5、重复第一步，直到indexOf方法返回-1,循环就该停止，打印count
		int count = 0;
		int index;
		int sub;
		
		// 方法一：
//		while( (index = max.indexOf(min)) != -1){
//			count++;
//			sub = index + min.length();
//			max = max.substring(sub);
//		}
		
		// 方法二：
//		while (true) {
//			index = max.indexOf(min);
//			if (index != -1) {
//				// 说明小串在大串中存在
//				count++;
//				sub = index + min.length();
//				max = max.substring(sub);
//			} else {
//				break;
//			}
//		}
		
		// 方法三：
//		for (; ;) {
//			index = max.indexOf(min);
//			if (index != -1) {
//				// 说明小串在大串中存在
//				count++;
//				sub = index + min.length();
//				max = max.substring(sub);
//			} else {
//				break;
//			}
//		}
		
		// 方法四：
		for ( ;(index = max.indexOf(min)) != -1; ) {
			// 说明小串在大串中存在
			count++;
			sub = index + min.length();
			max = max.substring(sub);
		}
		return count;
	}

}