package tk.chuanjing.stage1.chapter09.homework;

import java.util.ArrayList;

/**
 * @author ChuanJing
 * @date 2017年3月28日 上午11:47:16
 * @version 1.0

第四题：分析以下需求，并用代码实现
	1.定义ArrayList集合，存入多个字符串
	   如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
	2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
	3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
 */
public class HW04 {

	public static void main(String[] args) {
		// 1.定义ArrayList集合，存入多个字符串
		ArrayList<String>  lists = new ArrayList<String>();
		lists.add("ab1");
		lists.add("123ad");
		lists.add("bca");
		lists.add("dadfadf");
		lists.add("dddaaa");
		lists.add("你好啊");
		lists.add("我来啦");
		lists.add("别跑啊");
		System.out.println(lists);
		
		// 2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
		for (int i = 0; i < lists.size(); i++) {
			if(lists.get(i).length() > 5){
				lists.remove(i);
				i--;
			}
		}
		System.out.println(lists);
		
		//3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
		for (int i = 0; i < lists.size(); i++) {
			String s = lists.get(i);
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j) >= '0' && s.charAt(j) <= '9'){
					lists.remove(i);
					i--;
					break;
				}
			}
		}
		System.out.println(lists);
		
		
	}
}