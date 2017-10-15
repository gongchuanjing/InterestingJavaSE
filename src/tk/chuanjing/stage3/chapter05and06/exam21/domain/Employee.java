package tk.chuanjing.stage3.chapter05and06.exam21.domain;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String sex;
	private int salary;
	private String empdate;
	private int deptid;
	private Dept dept;
	public Employee(int id, String name, int age, String sex, int salary, String empdate, int deptid, Dept dept) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.empdate = empdate;
		this.deptid = deptid;
		this.dept = dept;
	}
	public Employee() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpdate() {
		return empdate;
	}
	public void setEmpdate(String empdate) {
		this.empdate = empdate;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
}
