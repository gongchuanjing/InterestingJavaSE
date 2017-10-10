package tk.chuanjing.stage1.chapter08.homework;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年3月22日 下午3:43:21
 * @version 1.0

第二题：分析以下需求，并用代码实现
	1.键盘录入一个大字符串,再录入一个小字符串
	2.统计小字符串在大字符串中出现的次数
	3.代码运行打印格式:
		请输入大字符串:javajava I love java l like jajavava I enjoy javajavajava
		请输入小字符串:heima
		控制台输出:小字符串heima,在大字符串woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma中共出现3次
		
第二题Pro版：打印一个 字符 在一个 字符串 中出现的所有下标
			代码运行打印格式:
				请输入大字符串和一个字符，中间用逗号隔开：
				javajava,j
				字符j在字符串javajava中出现的下标有：
				0	4
 */
public class HW02Pro {

	public static void main(String[] args) {
//		test2();
		test2Pro();
	}

	private static void test2Pro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入大字符串和一个字符，中间用英文逗号隔开:");
		String line = sc.nextLine();
		String[] split = line.split(",");
		char a = split[1].toCharArray()[0];
		
		getCountForChar(split[0], a);
	}

	private static void getCountForChar(String str, char c) {
		int index = 0;
		int fromIndex = 0;
		
		System.out.println("字符"+ (char)c +"在字符串"+ str +"中出现的下标有：");
		while((index=str.indexOf(c, fromIndex)) != -1){
			System.out.print(index + "\t");
			fromIndex = index + 1;
		}
	}

	private static void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入大字符串:");
		String da = sc.nextLine();
		
		System.out.println("请输入小字符串:");
		String xiao = sc.nextLine();
		
		int count = getCount(da, xiao);
		
		System.out.println("小字符串"+ xiao +",在大字符串"+ da +"中共出现"+ count +"次");
//		System.out.println(da.split(xiao).length);
	}
	
	//获取次数的方法
	public static int getCount(String str, String key){
		int count = 0;
		int index = 0;
		while((index=str.indexOf(key)) != -1){
			str = str.substring(index + key.length());
			count++;
		}
		return count;
	}
}
