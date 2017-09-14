package tk.chuanjing.stage2.chapter09.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ChuanJing
 * @date 2017年4月23日 下午11:23:53
 * @version 1.0
 */
public class HW07_CopyDirectory {
	public static void main(String[] args) {
        copy("G:\\a","E:\\a");
        System.out.println("复制完成!");
    }

    private static void copy(String src, String des) {
        File fileSrc = new File(src);
        File fileDes = new File(des);
        
        File[] fs = fileSrc.listFiles();
        
        if(!fileDes.exists()){
            fileDes.mkdirs();
        }

        for (File f : fs) {
            if(f.isFile()){
                fileCopy(f.getPath(), des + "\\" + f.getName());
                
            }else if(f.isDirectory()){
                copy(f.getPath(), des + "\\" + f.getName());
                
            }
        }
    }
  
    /** 
     * 文件拷贝的方法，可以不用BufferedInputStream，自己可以改，
     * 这只是封装的一个复制文件的方法，可以改成自己喜欢的写法
     */  
    private static void fileCopy(String src, String des) {
    	BufferedInputStream bis = null;
    	BufferedOutputStream bos = null;
    	try {
			bis = new BufferedInputStream(new FileInputStream(src));
			bos = new BufferedOutputStream(new FileOutputStream(des));
			
			int len = -1;
			byte[] bs = new byte[1024];
			while( (len = bis.read(bs)) != -1) {
				bos.write(bs, 0, len);
				bos.flush();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
    }
}
