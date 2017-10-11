package tk.chuanjing.stage1.chapter09.homework;
/**
 * @author ChuanJing
 * @date 2017年3月24日 下午3:18:20
 * @version 1.0

第一题：分析以下需求，并用代码实现	
	1.按照以下描述完成类的定义。
		学生类
			属性：
				姓名name
				年龄age
				成绩score
			行为：
			吃饭eat()
			stuty(String content)(content:表示学习的内容)
	2.定义学生工具StudentsTool,有四个方法,描述如下
		public void listStudents(Student[] arr):遍历打印学生信息
		public int getMaxScore(Student[] arr):获取学生成绩的最高分
		public Student getMaxStudent(Student[] arr):获取成绩最高的学员
		public int getAverageScore(Student[] arr):获取学生成绩的平均值
		public int getCount(Student[] arr):获取不及格的学员数量
	3.定义测试类TestStudentTool，在main方法中首先创建长度为5的Student数组并初始化数据,再创建StudentsTool类的对象,并调用以上方法	
 */
public class HW01 {

	public static void main(String[] args) {
		Student s1 = new Student("张三",23,90);
		Student s2 = new Student("李四",44,60);
		Student s3 = new Student("王五",25,82);
		Student s4 = new Student("赵六",51,40);
		Student s5 = new Student("孙七",29,59);
		Student[] arr = new Student[]{s1, s2, s3, s4, s5};
		
		StudentsTool studentsTool = new StudentsTool();
		studentsTool.listStudents(arr);
		
		System.out.println("学生成绩的最高分为:"+studentsTool.getMaxScore(arr));
		
		Student s = studentsTool.getMaxStudent(arr);
		System.out.println("成绩最高的学生为："+s.name);

		System.out.println("学生成绩的平均值为:"+studentsTool.getAverageScore(arr));
		
		System.out.println("不及格的学生数量为:"+studentsTool.getCount(arr));
		
		s5.study("java基础");
	}

}