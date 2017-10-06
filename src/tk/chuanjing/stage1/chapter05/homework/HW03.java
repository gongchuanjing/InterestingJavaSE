package tk.chuanjing.stage1.chapter05.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月28日 下午8:49:10
 * @version 1.0

第三题：分析以下需求，并用代码实现
	1.键盘录入长方形的长和宽
		定义方法计算该长方形的周长,并在main方法中打印周长
	2.键盘录入长方形的长和宽
		定义方法计算该长方形的面积,并在main方法中打印面积
	3.键盘录入圆的半径
		定义方法计算该圆的周长,并在main方法中打印周长
	4.键盘录入圆的半径
		定义方法计算该圆的面积,并在main方法中打印面积
 */
public class HW03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("录入长方形的长");
		int c = sc.nextInt();
		System.out.println("录入长方形的宽");
		int k = sc.nextInt();
		
		int zhouChang = ZhouChang(c, k);
		System.out.println(zhouChang);
	}
	
	public static int ZhouChang(int a, int b) {
		int c = (a + b) * 2;
		return c;
	}
}