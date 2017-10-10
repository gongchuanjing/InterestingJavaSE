package tk.chuanjing.stage1.chapter06.homework;

import java.util.Arrays;

/**
 * 4.定义一个方法传入一个int类型数组，输出这个数组中只出现一次的数字及个数(有点难，已经去掉了)
 * 
 * @author ChuanJing
 *
 */
public class HW05Old {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 9, 5, 5, 6, 6, 8, 0, 1, 7};
		getOne(arr);
	}

	private static void getOne(int[] arr) {
		int[] arrOne = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int cur = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[j] == cur) {
					break;
				} else if (i != j && j == arr.length - 1) {
					arrOne[i] = cur;
				}
			}
		}

		System.out.println(Arrays.toString(arrOne));
	}
}