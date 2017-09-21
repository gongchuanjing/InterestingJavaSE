package tk.chuanjing.stage1.chapter03.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月29日 下午9:50:04
 * @version 1.0

第六题：分析以下需求，并用代码实现：			
	1.功能描述:键盘录入月份，输出对应的季节
	2.要求:
		(1)键盘录入一个整数(代表月份,范围1-12)
		(2)输出该月份对应的季节
			3,4,5春季
			6,7,8夏季
			9,10,11秋季
			12,1,2冬季
		(3)演示格式如下:
			请输入一个月份:3
			控制台输出:3月份是春季
 */
public class HW06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("键盘录入月份范围(1-12)");
		int yue = sc.nextInt();
		
		switch(yue){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
				
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
				
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			
			default:
				System.out.println("请注意录入月份范围：1 - 12");
				break;
		}
	}

}
