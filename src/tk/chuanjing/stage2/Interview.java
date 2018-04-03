package tk.chuanjing.stage2;

import java.util.Arrays;


/**
 * @author ChuanJing
 * @date 2018年4月16日 上午9:03:24
 * @version 1.0
 */
public class Interview {
	public static void main(String[] args) {
		/*
		A a = new A();
		a.age = 20;
		a.name = "张三";
		
		System.out.println("之前：" + a);
		test(a);
		System.out.println("之后：" + a);
		*/
		maoPaoPaiXu();		//冒泡排序
		xuanZhePaiXu();		//选择排序
		shunXuChaZhao();	//顺序查找
		erFenChaZhao();		//二分(折半)查找
	}
	
	/**
	 * 二分(折半)查找
	 * 	循环操作：
	 * 		1.找中间值
	 * 		2.分三种情况（相等、大改left、小改right）
	 * 			循环条件：left <= right
	 */
	private static void erFenChaZhao() {
		//被查找数组必须有序
		int[] arr={1,2,3,4,5,6,7,8,9};
		int x = 9;   //要找的数
		int left = 0;
		int right=arr.length-1;	
		while (left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==x) {
				System.out.println("存在");
				break;
			}
			if(arr[mid]<x) {
				left=mid+1;
			}
			if(arr[mid]>x) {
				right=mid-1;
			}
		}
		if(left>right) {
			System.out.println("不存在");
		}
	}

	/**
	 * 顺序查找
	 * 	1. 拿着要找的数跟数组中每个数进行相等判断
	 * 	2. 加标记来判断不存在的情况
	 */
	private static void shunXuChaZhao() {
		int[] arr={1,5,2,7,9};
		int x=99;   //要找的数
		boolean flag=true;   //标记
		for (int i = 0; i < arr.length; i++) {
			if(x==arr[i]) {
				System.out.println("存在");
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println("不存在");
		}
	}

	/**
	 * 选择排序
	 * 	1. 求数组的最小值的下标，打擂台
	 * 	2. 每一轮：求最小值的下标，然后把最小值放到前面(换位置)，需要用循环实现
	 * 		第1轮      最小值要放到   arr[0]   从xx开始循环
	 * 		第2轮      最小值要放到   arr[1]   从xx开始循环
	 * 		第3轮      最小值要放到   arr[2]   从xx开始循环
	 * 	3. 需要很多轮，具体轮数不确定，最多轮数=数组长度-1，需要用循环实现
	 */
	private static void xuanZhePaiXu() {
		// 原数组
		int[] arr={3,5,1,7,6,2,9,0};
		
		//从小到大
		for(int j=0;j<arr.length-1;j++) {
			int min_i=j;
			for (int i = j+1; i < arr.length; i++) {
				if(arr[min_i]>arr[i])
					min_i=i;
			}
			int temp=arr[j];
			arr[j]=arr[min_i];
			arr[min_i]=temp;
		}
		
		System.out.println("排序后结果：" + Arrays.toString(arr));
	}

	/**
	 * 冒泡排序
	 *	1. 每一轮：相邻的两个数字比大小，小的放前面，大的放后面（交换位置），需要用循环实现
	 *	2. 需要很多轮，具体轮数不确定，最多轮数=数组长度-1 ，需要用循环实现
	 */
	private static void maoPaoPaiXu() {
		// 原数组
		int[] arr = { 3, 5, 1, 7, 6 };
		
		// 从小到大
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

		System.out.println("排序后结果：" + Arrays.toString(arr));
	}

	protected static void test(A s) {
		s.age = 30;
		s.name = "李四";
		
		System.out.println("中间：" + s);
	}
}

class A {
	public A() {
		
	}
	
	public int age;
	public String name;
	
	@Override
	public String toString() {
		return "A [age=" + age + ", name=" + name + "]";
	}
}

class B {
	public B() {
		
	}
	
	public B(String name) {
		
	}
}