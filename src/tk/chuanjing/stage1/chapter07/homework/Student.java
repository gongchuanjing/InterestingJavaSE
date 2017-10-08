package tk.chuanjing.stage1.chapter07.homework;
/**
 * @author ChuanJing
 * @date 2017年3月20日 下午3:38:36
 * @version 1.0

	学生类Student
		属性:
			姓名name
			年龄age
			学习内容content
		行为:
			吃饭eat()
			学习study()
 */
public class Student {

	private String name;
	private int age;
	private String content;
	
	public Student() {
		super();
	}

	public Student(String name, int age, String content) {
		super();
		this.name = name;
		this.age = age;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void eat() {
		System.out.println("年龄为"+ age +"的"+ name +"同学正在吃饭....");
	}
	
	public void study() {
		System.out.println("年龄为"+ age +"的"+ name +"同学正在专心致志的听着"+ content +"的知识........");
	}
}
