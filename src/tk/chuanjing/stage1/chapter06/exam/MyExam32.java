package tk.chuanjing.stage1.chapter06.exam;

import java.util.Random;

/**
 * @author ChuanJing
 * @date 2017年9月26日 上午10:37:34
 * @version 1.0

分析以下需求，并用代码实现 
	1.创建两个长度为5的数组，数组内元素为随机生成的、不重复的 1-100之间的偶数（每个数组内部的元素一定是不重复的1-100之间的偶数，但两个数组间可以有重复的）。 
 	2.定义一个方法unionArr(描述如下)，传入两个数组，方法中将两个数组元素合并到一个新数组中，并且将新数组的内容打印到控制台上           
		public static int[] unionArr(int[] arr1,int[] arr2)
		功能: 两个数组的元素存入到一个新数组中并返回 
	3.程序运行结果(因为数字随机生成，这里只是举个例子：) 
		原数组1：[78, 48, 20,94, 34] 
		原数组2：[32, 10, 98,4, 52] 
		合并后数组：[78, 48, 20, 94, 34, 32, 10, 98, 4, 52]
 */
public class MyExam32 {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		fuZhi(arr1);
		fuZhi(arr2);
		int[] arrMax = unionArr(arr1, arr2);
		
		System.out.print("原数组1：");
		print(arr1);
		
		System.out.print("原数组2：");
		print(arr2);
		
		System.out.print("合并后数组：");
		print(arrMax);
	}

	/**
	 * 遍历输出一个数组
	 * @param arr
	 */
	private static void print(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	/**
	 * 合并两个数组
	 * @param arr1
	 * @param arr2
	 * @return		返回合并后的大数组
	 */
	public static int[] unionArr(int[] arr1, int[] arr2) {
		int[] arrMax = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arrMax[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arrMax[i + arr1.length] = arr2[i];
		}
		
		return arrMax;
	}

	/**
	 * 为数组赋值（随机生成的、不重复的 1-100之间的偶数，不重复）
	 * @param arr1
	 */
	private static void fuZhi(int[] arr) {
		Random r = new Random();
		// 方法一：
		/*
		for (int i = 0; i < arr.length; i++) {
			int a = r.nextInt(100) + 1;
			boolean chongFu = isChongFu(arr, a);//false
			if (a % 2 == 0 && !chongFu) {
				arr[i] = a;
			} else {
				i--;
			}
		}
		*/
		
		// 方法二：
		
		// 定义一个变量，用来当做已经赋值的索引
		int count = 0;
		
		// 如果index < 数组的长度，代表赋值没有满
		for (int i = 0; count < arr.length; i++) {
			
			// 生成随机数
			int a = r.nextInt(100) + 1;
			
			// 判断一下这个数组中是否包含刚刚生成的随机数
			boolean chongFu = isChongFu(arr, a);
			if (a % 2 == 0 && !chongFu) {
				// 如果a是偶数,并且不存在
				arr[count] = a;
				count++;
			}
		}
	}

	/**
	 * 判断a在arr中是否存在
	 * @param arr
	 * @param a
	 * @return 返回true表示存在
	 */
	private static boolean isChongFu(int[] arr, int a) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				return true;
			}
		}
		return false;
	}

}
