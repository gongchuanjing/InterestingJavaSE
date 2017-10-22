package tk.chuanjing.stage2.chapter07.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ChuanJing
 * @date 2017年4月9日 下午6:15:52
 * @version 1.0
 */
public class TestCollections {

	public static void main(String[] args) {
//		method3();
		method2();
	}
	
	private static void method3() {
		//static void fill(List list, Object obj) :使用指定的对象填充指定列表的所有元素
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		System.out.println(list);
		
		Collections.fill(list, "android");
		
		System.out.println(list);
	}

	
	private static void method2() {
		//static void copy(List dest, List src) :是把源列表中的数据覆盖到目标列表
		//注意：目标列表的长度至少等于源列表的长度
		//创建源列表
		List<String> src = new ArrayList<String>();
		src.add("android");
		src.add("android");
		src.add("android");
		
		//创建目标列表
		List<String> dest = new ArrayList<String>();
		dest.add("java");
		dest.add("java");
		dest.add("java");
		dest.add("java");
		
		Collections.copy(dest, src);
		
		System.out.println("dest = " +dest);
		System.out.println("-------------------------------");
		System.out.println("src = " + src);
	}
}