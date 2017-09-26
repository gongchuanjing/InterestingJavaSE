package tk.chuanjing.stage1.chapter06.exam;
/**
 * @author ChuanJing
 * @date 2017年9月26日 上午10:15:01
 * @version 1.0

分析以下需求，并用代码实现： 
	什么是水仙花数呢? 
		所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。 
	举例：153就是一个水仙花数。 
		153 = 1*1*1 + 5*5*5 + 3*3*3
	要求: 
		1.定义方法public static boolean isSXH(int num) 
			功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false 
		2.借助1中定义的方法实现判断数据是否为水仙花数,在控制台2个一行输出所有的水仙花数，最后打印水仙花的总个数。 
 */
public class MyExam31 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i <= 999; i++) {
			boolean sxh = isSXH(i);
			if (sxh) {
				count++;
				System.out.print(i + "     ");
				if (count % 2 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("水仙花数共有：" + count);
	}

	/**
	 * 判断一个数字是不是水仙花数
	 * @param num 一个整型数字
	 * @return true代表是一个水仙花数，false代表不是水仙花数
	 */
	public static boolean isSXH(int num) {
		int ge = num % 10;
		int shi = num / 10 % 10;
		int bai = num / 10 / 10 % 10;
		if (num == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
			return true;
		} else {
			return false;
		}
	}
}