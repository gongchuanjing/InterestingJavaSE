package tk.chuanjing.stage1.exam_08term_remediation01;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月31日 上午11:08:25
 * @version 1.0

	案例2:  (考察for循环,if语句，switch语句)
		1.求1-100之间的奇数和.
		2.录入月份打印对应的季节。(switch语句)
 */
public class Test02 {
	public static void main(String[] args) {
		// 1.求1-100之间的奇数和.
		
		// 定义变量，用于存放每次循环的累加结果
		int sum = 0;
		
		// 循环开始，从1-100
		for (int i = 1; i < 101; i++) {
			
			// 每次循环判断当前的数字是不是奇数
			if (i % 2 != 0) {
				
				// 如果是奇数就累加
				sum = sum + i;
			}
		}
		
		// 输出最终的累加结果
		System.out.println(sum);
		
		
		
		// 2.录入月份打印对应的季节。(switch语句)
		
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		// 调用nextInt方法，能把用户输入的数字返回
		int next = sc.nextInt();
		
		// 把用户输入的数字传给switch，switch会拿着这个数值去找匹配的case,然后执行匹配case后的代码
		switch (next) {
//			case 12:
//				System.out.println("冬天");
//				break;
//			case 1:
//				System.out.println("冬天");
//				break;
//			case 2:
//				System.out.println("冬天");
//				break;
		
			// 优化上面的代码，因为当case为12、1、2时，所执行的代
			// 码一样，所以可以利用不写break时的穿透效果
			case 12:
			case 1:
			case 2:
				System.out.println("冬天");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春天");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏天");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋天");
				break;
	
			default:
				System.out.println("输入有误");
				break;
		}
	}
}
