package tk.chuanjing.stage1.exam_08term_remediation01;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author ChuanJing
 * @date 2017年3月31日 下午4:51:12
 * @version 1.0

案例7:(集合)
	1.创建一个集合,集合中存入10个随机数.
	2.遍历集合将脚标为偶数的元素打印出来
 */
public class Test07 {

	public static void main(java.lang.String[] args) {
		// 创建集合对象    类名 对象名 = new 类名();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// 类名 对象名 = new 类名();
		Random rd = new Random();
		
		// 循环产生随机数，并添加进集合
		for (int i = 0; i < 10; i++) {
			int r = rd.nextInt(100) + 1;
			al.add(r);
		}
		
		// 遍历集合，看里面是否有值
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("----------------------------------------");
		
		// 2.遍历集合将脚标为偶数的元素打印出来
		for (int i = 0; i < al.size(); i++) {
			if (i % 2 == 0) {
				// 如果角标为偶数，则取出该角标上的元素，并打印
				int a = al.get(i);
				System.out.println(a);
			}
		}
	}

}
