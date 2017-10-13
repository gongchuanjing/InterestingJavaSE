package tk.chuanjing.stage1.chapter10.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ChuanJing
 * @date 2017年3月25日 上午11:41:40
 * @version 1.0
 */
public class TestIO {

	public static void main(String[] args) throws IOException {

//		testFileWriter();
		testFileReaderWriter();
//		testFileInputOutputStream();
	}

	private static void testFileWriter() throws IOException {
		FileWriter fw = new FileWriter("a.txt");
		fw.write("犯我大汉者，虽远必诛！");
		fw.flush();
		fw.write("谁犯诛谁");
		fw.flush();
		fw.close();
	}
	
	private static void testFileReaderWriter() throws FileNotFoundException,
			IOException {
		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("b.txt", true);
		
//		int ch;
//		while ( (ch = fr.read()) != -1) {
//			fw.write(ch);
//		}
		
		char[] chs = new char[1024];
		int ch;
		while ( (ch = fr.read(chs)) != -1) {
			fw.write(chs, 0, ch);
		}
		
		fr.close();
		fw.close();
		
		System.out.println("复制完成！");
	}

	private static void testFileInputOutputStream() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("G:\\电影.pptx");
			fos = new FileOutputStream("G:"+File.separator+"哈哈.pptx");
			
			byte[] b = new byte[1 * 1024 * 1024];
			while (true) {
				int read = fis.read(b);
				if (read == -1) {
					break;
				}
				fos.write(b, 0, read);
			}
			
			System.out.println("复制完成！");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
