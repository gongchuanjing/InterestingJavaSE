package tk.chuanjing.stage2.chapter05.test;

import java.util.Arrays;

/**
 * @author ChuanJing
 * @date 2017年4月8日 上午11:23:57
 * @version 1.0
 */
public class TestArraycopy {

	public static void main(String[] args) {
		/*
		 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  
		 * 复制数组
		 * 参数1：源数组
		 * 参数2：源数组的起始索引位置
		 * 参数3：目标数组
		 * 参数4：目标数组的起始索引位置
		 * 参数5：指定接受的元素个数
		 */
		int[] src = {1,2,3,4,5};
		int[] dest = new int[5];
//		System.arraycopy(src, 2, dest, 4, 3);
		System.arraycopy(src, 2, dest, 4, 1);
		
//		for (int i = 0; i < dest.length; i++) {
//			System.out.print(dest[i]);
//		}
		System.out.println(Arrays.toString(dest));
	}
}