package tk.chuanjing.stage2.chapter10.test;

import java.io.Serializable;

/**
 * @author ChuanJing
 * @date 2017年4月24日 下午10:45:08
 * @version 1.0
 */
public class StudentForObjectIO implements Serializable{
	
	private static final long serialVersionUID = 4123192940514552471L;
	
	String name;
	int age;
	
	public StudentForObjectIO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "StudentForObjectIO [name=" + name + ", age=" + age + "]";
	}
}
