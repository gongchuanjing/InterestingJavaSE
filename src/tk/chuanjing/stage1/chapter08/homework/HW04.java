package tk.chuanjing.stage1.chapter08.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月22日 下午4:09:26
 * @version 1.0

第四题: 分析以下需求,并用代码实现
	1.键盘录入一个字符串
	2.将该字符串变成字符数组(不能使用toCharArray()方法)
	3.将字符数组中的所有大写字母变成小写字母(最好不要使用toLowerCase()方法)
	4.如果第一位和最后一位的内容不相同,则交换
	5.将字符数组中索引为偶数的元素变成'~'
	6.打印数组元素的内容
 */
public class HW04 {

	public static void main(String[] args) {
//		char ch = 'G';
//		char reCh = myToLowerCase(ch);
//		System.out.println(reCh);
		
		// 1.键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("输入字符串:");
		String s = sc.nextLine();

		// 2.将该字符串变成字符数组(不能使用toCharArray()方法)
		char[] arr = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			arr[i] = c;
		}
		printArr(arr);

		// 3.将字符数组中的所有大写字母变成小写字母
		char[] arr1 = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			String ss = c + "";
			String sss = ss.toLowerCase();
			arr1[i] = sss.charAt(0);
		}
		printArr(arr1);
		
		// 4.如果第一位和最后一位的内容不相同,则交换
		if (arr[0] != arr[arr.length - 1]) {
			char temp = arr[0];
			arr[0] = arr[arr.length - 1];
			arr[arr.length - 1] = temp;
		}
		printArr(arr);

		// 5.将字符数组中索引为偶数的元素变成'~'
		for (int i = 0; i < arr1.length; i++) {
			if (i % 2 == 0) {
				arr1[i] = '~';
			}
		}
		printArr(arr1);
	}
	
	/**
	 * 6.打印数组元素的内容
	 * @param arr
	 */
	public static void printArr(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	/**
	 * 3.将字符数组中的所有大写字母变成小写字母(最好不要使用toLowerCase()方法)
	 * @param ch
	 * @return
	 */
	private static char myToLowerCase(char ch) {
		if (ch>='A' && ch<='Z') {
			ch += 32;
		}
		return ch;
	}

}
