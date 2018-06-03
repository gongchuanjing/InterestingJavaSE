package tk.chuanjing.stage2.chapter10.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 统计本项目中(所有java文件中)每个字母出现的次数（不用按照字母的顺序排列），按照如下格式打印：
		a(1000)b(2000)c(3000)d(4000)...

 * @author ChuanJing
 * @date 2018年5月14日 下午2:27:52
 * @version 1.0
 */
public class Exam35 {

	public static void main(String[] args) throws Exception {
		//这里为了方便，给出绝对路径，这个地方的路径具体运行时需要改成自己的
		File srcDir =  new File("src/tk/chuanjing/stage2/chapter10/exam");
		
		//创建HashMap集合，key:是字符，value:是该字符出现的次数
		HashMap<Character,Integer> hm = new HashMap<>();
		
		countCharactersFromJavaFiles(srcDir,hm);
		
		//按要求打印hm中的内容：a(1000)b(2000)c(3000)d(4000)...
		print(hm);
	}
	
	/**
	 * 按要求打印hm中的内容
	 * a(1000)b(2000)c(3000)d(4000)...
	 * @param hm:要打印的集合
	 */
	private static void print(HashMap<Character, Integer> hm) {
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			//将map集合中的内容拼接成a(1000)b(2000)c(3000)d(4000)...
			sb.append(entry.getKey()).append("(").append(entry.getValue()).append(")");
		}
		System.out.println(sb.toString());
	}
	
	/**
	 * 
	 * @param srcDir:需要统计的源路径
	 * @param hm:用于保存字符和其对应出现次数的集合
	 * @throws Exception 
	 */
	private static void countCharactersFromJavaFiles(File srcDir,HashMap<Character,Integer> hm) throws Exception {
		//获取源路径中的所有File对象（文件、文件夹）组成的File数组
		File[] files = srcDir.listFiles();
		
		//遍历File对象数组，为了防止出现NullPointerException，添加了if判断
		if(files!=null&&files.length>0) {
			for (File file : files) {
				//如果是文件
				if(file.isFile()) {
					//获取文件名称
					String fileName = file.getName();
					//如果是java文件
					if(fileName.endsWith(".java")) {
						//读取文件内容
						//创建文件字符缓冲流对象并和file文件相关联
						BufferedReader br = new BufferedReader(new FileReader(file));
						String line = null;
						//循环读取文件中的每一行
						while(null!=(line = br.readLine())) {
							//将读到的一行变成字符数组
							char[] chars = line.toCharArray();
							//遍历字符数组
							for (char ch : chars) {
								//将字母存入集合中
								if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
									//如果ch在hm中没有出现过，则存入该字符和1
									//如果ch在hm中已经出现过，则存入该字符和该字符原来对应的数量+1
									hm.put(ch, hm.get(ch)==null?1:hm.get(ch)+1);
								}
							}
						}
					}
				} else if(file.isDirectory()) {//如果是文件夹则进行递归操作
					countCharactersFromJavaFiles(file, hm);
				}
			}
		}
	}
}
