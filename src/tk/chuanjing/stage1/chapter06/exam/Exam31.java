package tk.chuanjing.stage1.chapter06.exam;
/**
 * @author ChuanJing
 * @date 2017年9月25日 下午5:33:58
 * @version 1.0

分析以下需求，并用代码实现：
     什么是水仙花数呢?
		所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
		举例：153就是一个水仙花数：153 = 1*1*1 + 5*5*5 + 3*3*3
	要求:
		1.定义方法public static boolean isSXH(int num)
			功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false
			
		2.借助1中定义的方法,2个一行,打印所有的水仙花数及水仙花数的总个数
 */
public class Exam31 {
	public static void main(String[] args) {
		int count = 0;
		//通过循环获取到每一个三位数
		for(int x=100; x<1000; x++) {
			if(isSXH(x)) {				
				System.out.print(x+"\t");
				count++;
				if(count%2==0) {
					System.out.println();
				}
			}
		}
		System.out.println("总共有 "+count+" 个水仙花数");
	}
	
	/**
	 * 判断一个三维数字是否是水仙花数
	 */
	public static boolean isSXH(int num) {
		//获取个位，十位，百位
		int ge = num%10;
		int shi = num/10%10;
		int bai = num/10/10%10;
		
		//让每个位上的立方和相加，并和该数据进行比较，如果相等，就说明该数据是水仙花数
		return ge*ge*ge+shi*shi*shi+bai*bai*bai == num;
	}

}