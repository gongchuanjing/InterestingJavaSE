package tk.chuanjing.stage1.chapter03.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月29日 下午10:17:46
 * @version 1.0

第十题:分析以下需求，并用代码实现：
	1.键盘录入学生成绩(整数类型),如果录入的成绩为-1表示录入结束
	2.打印输出录入的学生成绩的平均值
 */
public class HW10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score=0;//记录录入的成绩
		int sum =0;//记录录入的总成绩
		int count =0;//记录录入次数
		
		while (score != -1) {//当score不等于-1一直录入
			System.out.println("键盘录入学生成绩");
			score = sc.nextInt();
			if(score!=-1){
				sum += score;
				count++;
			}
		}
		
		System.out.println("学生成绩的平均值是:"+(sum/count));
	}

}
