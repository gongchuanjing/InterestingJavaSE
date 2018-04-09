package tk.chuanjing.stage2.chapter01.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2018年4月9日 下午2:06:03
 * @version 1.0

第三题：
	实现猜测游戏, 游戏规则,随机生成一个1-100内的整数, 然后键盘录入一个数
	如果这个数比我们随机的数大就提示用户"输入的数大了", 当然如果用户输入的数比我们
	随机生成的数小的话就提示"输入的数小了",直到用户输对为止;
第四题：
	统计第三题用户猜的次数
 */
public class HW03 {
	public static void main(String[] args) {
		int count = 0;
		Random r = new Random();
		int x = r.nextInt(100) + 1;
		System.out.println(x);
		while(true){
			count++;
			Scanner sc = new Scanner(System.in);
			int y = sc.nextInt();
			if (y>x) {
				System.out.println("数字大了");
			}else if(y<x){
				System.out.println("数字小了");
			}else{
				System.out.println("中了");
				break;
			}
		}
		System.out.println("您猜了"+count+"次");
	}
}
