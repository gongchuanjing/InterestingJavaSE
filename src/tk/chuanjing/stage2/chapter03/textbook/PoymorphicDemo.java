package tk.chuanjing.stage2.chapter03.textbook;
/**
 * @author ChuanJing
 * @date 2017年4月7日 下午2:54:42
 * @version 1.0

 * 多态的前提：
 * 	子父类的继承关系
 * 	方法的重写
 * 	父类引用指向子类对象
 * 
 * 动态绑定：运行期间调用的方法，是根据其具体的类型
 */
public class PoymorphicDemo {

	public static void main(String[] args) {
		/*
		Cat c = new Cat();
		c.eat();
		*/
		
		//父类引用 Animal a
		//指向	 =
		//子类对象 new Cat()
		
		Animal a = new Cat();
		a.eat();
//		a.pa();
	}

}

class Animal {
	public void eat() {
		System.out.println("吃东西");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void pa() {
		System.out.println("猫会爬树");
	}
}