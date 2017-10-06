package tk.chuanjing.stage1.chapter05.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月20日 下午4:20:36
 * @version 1.0

第四题:	分析以下需求，并用代码实现
	1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
	2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
	3.在main方法中打印该数字是几位数
	4.演示格式如下:
		(1)演示一:
			请输入一个整数:1234
			控制台输出:1234是4位数字
		(2)演示二:
			请输入一个整数:-34567
			控制台输出:-34567是5位数字
 */
public class HW04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int input = sc.nextInt();
		
//		int count = getCount(input);
		int count = getCountErr(input);
		System.out.println(input + "是"+ count +"位数字");
	}
	
	private static int getCount(int input) {
//		if (input < 0) {
//			input = Math.abs(input);可能没有学
//		}
		
		if (input < 0) {
			int count = 1; 
			int re = input;
			while (re <= -10) {
				count++;
				re = re / 10;
			}
			return count;
		} else {
			int count = 1; 
			int re = input;
			while (re >= 10) {
				count++;
				re = re / 10;
			}
			return count;
		}
	}

	private static int getCountForString(int input) {
		String s = input + "";
		if (s.startsWith("-") || s.startsWith("+")) {
			return s.length() - 1;
		}
		return s.length();
	}

	private static int getCountErr(int input) {
		if (input < 0) {
			input = input * -1;
		}
		
		int count = 0; 
		while (true) {
			input = input / 10;
			count++;
			if (input == 0) {
				break;
			}
		}
		return count;
	}
}