package tk.chuanjing.stage1.chapter02.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月29日 下午10:36:58
 * @version 1.0

第二题:分析以下需求，并用代码实现
	1.键盘录入一个三位整数数，请分别获取该三位数上每一位的数值
	2.例如：键盘录入的整数123的个位、十位、百位，分别是3、2、1
	3.打印格式:"数字123的个位是 3, 十位是 2, 百位是 1"
 */
public class HW02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个三位整数：");
		int x = sc.nextInt();
		
		int ge = x % 10;
		int shi = x / 10 % 10;
//		int bai = x / 100 % 10;下面也可以
		int bai = x / 100;
		
		System.out.println("数字"+x+"的个位是 "+ge+",十位是"+shi+",百位是"+bai);
	}
}