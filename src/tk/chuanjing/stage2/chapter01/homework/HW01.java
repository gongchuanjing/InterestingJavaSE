package tk.chuanjing.stage2.chapter01.homework;
/**
 * @author ChuanJing
 * @date 2018年4月3日 下午7:56:01
 * @version 1.0

第一题：
	int x = 10; 
 	int y = x++;
	int z = x++ + --y + x; 
	求z的值
 */
public class HW01 {
	public static void main(String[] args) {
		int x = 10; 
		int y = x++;			//y=10,x=11;
		int z = x++ + --y + x;	//z=11+9+12
		System.out.println(z);	//32
	}
}
