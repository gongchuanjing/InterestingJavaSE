package tk.chuanjing.stage2.chapter02.test;

/**
 * @author ChuanJing
 * @date 2017年4月7日 上午10:36:28 
 * @version 1.0
 * 
 * 	运行结果：
 * 		我是抽象类的【有参有参有参】构造方法
 * 		金毛
 * 		10
 */
public class AbstractDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.barking();
	}

}

abstract class Animal {
	String name = "哮天犬";
	final int num = 10;

	public Animal() {
		System.out.println("我是抽象类的构造方法");
	}
	
	public Animal(String name) {
		System.out.println("我是抽象类的【有参有参有参】构造方法");
		this.name = name;
	}

	public abstract void eat();

	public void run() {
		
	}
}

class Dog extends Animal {
	
	public Dog(){
		super("金毛");
	}
	
	public void barking() {
		System.out.println(name);
		System.out.println(num);
	}

	@Override
	public void eat() {

	}
}