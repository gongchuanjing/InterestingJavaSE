package tk.chuanjing.stage1.exam_14term;
/**
 * @author ChuanJing
 * @date 2017年8月11日 上午9:40:55
 * @version 1.0

在main方法内按以下要求编写代码：
1.	定义一个数组，依次存储1~9(包含1和9)的整数；
2.	计算这个数组中角标为奇数的元素“总和”，并在控制台打印这个和；
 */
public class Test01 {

	public static void main(String[] args) {
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i%2 != 0) {
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
	}

}
