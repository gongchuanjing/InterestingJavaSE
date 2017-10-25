package tk.chuanjing.stage2.chapter09.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ChuanJing
 * @date 2017年4月23日 下午3:14:22
 * @version 1.0
 */
public class TestIOInputOut {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
//			fis = new FileInputStream("粪票.png");
//			fos = new FileOutputStream("粪票2.png");
			fis = new FileInputStream("src\\tk\\chuanjing\\stage2\\chapter09\\test\\粪票.png");
			fos = new FileOutputStream("src\\tk\\chuanjing\\stage2\\chapter09\\test\\粪票2.png");
			
			int len = -1;
			byte[] b = new byte[1024];
			while ( (len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
			
			System.out.println("复制完成！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}