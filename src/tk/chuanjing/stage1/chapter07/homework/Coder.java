package tk.chuanjing.stage1.chapter07.homework;
/**
 * @author ChuanJing
 * @date 2017年3月20日 下午2:34:02
 * @version 1.0

	属性：
		姓名name
		工号id
		工资salary
	行为：
		工作work()
 */
public class Coder {
	
	private String name;
	private String id;
	private float salary;
	
	public Coder() {
		super();
	}

	public Coder(String name, String id, float salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void work() {
		System.out.println("工号为"+ id +"基本工资为"+ salary +"的程序员"+ name +"正在努力的写着代码......");
	}
}
