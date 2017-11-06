package tk.chuanjing.stage1.exam_08term;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年4月2日 上午8:42:05
 * @version 1.0
 */
public class Exam01 {

	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接受数据
		System.out.println("请输入一个整数：");
		int a = sc.nextInt();

		// 调用方法
		int sum = getSum(a);

		// 输出结果
		System.out.println("1-" + a + "之间的3的倍数累加和为：" + sum);
	}

	public static int getSum(int n) {
		// 定义求和变量
		int sum = 0;

		// 遍历所有数据
		for (int x = 1; x <= n; x++) {

			// 判断数据是否是3的倍数
			if (x % 3 == 0) {

				// 给求和变量赋值
				sum += x;
			}
		}

		// 返回结果
		return sum;
	}
}
