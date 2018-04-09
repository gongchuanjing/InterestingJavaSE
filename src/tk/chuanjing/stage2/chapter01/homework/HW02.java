package tk.chuanjing.stage2.chapter01.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2018年4月9日 下午2:03:21
 * @version 1.0

第二题：键盘录入两个整数,分别赋值给int变量x,y然后比较x和y的大小
 */
public class HW02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整数");
		int x = sc.nextInt();
		System.out.println("输入一个整数");
		int y = sc.nextInt();
		
		if (x>y) {
			System.out.println("x大");
		}else{
			System.out.println("y大");
		}
		
	}
}
