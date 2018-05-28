package tk.chuanjing.stage2.chapter10.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.项目根路径下有stations.txt文件，内容如下：
		朱辛庄
		育知路
		平西府
		回龙观东大街
		霍营
		育新
		西小口
		//....	
	2.利用IO流的知识读取stations.txt文件，将内容写入到subway8.txt,写入格式如下：
		1=朱辛庄
		2=育知路
		3=平西府
		4=回龙观东大街
		5=霍营
		//....
	
	3.读取subway8.txt文件内容存储到map集合中，key：表示第几站，value：表示站名，并遍历打印(可以不按顺序打印)：
		第10站: 森林公园南门
		第6站: 育新
		第12站: 奥体中心
		第13站: 北土城
		//...

 * @author ChuanJing
 * @date 2018年5月14日 下午2:21:57
 * @version 1.0
 */
public class Exam34 {
	public static void main(String[] args) throws Exception{
		// 这个地方的路径具体运行时需要改成自己的
		String pathName1 = "src/tk/chuanjing/stage2/chapter10/exam/stations.txt";
		String pathName2 = "src/tk/chuanjing/stage2/chapter10/exam/subway8.txt";
		
		HashMap<String,String> hm = new HashMap<>();
		BufferedReader br =  new BufferedReader(new FileReader(new File(pathName1)));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(pathName2)));
		int index = 1;
		String line = null;
		while(null!=(line = br.readLine())) {
			bw.write((index++)+"="+line);
			bw.newLine();
		}
		bw.close();
		br.close();
		
		br =  new BufferedReader(new FileReader(new File(pathName2)));
		line = null;
		while(null!=(line = br.readLine())) {
			String[] strs = line.split("=");
			hm.put("第"+strs[0]+"站", strs[1]);
		}
		br.close();
		
		for(Map.Entry<String, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}
