package tk.chuanjing.stage1.exam_08term_remediation02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ChuanJing
 * @date 2017年4月1日 上午9:11:08
 * @version 1.0

案例1:(I/O操作)
	1.在E://创建一个test.txt的文件.文件内容随意,将文件复制到F盘下
 */
public class Test01 {

	public static void main(String[] args) throws IOException {
//		---------------------------FileWriter：---------------------------
//		public FileWriter(String fileName)
//		public FileWriter(String fileName,boolean append)
//		public void write(String str)
//		public void write(char[] cbuf)
//		public void write(char[] b,int off, int len)
//		public void flush()     清缓冲区，强制写入，鸡肋，没啥用
//		public void close()	   底层调用了flush()

//		FileWriter fw = new FileWriter("b.txt");
//		fw.write("kkkkkkk");
//		fw.close();
		
//		---------------------------FileReader：---------------------------
//		public FileReader(String path)    文件不存在不会自动创建
//		public int read()  一次读一个字符   返回的是ASCII值   读不到数据返回-1
//		public int read(char[] c)  一次读 c.length个字符，  返回的是数据的长度   读不到数据返回-1
//		public void close()

//		FileReader fr = new FileReader("b.txt");
//		int read = fr.read();
//		System.out.println(read);
//		char[] c = new char[1024 * 5];
//		int read = fr.read(c);
//		System.out.println(c);
//		fr.close();
		
//		---------------------------BufferedWriter：---------------------------
//		public BufferedWriter(Writer out)   缓冲区默认大小是8k
//		FileWriter fw = new FileWriter("b.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
//		public void write(char[] cbuf)
//		public void write(char[] cbuf,int index,int len)
//		public void write(String str)
//		public void newLine()   \r\n   独有方法，优势是跨平台
//		public void flush()  
//		public void close()

//		BufferedWriter bw2 = new BufferedWriter(new FileWriter("b.txt"));
//		char[] ch = {'r', 'g', 'p'};
//		bw2.write(ch);
//		bw2.write(ch, 1, 2);
//		bw2.newLine();
//		bw2.write("我爱学习");
//		bw2.close();
		
//		---------------------------BufferedReader：---------------------------
//		public BufferedReader(Reader in)   缓冲区默认大小是8k
//		public int read()
//		public int read(char[] cbuf)
//		public String readLine()    独有方法   一次读取一行
//		public void close()

//		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
//		int read = br.read();
		
//		char[] c = new char[1024];
//		int size = br.read(c);
//		String s = br.readLine();
//		System.out.println(s);
//		
//		s = br.readLine();
//		System.out.println(s);
//		br.close();
		
//		---------------------------复制文件---------------------------
		BufferedReader br = new BufferedReader(new FileReader("E:\\我爱学习.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\我爱学习.txt"));
		
		// 抽取之前的循环：
//		while(true){
//			line = br.readLine();
//			if (line == null) {
//				break;
//			}
//			bw.write(line);
//			bw.newLine();
//		}
		
		// 抽取之后的循环：
		String line;
		while( (line = br.readLine()) != null){
			bw.write(line);
			bw.newLine();
		}
		
		br.close();
		bw.close();
		System.out.println("复制完成！");
	}
}