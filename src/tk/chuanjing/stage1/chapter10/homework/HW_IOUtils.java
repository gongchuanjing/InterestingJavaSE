package tk.chuanjing.stage1.chapter10.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ChuanJing
 * @date 2017年3月26日 下午5:03:19
 * @version 1.0

定义一个工具类IOUtils，有以下方法，方法描述如下(以下操作只针对纯文本文件(.txt文件))：
	1.copyFile2Dir(String srcFile,String destDir)
	    参数String srcFile:要复制的源文件
		参数String destDir:复制产生的新文件的存储路径(目标路径)
		要求：将srcFile文件复制到destDir目标文件夹中(不能改变源文件的名称)
	2.copyDir2Dir(String srcDir,String destDir)
		参数File srcDir:要复制的源文件夹
		参数File destDir:复制产生的新文件的存储路径(目标路径)
		要求：将srcDir文件夹中的所有文件(不包含子文件夹)复制到destDir目标文件夹中(不能改变源文件的名称)
 */
public class HW_IOUtils {

	/**
	 * 将srcFile文件复制到destDir目标文件夹中(不能改变源文件的名称)
	 * @param srcFile	要复制的源文件
	 * @param destDir	复制产生的新文件的存储路径(目标路径)
	 * @throws IOException 
	 */
	public static void copyFile2Dir(String srcFile,String destDir) throws IOException {
		File file = new File(srcFile);
		String srcFileName = file.getName();
		
		BufferedReader br = new BufferedReader(new FileReader(srcFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destDir + File.separator + srcFileName));
		
		String line;
		while( (line = br.readLine()) != null ) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		br.close();
		bw.close();
		
		System.out.println("复制完成！");
	}
	
	/**
	 * 将srcDir文件夹中的所有文件(不包含子文件夹)复制到destDir目标文件夹中(不能改变源文件的名称)
	 * @param srcDir	要复制的源文件夹
	 * @param destDir	复制产生的新文件的存储路径(目标路径)
	 */
	public static void copyDir2Dir(String srcDir,String destDir) {
		
	}
}
