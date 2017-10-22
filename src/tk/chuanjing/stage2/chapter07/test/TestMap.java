package tk.chuanjing.stage2.chapter07.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author ChuanJing
 * @date 2017年4月9日 下午6:42:21
 * @version 1.0
 */
public class TestMap {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("001", "张三");
		hm.put("002", "李四");
		hm.put("001", "王五");
//		System.out.println(hm);
		
//		System.out.println(hm.remove("001"));
		
//		System.out.println(hm.containsKey("001"));
		
//		System.out.println(hm.get("002"));
		
//		Collection<String> values = hm.values();
//		for (String string : values) {
//			System.out.println(string);
//		}
		
//		Set<String> keySet = hm.keySet();
//		for (String string : keySet) {
//			System.out.println(string + " = " + hm.get(string));
//		}
		
		Set<Entry<String, String>> entrySet = hm.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
