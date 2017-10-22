package tk.chuanjing.stage2.chapter06.test;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author ChuanJing
 * @date 2017年4月9日 上午11:19:47
 * @version 1.0
 */
public class TestIterator {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("study");
		al.add("hard");
		al.add("and");
		al.add("make");
		al.add("progress");
		al.add("every");
		al.add("day");
		
		// 迭代器遍历
//		Iterator<String> iterator = al.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		// foreach遍历
//		for (String string : al) {
//			System.out.println(string);
//		}
		
		// 演示并发修改异常:ConcurrentModificationException
//		ListIterator<String> listIterator = al.listIterator();
//		while (listIterator.hasNext()) {
//			if ("and".equals(listIterator.next())) {
//				al.add("我爱学习");
//			}
//		}
		
		// 解决并发修改异常
		ListIterator<String> listIterator = al.listIterator();
		while (listIterator.hasNext()) {
			if ("and".equals(listIterator.next())) {
				listIterator.add("我爱学习");
			}
		}
		
		// foreach也会发生并发修改异常
//		for (String string : al) {
//			al.add("我爱学习");
//		}

		System.out.println(al);
	}

}
