package tk.chuanjing.stage2.chapter09.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
                            _ooOoo_    
                           o8888888o    
                           88" . "88    
                           (| -_- |)    
                            O\ = /O    
                        ____/`---'\____    
                      .   ' \\| |// `.    
                       / \\||| : |||// \    
                     / _||||| -:- |||||- \    
                       | | \\\ - /// | |    
                     | \_| ''\---/'' | |    
                      \ .-\__ `-` ___/-. /    
                   ___`. .' /--.--\ `. . __    
                ."" '< `.___\_<|>_/___.' >'"".    
               | | : `- \`.;`\ _ /`;.`/ - ` : | |    
                 \ \ `-. \_ __\ /__ _/ .-` / /    
         ======`-.____`-.___\_____/___.-`____.-'======    
                            `=---='    
         .............................................    
                  佛祖保佑             永无BUG   
          佛曰:    
                  写字楼里写字间，写字间里程序员；    
                  程序人员写程序，又拿程序换酒钱。    
                  酒醒只在网上坐，酒醉还来网下眠；    
                  酒醉酒醒日复日，网上网下年复年。    
                  但愿老死电脑间，不愿鞠躬老板前；    
                  奔驰宝马贵者趣，公交自行程序员。    
                  别人笑我忒疯癫，我笑自己命太贱；    
                  不见满街漂亮妹，哪个归得程序员？
                  
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
