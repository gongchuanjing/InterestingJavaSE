package tk.chuanjing.stage2.chapter07.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ChuanJing
 * @date 2017年4月19日 下午4:18:57
 * @version 1.0
 * 
 *       总思路：hashCode不同时，则必为不同对象。hashCode相同时，根据equlas()方法判断是否为同一对象。
 *       在HashSet，HashMap，HashTable中都存在该问题。
 * 
 *       1、为什么哈希码相同了还有可能是不同对象？
 *       2、为什么经过比较哈希码还需要借助equals方法判断？
 */
public class TestHashCode {

	public static void main(String[] args) {
		Person p1 = new Person("a", 1);
		Person p2 = new Person("b", 0);
		Set<Person> set = new HashSet<Person>();
		set.add(p1);
		set.add(p2);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}
}

class Person {
	private String name;
	private int id;

	Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

	public int hashCode() {
		return name.hashCode() + id; // 使用字符串哈希值与Integer的哈希值的组合
										// 这样会产生重码，实际上重码率很高
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return (name.equals(p.name) && id == p.id);
		}
		return super.equals(obj);
	}
	
	
}