package tk.chuanjing.stage1.chapter04.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import org.junit.Test;

/*
	1.键盘录入班级人数                 int x = 9;
	2.根据录入的班级人数创建数组  int[] arr = new int[9];
	3.利用随机数产生0-100的成绩(包含0和100)  re.nextInt(101);
		3-1 把成绩添加到数组中.for
	4.要求:
	          (1)打印该班级的不及格人数
	          (2)打印该班级的平均分
	          (3)演示格式如下:
	                   请输入班级人数:
	                   键盘录入:100
	                   控制台输出:
	                            不及格人数:19
	                            班级平均分:87
*/
public class HW01 {
	
	public static void main(String[] args) {
		int sum = 0;//不及格人数
		int count = 0;//所有人的成绩
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 请输入班级人数:");
		int x = sc.nextInt();
		
		//根据录入的班级人数创建数组
		int[] arr = new int[x];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			//得到一个0-100之间的随机数
			int temp = ran.nextInt(101);
			arr[i] = temp;
		}
		
		//遍历所有学生的成绩.把没一个元素判断一下.跟60对比.小于60就是不及格
		for (int i = 0; i < arr.length; i++) {
			count += arr[i];
			if(arr[i] < 60){
				sum ++;
			}
		}
		
		System.out.println("不及格人数:"+sum);
		System.out.println("班级平均分:"+(count/x));
	}
	
	// 演示错误：
	@Test
	public void test() {
		int sum = 0;//所有人的成绩
		int count = 0;//不及格人数
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 请输入班级人数:");
		int x = sc.nextInt();
		
		int[] arr = new int[x];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			int temp = ran.nextInt(101);
//			arr[i] = temp;
			sum += temp;
			if(arr[i] < 60){
				count ++;
			}
		}
		
		System.out.println("不及格人数:"+(count/x));
		System.out.println("班级平均分:"+sum);
		
		System.out.println(Arrays.toString(arr));
	}
}