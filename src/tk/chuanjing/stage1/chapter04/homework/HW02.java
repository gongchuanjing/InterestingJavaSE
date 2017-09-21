package tk.chuanjing.stage1.chapter04.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月20日 下午4:28:01
 * @version 1.0

第二题：分析以下需求，并用代码实现
	1.基础班考试要进行分组,键盘录入该班级总共多少组?以及每组的学生数量?
	2.根据录入的组数及每组学员的数量创建二维数组
	3.利用随机数产生0-100的成绩(包含0和100)
	4.要求:
		(1)打印该班级中每组的不及格人数
		(2)打印该班级中每组的平均分
		(3)打印组的最高平均分
		(4)打印班级中的不及格人数
		(5)打印班级平均分
		(6)演示格式如下:
			请输入班级总组数:3
			请输入班级中每组的人数:10
			控制台输出:
				第1组不及格人数为: 6 人
				第1组平均分为: 52
				第2组不及格人数为: 7 人
				第2组平均分为: 46
				第3组不及格人数为: 3 人
				第3组平均分为: 69
				班级中单组最高平均分为:69
				班级中不及格人数为: 16 人
				班级总平均分为: 56
 */
public class HW02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入班级总组数:");
		int team = sc.nextInt();
		
		System.out.println("请输入班级中每组的人数:");
		int stu = sc.nextInt();
		
		int[][] arr = new int[team][stu];
		
		getScore(arr);//随机创建分数
		
		for (int i = 0; i < arr.length; i++) {
			int notQualifiedCount = getNotQualified(arr[i]);
			System.out.println("第"+ (i + 1) +"组不及格人数为: "+ notQualifiedCount +" 人");
			
			int avg = getAvg(arr[i]);
			System.out.println("第"+ (i + 1) +"平均分为: "+ avg);
		}
		
		System.out.println("班级中单组最高平均分为:" + getMaxAvg(arr));
		
	}
 
	/**
	 * 每组不及格人数
	 * @param arr 
	 */
	private static int getNotQualified(int[] arr) {
		int notQualifiedCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 60) {
				notQualifiedCount++;
			}
		}
		return notQualifiedCount;
	}
	
	/***
	 * 计算每组平均分
	 * @param is
	 * @return
	 */
	private static int getAvg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		int avg = sum / arr.length;
		return avg;
	}

	/**
	 * 随机创建分数
	 * @param arr 
	 */
	private static void getScore(int[][] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(101);
			}
		}
	}
	
	/**
	 * 获取最高平均分
	 * @param arr
	 */
	private static int getMaxAvg(int[][] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (getAvg(arr[i]) > max) {
				max = getAvg(arr[i]);
			}
		}
		return max;
	}
}
