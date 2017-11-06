package tk.chuanjing.stage1.exam_08term_remediation01;

import java.util.Random;

/**
 * @author ChuanJing
 * @date 2017年3月31日 上午9:44:37
 * @version 1.0

案例1:  (考察数组,随机数的生成,求最大值)
	定义一个方法max(int[] arr).求数组arr的最大值.并在main方法中调用max方法测试.
	1.创建长度为10的数组.数组内的元素为随机生成的1-100之间的整数.
	2.调用max方法.获取数组中的最大值.
 */
public class Test01 {

	public static void main(String[] args) {
		// 创建数组
		int[] arr = new int[10];
		
		// 创建随机数 Random的对象
		Random r = new Random();
		
		// 循环遍历数组，同时创建随机数，给里面的每一个元素赋值
		for (int i = 0; i < arr.length; i++) {
			// 生成一个1-100之间的随机数
			int a = r.nextInt(100) + 1;
			
			// 把生成的随机数赋值给数组里面的元素
			arr[i] = a;
			
			// 把这个元素打印出来看看
			System.out.println(arr[i]);
		}
		
		// 调用求最大值的方法，该方法返回最大值
		int a = max(arr);
		
		// 输出最大值
		System.out.println("最大值：" + a);
	}
	
	/**
	 * 求数组最大值的方法
	 * @param arr	该方法需要传入一个数组
	 * @return		返回传入数组的最大值
	 */
	public static int max(int[] arr) {
		// 假设数组的第一个元素为最大值
		int max = arr[0];
		
		// 循环数组，从第二个元素开始，和最大值比较，如果比最大值还要大，就把这个元素赋值给max
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				// 如果比最大值还要大，就把这个元素赋值给max
				max = arr[i];
			}
		}
		
		// 循环完了之后，max的值就真的是最大值了，返回给调用者
		return max;
	}
}
