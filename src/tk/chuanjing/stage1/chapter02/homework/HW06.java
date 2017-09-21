package tk.chuanjing.stage1.chapter02.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月29日 下午10:34:26
 * @version 1.0

第六题:分析以下需求，并用代码实现
	1.键盘录入一个学生成绩(int类型)
	2.判断该学生成绩是否及格
	3.打印格式：
		成绩>=60:打印"合格"
		成绩<60:打印"不合格"
 */
public class HW06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入整数");
		int a = sc.nextInt();
		String  s = a >= 60? "合格":"不合格";
		
		System.out.println(s);
	}

}
