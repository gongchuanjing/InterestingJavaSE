package tk.chuanjing.stage2.chapter01.homework;
/**
 * @author ChuanJing
 * @date 2018年4月9日 下午2:11:01
 * @version 1.0

第五题：
	现在已知数组int[] arr = {12,34,465,3,45};
	要求创建一个新的数组,将arr的元素倒序放入新数组中,
	然后求出数组中的最大值是多少?然后求出最大值的角标是第几个
	
第六题：
	将第五题中最大值和最小值的位置进行交换;
 */
public class HW06 {
	
	public static void main(String[] args) {
		int[] arr = {12, 34, 465, 3, 45};
		
		// 最大值
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max) {
				max = arr[i];
			}
		}
		System.out.println("最大值是" + max);
		
		// 最小值
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("最小值是" + min);

		//最大值和最小值索引
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				maxIndex = i;
			}

			if (min == arr[i]) {
				minIndex = i;
			}
		}
		
		//交换位置
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
