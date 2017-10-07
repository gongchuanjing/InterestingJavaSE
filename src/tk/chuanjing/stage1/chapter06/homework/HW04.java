package tk.chuanjing.stage1.chapter06.homework;
/**
 * @author ChuanJing
 * @date 2017年3月20日 下午4:09:27
 * @version 1.0

第四题: 分析以下需求，并用代码实现
	有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13... 定义一个方法求出这个数列的前20 项之和。
 */
public class HW04 {

	public static void main(String[] args) {
		getSum();
	}

	private static void getSum() {
		double m, n, t, sum = 0;
		n = 1;	//分母
		m = 2;	//分子
		for (int i = 1; i <= 20; i++) {
			sum += m / n;
			t = n + m;
			n = m;
			m = t;
		}
		System.out.println("前20项之和是" + sum);
	}
}
