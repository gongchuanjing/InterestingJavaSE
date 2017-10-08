package tk.chuanjing.stage1.chapter07.homework;
/**
 * @author ChuanJing
 * @date 2017年3月20日 下午2:11:57
 * @version 1.0

项目经理类Manager 
		属性：
			姓名name
			工号id
			工资salary
			奖金bonus
		行为：
			工作work()
 */
public class Manager {

	private String name;
	private String id;
	private float salary;
	private float bonus;
	
	public Manager() {
		super();
	}

	public Manager(String name, String id, float salary, float bonus) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
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

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("工号为"+ id +"基本工资为"+ salary +"奖金为"+ bonus +"的项目经理"+ name +"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
	}
}