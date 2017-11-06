package tk.chuanjing.stage1.exam_14term;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ChuanJing
 * @date 2017年8月11日 上午10:03:47
 * @version 1.0

1.	在项目根路径下创建data.txt文件，data.txt中存放如下数据：
	Asasaa
	aasaAA
（data.txt文件和文件中的数据可以手动创建和录入，无需由程序生成）
2.	编写一个程序，获取data.txt文件中字符’a’的个数，并将获取的结果在控制台打印输出

 */
public class Test03 {

	public static void main(String[] args) throws IOException {
		String filePath = "src\\tk\\chuanjing\\stage1\\exam_14term";
		
		List<String> list = new ArrayList<String>();
		
//		FileReader fr = new FileReader("data.txt");
//		char[] b = new char[1024];
//		int len = -1;
//		while ((len = fr.read(b)) != -1 ) {
//			String s = new String(b);
//			list.add(s);
//		}
//		
//		System.out.println(list);
//		
//		for (int i = 0; i < b.length; i++) {
//			// 去判断
//		}
		
		int count = 0;
		FileReader fr = new FileReader(filePath + "\\data.txt");
		int ch = -1;
		while ((ch = fr.read()) != -1 ) {
			if (ch == 'a') {
				count++;
			}
		}
		
		fr.close();
		System.out.println("字符’a’的个数："+count);
	}

}
