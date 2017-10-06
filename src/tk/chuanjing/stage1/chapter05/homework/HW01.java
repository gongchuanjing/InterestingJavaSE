package tk.chuanjing.stage1.chapter05.homework;
/**
 * @author ChuanJing
 * @date 2017年3月28日 下午8:51:59
 * @version 1.0

第一题：分析以下需求，并用代码实现(每个小需求都需要封装成方法)
	1.求两个数据之和(整数和小数)
	2.判断两个数据是否相等(整数和小数)
	3.获取两个数中较大的值(整数和小数)
	4.获取两个数中较小的值(整数和小数)
	5.否能用一个方法实现3和4的两个功能
 */
public class HW01 {

	public static void main(String[] args) {
		// 1.求两个数据之和(整数和小数)
		int x  = sum(3,5);
		System.out.println(x);
		
		double sum = sum(1.1,2.2);
		System.out.println(sum);
		
		// 2.判断两个数据是否相等(整数和小数)
		boolean isEquals = isEquals(8, 8);
		System.out.println(isEquals);
		
		// 3.获取两个数中较大的值(整数和小数)
		int max = max(8, 9);
		System.out.println(max);
		
		// 4.获取两个数中较小的值(整数和小数)
		int min = min(8, 9);
		System.out.println(min);
		
		// 5.否能用一个方法实现3和4的两个功能
		int maxOrMin = getMaxOrMin(8, 9, true);
		System.out.println("较大值：" + maxOrMin);
	}
	
	public static int sum(int a,int b){
		return a + b;
	}
	
	public static double sum(double a,double b){
		return a + b;
	}
	
	private static boolean isEquals(int i, int j) {
		return i == j;
	}
	
	private static boolean isEquals(double i, double j) {
		return i == j;
	}
	
	public static int max(int a,int b){
		return a > b ? a : b;
	}
	
	public static double max(double a,double b){
		return a > b ? a : b;
	}
	
	public static int min(int a,int b){
		return a < b ? a : b;
	}
	
	public static double min(double a,double b){
		return a < b ? a : b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param isMax		isMax=true求最大值,false求最小值
	 * @return
	 */
	public static int getMaxOrMin( int a, int b, boolean isMax){
		if (isMax) {
			//返回最大值
			return a > b ? a : b;
		} else {
			//返回最小值
			return a < b ? a : b;
		}
	}

}
