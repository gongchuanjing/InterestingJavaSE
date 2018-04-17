package tk.chuanjing.stage2.chapter05.homework;
/**
 * @author ChuanJing
 * @date 2018年4月17日 下午7:19:53
 * @version 1.0

通过System的currentTimeMillis()方法,计算出 输出一万次我爱你,所用时间;
 */
public class HW03 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println("i love you");
		}
		long end = System.currentTimeMillis();
		
		long usedate = end - start;
		System.out.println(usedate);
	}
}
