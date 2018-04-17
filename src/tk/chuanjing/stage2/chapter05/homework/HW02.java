package tk.chuanjing.stage2.chapter05.homework;

import java.util.Arrays;

/**
 * @author ChuanJing
 * @date 2018年4月17日 下午6:51:13
 * @version 1.0

通过System这个类的arraycopy方法将已知数组int [] arr ={12,234,45,324};中中间两个元素拷贝到另外一个新数组中
 */
public class HW02 {

	public static void main(String[] args) {
		int [] arr ={12,234,45,324};
		int[] arr1 = new int[4];
		System.arraycopy(arr, 1, arr1, 0,2);
		System.out.println(Arrays.toString(arr1));
	}
}
