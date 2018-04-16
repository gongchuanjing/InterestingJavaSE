package tk.chuanjing.stage2.chapter01.homework;
/**
 * @author ChuanJing
 * @date 2018年4月16日 下午4:17:10
 * @version 1.0

第八题：
	使用静态的特点定义一个工具类专门用于操作数组的, 这个工具类有以下功能
	  1)可以将整数类型的数组中的最大值找到
	  2)可以将整数类型的数组中的最小值找到
	  3)可以遍历一个整数数组;
	  4)可以求出数组中最大值的角标
	  5)可以求出数组中最小值的角标;
 */
public class HW08 {
	
	private HW08(){};
	
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void print(int[] arr){
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
	
	public static int getMaxIndex(int[] arr){
		int max = getMax(arr);
		//最大值和最小值索引
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static int getMinIndex(int[] arr){
		int min = getMax(arr);
		//最大值和最小值索引
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min == arr[i]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
}
