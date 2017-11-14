package tk.chuanjing.stage2.chapter13.reflect_xml;

import java.io.Serializable;

public class Leader implements Serializable{
	
	private static final long serialVersionUID = -1689064463219479669L;
	
	private String name;
	private int age;
	
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
	@Override
	public String toString() {
		return "Leader [name=" + name + ", age=" + age + "]";
	}
}