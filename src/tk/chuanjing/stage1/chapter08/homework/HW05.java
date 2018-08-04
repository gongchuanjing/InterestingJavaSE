package tk.chuanjing.stage1.chapter08.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ChuanJing
 * @date 2017年3月29日 下午10:12:10
 * @version 1.0

第五题: 分析以下需求,并用代码实现
	1.定义String getStr()方法
		功能描述：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
	2.定义main方法，方法内完成：
		调用getStr()方法，获取返回值,并在控制台打印返回值
 */
public class HW05 {

	public static void main(String[] args) {
		System.out.println(getStr());
	}
	
	public static String getStr(){
		Random r = new Random();
		
		// 随机生成四个大写字母并组成字符串
		String str1 = "";
		for (int i = 0; i < 4; i++) {
			int num = r.nextInt(26) + 65;
			char a = (char) num;
			str1 += a;
		}

		// 随机生成一个数字并转成字符串
		String str2 = r.nextInt(10) + "";
		
		// 随机生成一个数字，作为数字在字符串中的位置
		int index = r.nextInt(5);
		System.out.println("要插入的位置：" + index);
		
		// 把数字插入到字符串中
		String sub1 = str1.substring(0, index);
		String sub2 = str1.substring(index);
		return sub1 + str2 + sub2;
	}
	
	/*
	public static String getStr(){
		String s = "";
		String[] arr = {"A","B","C","D","E","F","G","H","I","G","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int[] arrI = {0,1,2,3,4,5,6,7,8,9};
		
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		while (sb.length()!= 5) {
			if (sb.length()<4) {
				sb.append(arr[r.nextInt(25)]);
			}else{
				sb.append(arrI[r.nextInt(10)]);
			}
		}
		
		s= sb.toString();
		return s;
	}
	*/
}