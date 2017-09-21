package tk.chuanjing.stage1.chapter03.homework;
/**
 * @author ChuanJing
 * @date 2017年3月29日 下午10:05:40
 * @version 1.0

第九题:分析以下需求，并用代码实现：
	1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
	2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
 */
public class HW09 {
	
	public static void main(String[] args) {
		int count = 0;				//记录折叠次数
		double high = 0.0001;
		
		while(high <= 8848){
			high *= 2;
			count++;
		}
		
		System.out.println("折叠次数：" + count);
	}
}