package tk.chuanjing.stage1.chapter03.homework;
/**
 * @author ChuanJing
 * @date 2017年3月29日 下午9:28:50
 * @version 1.0

第七题：分析以下需求，并用代码实现：
	1.打印1到100之内的整数，但数字中包含9的要跳过
	2.每行输出5个满足条件的数，之间用空格分隔
	3.如：1 2 3 4 5 
 */
public class HW07 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			int j = i % 10;
			
			if(j==9 || i/10 == 9){
				
			}else{
				System.out.print(i+" ");
				count++;
				
				// 2.每行输出5个满足条件的数，之间用空格分隔
				if(count % 5 == 0){
					System.out.println();
				}
			}
		}
	}
}