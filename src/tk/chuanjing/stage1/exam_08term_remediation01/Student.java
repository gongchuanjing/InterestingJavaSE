package tk.chuanjing.stage1.exam_08term_remediation01;
/**
 * @author ChuanJing
 * @date 2017年3月31日 下午3:58:18
 * @version 1.0

创建学生类(属性:姓名,年龄,学号)
 */
public class Student {

	private String name;
	private int age;
	private String id;
	
	public Student() {
		
	}
	
	public Student (String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show(){
		System.out.println("姓名:" + name + "，年龄：" + age + "，学号：" + id);
	}
}
