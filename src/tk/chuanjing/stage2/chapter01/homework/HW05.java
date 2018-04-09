package tk.chuanjing.stage2.chapter01.homework;
/**
 * @author ChuanJing
 * @date 2018年4月9日 下午2:07:46
 * @version 1.0

第五题：
	现在已知数组int[] arr = {12,34,465,3,45};
	要求创建一个新的数组,将arr的元素倒序放入新数组中,
	然后求出数组中的最大值是多少?然后求出最大值的角标是第几个
 */
public class HW05 {
	public static void main(String[] args) {
		int[] arr = {12, 34, 465, 3, 45};
		int[] arr1 = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr1[arr.length-i-1] = arr[i];
		}
		
		for (int s = 0; s < arr1.length; s++) {
			System.out.println(arr1[s]);
		}
		
		//最大值
		int max = arr[0];
		for (int i = 0; i < arr1.length; i++) {
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("最大值是"+max);
		
		//最大值的角标是
		for (int i = 0; i < arr1.length; i++) {
			if(max== arr1[i]){
				System.out.println("最大值角标是"+i);
				break;
			}
		}
	}
}
