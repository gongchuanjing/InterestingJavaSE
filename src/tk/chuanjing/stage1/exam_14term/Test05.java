package tk.chuanjing.stage1.exam_14term;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年8月11日 上午10:26:44
 * @version 1.0
 */
public class Test05 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		List<Test05_Student> list = new ArrayList<Test05_Student>();
		Test05_Student s;
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入第"+(i+1)+"个  学号，姓名，成绩（格式：学号，姓名，成绩）");
			String line = sc.nextLine();
			
			String[] split = line.split("，");
			
			s = new Test05_Student();
			s.setId(split[0]);
			s.setName(split[1]);
			s.setScore(Double.parseDouble(split[2]));
			
			list.add(s);
		}
//			s = new Student(split[0], split[1], Double.parseDouble(split[2]));
		
		System.out.println(list);
		
		String filePath = "src\\tk\\chuanjing\\stage1\\exam_14term";
		FileWriter fw = new FileWriter(filePath + "\\sj.txt");
		for (int i = 0; i < list.size(); i++) {
			Test05_Student student = list.get(i);
			if (student.getScore() > 80) {
				String w = "学号："+student.getId()+" 姓名："+student.getName()+" 成绩："+student.getScore();
				fw.write(w);
				fw.write("\r\n");
				fw.flush();
			}
		}
		
		fw.close();
	}

}
