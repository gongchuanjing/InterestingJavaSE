package tk.chuanjing.stage1.chapter06.exam;

import java.util.Random;

/**
 * @author ChuanJing
 * @date 2017年9月25日 下午5:46:03
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
public class Exam32 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		createRandomElment(arr1);
		createRandomElment(arr2);
		
		System.out.print("原数组1：");
		printArr(arr1);
		System.out.print("原数组2：");
		printArr(arr2);
		
		int[] newArr = unionArr(arr1,arr2);
		System.out.print("合并后数组：");
		printArr(newArr);
	}

	/*
	 * 遍历数组
	 */
	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	/*
	 * 为数组生成不重复的随机偶数
	 */
	public static void createRandomElment(int[] arr) {
		Random r = new Random();
		
		// 定义一个变量，用来当做已经赋值的索引
		int index = 0;
		
		// 判断如果这个索引是 arr.length - 1。代表已经赋值满了，就结束循环
		while (index < arr.length) {// 如果index < 数组的长度，代表赋值没有满
			// 生成随机数
			int num = r.nextInt(100) + 1;
			// 判断一下这个数组中是否包含刚刚生成的随机数
			boolean flag = exist(arr, num);
			if (!flag && num % 2 == 0) {// 如果不存在,并且num是偶数
				arr[index] = num;
				index++;
			}
		}
	}

	/*
	 * 判断一下这个数组中是否包含这个数 参数：数组，要判断的数 遍历这个数组 判断当前遍历到的数是否== 我们要判断的数，如果相等，直接返回 true
	 * 如果不等于，就一直继续遍历判断 如果遍历完了都没有找到，返回false
	 */
	public static boolean exist(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	//将两个数组的元素存入到一个新数组中并返回
	public static int[] unionArr(int[] arr1,int[] arr2) {
		int[] newArr = new int[arr1.length+arr2.length];
		//将第一个数组的元素存入到新数组中
		int i = 0;
		for(;i<arr1.length;i++) {
			newArr[i] = arr1[i];
		}
		//将第二个数组的元素存入到新数组中
		for(int j = 0;j<arr2.length;j++) {
			newArr[i++] = arr2[j];
		}
		return newArr;
	}
}