package tk.chuanjing.stage1.chapter09.homework;
/**
 * @author ChuanJing
 * @date 2017年3月24日 下午3:32:54
 * @version 1.0

	定义学生工具StudentsTool,有四个方法,描述如下
		public void listStudents(Student[] arr):遍历打印学生信息
		public int getMaxScore(Student[] arr):获取学生成绩的最高分
		public Student getMaxStudent(Student[] arr):获取成绩最高的学员
		public int getAverageScore(Student[] arr):获取学生成绩的平均值
		public int getCount(Student[] arr):获取不及格的学员数量
 */
public class StudentsTool {

	/**
	 * 遍历打印学生信息
	 * @param arr
	 */
	public void listStudents(Student[] arr){	
		for(int i=0;i<arr.length;i++){
			Student p = arr[i];
			System.out.println("姓名："+p.name+"，年龄："+ p.age+"，成绩："+p.score);
		}
	}
	
	/**
	 * 获取学生成绩的最高分
	 * @param arr
	 * @return
	 */
	public double getMaxScore(Student[] arr){	
		return getMaxStudent(arr).score;
	}
	
	/**
	 * 获取成绩最高的学员
	 * @param arr
	 * @return
	 */
	public Student getMaxStudent(Student[] arr){	
		Student p = arr[0];
		for(int i=1;i<arr.length;i++){
			if(p.score<arr[i].score){
				p = arr[i];
			}
		}
		return p;
	}
	
	/**
	 * 获取学生成绩的平均值
	 * @param arr
	 * @return
	 */
	public int getAverageScore(Student[] arr){	
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i].score;
		}
		return sum/arr.length;
	}
	
	/**
	 * 获取不及格的学员数量
	 * @param arr
	 * @return
	 */
	public int getCount(Student[] arr){	
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].score<60){
				count++;
			}
		}
		return count;
	}
}