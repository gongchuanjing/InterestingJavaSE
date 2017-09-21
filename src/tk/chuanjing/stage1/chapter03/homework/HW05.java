package tk.chuanjing.stage1.chapter03.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月29日 下午9:58:37
 * @version 1.0

第五题：分析以下需求，并用代码实现：
	1.功能描述：模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
	2.要求：
		(1)键盘录入三个整数,其中前两个整数代表参加运算的数据，
			第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
		(2)使用今天所学知识完成功能
		(3)演示格式如下:
			请输入第一个整数:30
			请输入第二个整数:40
			请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0
			控制台输出:30+40=70
 */
public class HW05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int y = sc.nextInt();
		System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)：");
		int z = sc.nextInt();

		switch (z) {
		case 0://表示加法运算
			System.out.println(x + " + " + y + " = " + (x + y));
			break;
		case 1://表示减法运算
			System.out.println(x + " - " + y + " = " + (x - y));
			break;
		case 2://表示乘法运算,
			System.out.println(x + " * " + y + " = " + (x * y));
			break;
		case 3://表示除法运算
			System.out.println(x + " / " + y + " = " + (x / y));
			break;

		default:
			System.out.println("输入算法有误");
			break;
		}
	}

}
