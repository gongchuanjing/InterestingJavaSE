package tk.chuanjing.stage2.chapter07.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * 统计本项目中(所有java文件中)每个字母出现的次数（不用按照字母的顺序排列），
 * 按照如下格式打印： 
              a(1000)b(2000)c(3000)d(4000)... 
*/
public class Test5 {
	public static void main(String[] args) throws IOException {
		File file=new File("src\\");
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		sum(file,map);
		Set<Character> keySet = map.keySet();
		for (Character ch : keySet) {
			System.out.print(ch+"("+map.get(ch)+")");
		}
	}
	
	public static void sum(File file,Map<Character,Integer> map) throws IOException{
		File[] files = file.listFiles();
		if(files!=null){
			for (File file2 : files) {
				if(file2.isFile()&&file2.getName().endsWith(".java")){
					Set<Character> keySet = map.keySet();
					
						FileReader in=new FileReader(file2);
						int ch;
						while((ch=in.read())!=-1){
							if(ch>='a'&&ch<='z'){
								boolean flag=true;
						        for (Character chs : keySet) {
						        	if(chs==ch){
						        		Integer t=map.get(chs);
						        		map.replace(chs, t, t+1);
						        		flag=false;
						        	}
						        }
						        if(flag){
						        	map.put((char) ch, 1);
						        }
						}
					}
				}else{
					sum(file2,map);
				}
				
			}
		}
	}
}
