package tk.chuanjing.stage1.exam_14term;

import java.util.ArrayList;

/**
 * @author ChuanJing
 * @date 2017年8月11日 上午11:51:44
 * @version 1.0

a.定义ArrayList集合，存入如下字符串："ab1"，"123ad"， "dadfadf"，"dddaaa"， "我来啦"  "你别跑啊"
b.遍历集合,删除长度大于4的元素,在控制台打印输出删除后的集合中所有元素

 */
public class Test04 {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ab1");
		list.add("123ad");//
		list.add("dadfadf");//
		list.add("dddaaa");//
		list.add("我来啦");
		list.add("你别跑啊");
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if (s.length() > 4) {
				list.remove(i);
				i--;
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
	}

}
