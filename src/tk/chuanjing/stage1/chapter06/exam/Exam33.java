package tk.chuanjing.stage1.chapter06.exam;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年9月25日 下午5:40:55
 * @version 1.0

分析以下需求，并用代码实现： 
	1.定义4个方法，分别求两个int类型数据和（两个数相加）、差（两个数相减）、积（两个数相乘）、商（两个数相除），并将结果返回，方法描述如下： 
		public static int add(int num1,int num2)	//求num1和num2的和并返回 
		public static int sub(int num1,int num2)	//求num1和num2的差值并返回 
		public static int mul(int num1,int num2)	//求num1和num2的乘积并返回 
		public static int div(int num1,int num2)	//求num1和num2的商并返回
	2.使用上面定义的方法模拟计算器功能，对键盘录入的两个int类型的数据依次进行加、减、乘、除的运算，并打印运算结果 
	3.要求： 
		(1)键盘录入三个整数,其中前两个整数代表参加运算的数据， 第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算) 
		(2)演示格式如下: 
				请输入第一个整数:30 
				请输入第二个整数:40 
				请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0 
				控制台输出:30+40=70
 */
public class Exam33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数据");
		int num2 = sc.nextInt();
		System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
		int type = sc.nextInt();
		
		//定义变量用于接收结果
		int result = 0;
		switch(type) {
		case 0://做加法
			result = add(num1,num2);
			System.out.println(num1+"+"+num2+"="+result);
			break;
		case 1:
			result = sub(num1,num2);
			System.out.println(num1+"-"+num2+"="+result);
			break;
		case 2:
			result = mul(num1,num2);
			System.out.println(num1+"*"+num2+"="+result);
			break;
		case 3:
			result = div(num1,num2);
			System.out.println(num1+"/"+num2+"="+result);
			break;
		default:
			System.out.println("您输入有误");
		}
	}
	
	//求num1和num2的和并返回
	public static int add(int num1,int num2) {
		return num1 + num2;
	}
	
	//求num1和num2的差值并返回
	public static int sub(int num1,int num2) {
		return num1 - num2;
	}
	
	//求num1和num2的乘积并返回
	public static int mul(int num1,int num2) {
		return num1*num2;
	}
	
	//求num1和num2的商并返回
	public static int div(int num1,int num2) {
		return num1/num2;
	}
}