package tk.chuanjing.stage1.exam_08term;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ChuanJing
 * @date 2017年4月2日 上午8:59:37
 * @version 1.0
 */
public class Exam03 {

	public static void main(String[] args) throws IOException {
		String filePath = "src\\tk\\chuanjing\\stage1\\exam_08term";
		
		// 创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader(filePath + "\\data.txt"));
		// 创建输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + "\\result.txt"));

		// 创建String变量用于接收读取到的数据
		String line = null;

		// 判断是否读取到了末尾
		while ((line = br.readLine()) != null) {

			// 把读取到的字符串数据转化为字符数组
			char[] chs = line.toCharArray();

			// 遍历字符数组，得到每一个元素
			for (int x = 0; x < chs.length; x++) {

				// 判断数组中的元素是否在0-9之间
				if (chs[x] >= '0' && chs[x] <= '9') {

					// 在0-9之间就写入新的文本文件
					bw.write(chs[x]);
				}

			}

			// 换行
			bw.newLine();

			// 刷新
			bw.flush();
		}

		// 释放资源
		bw.close();
		br.close();
	}

}
