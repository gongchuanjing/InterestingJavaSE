package tk.chuanjing.stage1.exam_08term_remediation02;
/**
 * @author ChuanJing
 * @date 2017年4月1日 下午3:50:13
 * @version 1.0

	属性name,age
 */
public class Student {

	private String name;
	private int age;
	
	public Student(){}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	public void show(){
		System.out.println("我的姓名：" + name + "，我的年龄：" + age);
	}
}
