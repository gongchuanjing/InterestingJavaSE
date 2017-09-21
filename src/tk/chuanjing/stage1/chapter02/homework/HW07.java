package tk.chuanjing.stage1.chapter02.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月29日 下午10:26:39
 * @version 1.0

第七题:分析以下需求，并用代码实现
	1.键盘录入三个int类型的数字
	2.要求：
		(1)求出三个数中的最小值并打印
		(2)求出三个数的和并打印
 */
public class HW07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个整数");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数");
		int c = sc.nextInt();
		
		int x = a < b ? a : b;
		int min = x < c ? x : c;
		System.out.println("最小值" + min);
		
		int sum = a + b + c;
		System.out.println("和为" + sum);
	}

}
