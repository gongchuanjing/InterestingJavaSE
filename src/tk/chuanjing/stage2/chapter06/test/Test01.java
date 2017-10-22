package tk.chuanjing.stage2.chapter06.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * @author ChuanJing
 * @date 2017年4月20日 上午9:31:17
 * @version 1.0

分析以下需求，并用代码实现
    (1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
    (2)然后利用迭代器和增强for循环分别遍历集合元素并输出
    (3)如：15 18 20 40 46 60 65 70 75 91
 */
public class Test01 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		fullAlContains(al);
//		fullAl(al);
		
		Collections.sort(al);
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
		System.out.println("---------------------------------------------");
		
		Iterator<Integer> iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static void fullAlContains(ArrayList<Integer> al) {
		Random r = new Random();
		int count = 0;
		while (count < 10) {
			int a = r.nextInt(100) + 1;
			if (!al.contains(a)) {
				al.add(a);
				count++;
			}
		}
	}

	/**
	 * 不使用contains
	 * @param al
	 */
	private static void fullAl(ArrayList<Integer> al) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int a = r.nextInt(100) + 1;
			
			if (al.size() == 0) {
				// 第一次存
				al.add(a);
			} else {
				for (int j = 0; j < al.size(); j++) {
					if (al.get(j) == a) {
						// 重复了
						i--;
					} else {
						// 不重复
						al.add(a);
					}
					break;
				}
			}
		}
	}

}
