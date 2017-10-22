package tk.chuanjing.stage2.chapter07.test;

import java.util.HashSet;

/**
 * @author ChuanJing
 * @date 2017年4月9日 下午5:58:23
 * @version 1.0
 */
public class TestHashSet {

	public static void main(String[] args) {
		//创建集合对象
		HashSet<Student> hs = new HashSet<Student>();
		
		//创建元素对象,添加元素对象
		hs.add(new Student("zhangsan", 18));
		hs.add(new Student("lisi",19));
		hs.add(new Student("lisi",19));
		
		//遍历集合对象
		for (Student student : hs) {
			System.out.println(student);
		}

	}
}

class Student {
	String name;
	int age;
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Object obj) {
//		//System.out.println("-------------------");
//		Student s = (Student)obj;//向下转型，可以获取子类特有成员
//		
//		//比较年龄是否相等，如果不等则返回false
//		if(this.age != s.age) {
//			return false;
//		}
//		
//		//比较姓名是否相等，如果不等则返回false
//		if(!this.name.equals(s.name)) {
//			return false;
//		}
//		
//		//默认返回true，说明两个学生是相等的
//		return true;
//	}
	
//	@Override
//	public int hashCode() {
//		return 1;
//	}
}