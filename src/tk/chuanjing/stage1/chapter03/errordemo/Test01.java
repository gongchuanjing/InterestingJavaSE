package tk.chuanjing.stage1.chapter03.errordemo;
/**
 * @author ChuanJing
 * @date 2017年9月21日 上午10:03:10
 * @version 1.0
 */
public class Test01 {

	public static void main(String[] args) {
//		qiuHe();
		
		suiXianHua();
	}

	/**
	 * 	需求：求1——100 的和
	 *  问题：先打印 和 后打印 的问题
	 */
	private static void qiuHe() {
		int sum = 0;
		int i = 0;
		do {
			sum += i;
			System.out.println(sum);
			i++;
		} while (i <= 100);
	}

	/**
	 * 需求：在控制台输出所有的”水仙花数”
	 * 
	 * 分析：
	 * 		什么是水仙花数呢?
	 * 			所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	 *			举例：153就是一个水仙花数。
	 *			153 = 1*1*1 + 5*5*5 + 3*3*3
	 *
	 *		A:三位数其实就告诉了我们水仙花数的范围
	 *			100-999
	 *		B:如何获取一个数据的每一个位上的数呢?
	 *			举例：我有一个数据153，请问如何获取到个位，十位，百位
	 *			个位：153%10 = 3;
	 *			十位：153/10%10 = 5;
	 *			百位：153/10/10%10 = 1;
	 *			千位：...
	 *			万位：...
	 *		C:让每个位上的立方和相加，并和该数据进行比较，如果相等，就说明该数据是水仙花数，在控制台输出
	 *
	 *	问题：把 % 符号写成了 & 符号
	 */
	private static void suiXianHua() {
		for(int x = 100; x < 1000; x++) {
			int ge = x & 10;
			int shi = x / 10 & 10;
			int bai = x / 10 / 10 & 10;
			
			if((ge * ge * ge + shi * shi * shi + bai * bai * bai) == x) {
				System.out.println(x);
			}
		}
	}
}