package tk.chuanjing.stage1.chapter06.exam;
/**
 * @author ChuanJing
 * @date 2017年9月25日 下午6:06:56
 * @version 1.0
 */
public class MyExam01To30 {
	public static void main(String[] args) {
//		  test03();
		  test15();
	}

	private static void test15() {
//		byte a=0,b=3;byte c =a+b;
//		short s =23; s=s+12;
//		float f = 23+23.23;
		short s=23; s+=12;
	}

	private static void test03() {
		int year = 2046;
		if(!(year%2 == 0)) {
		   if(year/10==0) {
		    System.out.print("进入了if ");
		   }
		} else {
		   System.out.print("进入了else ");
		}
		System.out.println("退出");
	}
}
