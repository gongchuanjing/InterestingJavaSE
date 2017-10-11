package tk.chuanjing.stage1.chapter09.homework;
/**
 * @author ChuanJing
 * @date 2017年3月24日 下午3:20:35
 * @version 1.0

	按照以下描述完成类的定义。
		学生类
			属性：
				姓名name
				年龄age
				成绩score
			行为：
			吃饭eat()
			stuty(String content)(content:表示学习的内容)
 */
public class Student {
	// 属性
	String name;		// 姓名
	int age;			// 年龄
	double score;		// 成绩

	// 无参构造
	public Student(){}
	
	// 有参构造
	public Student(String name_in,int age_in,double score_in){
		name = name_in;
		age = age_in;
		score = score_in;
	}

	// 吃饭
	public void eat(){
		System.out.println(name+"正在吃饭。。。");
	}
	
	// 学习
	public void study(String content){
		System.out.println(age +"岁的"+ name +"开始上课了，今天学习"+ content);
	}
}
