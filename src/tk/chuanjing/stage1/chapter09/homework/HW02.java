package tk.chuanjing.stage1.chapter09.homework;

import java.util.ArrayList;

/**
 * @author ChuanJing
 * @date 2017年3月24日 下午3:54:42
 * @version 1.0

第二题：分析以下需求，并用代码实现	
		1.定义ArrayList集合，存入多个字符串"abc" "def"  "efg" "qwe" "swd" "wwe"
		2.使用for循环获取集合中索引为3的元素并打印
		3.将集合中每个元素中的小写字母变成大写字母
		4.在上一步的基础上,将集合转换成String类型的数组,遍历打印数组
 */
public class HW02 {

	public static void main(String[] args) {
		// 1.定义ArrayList集合，存入多个字符串"abc" "def"  "efg" "qwe" "swd" "wwe"
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("def");
		al.add("efg");
		al.add("qwe");
		al.add("swd");
		al.add("wwe");
		
		// 2.使用for循环获取集合中索引为3的元素并打印
		for (int i = 0; i < al.size(); i++) {
			if (i == 3) {
				System.out.println(al.get(i));
			}
		}
		
		System.out.println("-------------------------------------------------------------");
		
		// 3.将集合中每个元素中的小写字母变成大写字母
		for (int i = 0; i < al.size(); i++) {
			String string = al.get(i);
			String upperCase = string.toUpperCase();
			al.set(i, upperCase);
		}
		System.out.println(al);
	}

}
