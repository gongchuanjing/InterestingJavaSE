package tk.chuanjing.stage1.exam_14term;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChuanJing
 * @date 2017年8月11日 上午9:44:16
 * @version 1.0

利用循环获取1-100之内(包含1和100)能同时被2，3整除的所有数及个数，并将满足条件的数一行5个在控制台打印
 */
public class Test02 {

	public static void main(String[] args) {
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i < 101; i++) {
			if(i%2 == 0 && i%3 == 0) {
				count++;
				list.add(i);
			}
		}
		
		System.out.print("同时被2，3整除的数有"+count+"个，分别为：");
		for (int i = 0; i < list.size(); i++) {
			if(i % 5 == 0) {			//0 % 5 = 0
				System.out.println();
			}
			System.out.print(list.get(i) + "\t");
		}
	}

}
