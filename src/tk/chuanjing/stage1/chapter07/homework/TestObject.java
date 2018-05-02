package tk.chuanjing.stage1.chapter07.homework;
/**
 * @author ChuanJing
 * @date 2018年7月28日 下午6:05:28
 * @version 1.0
 */
public class TestObject {

	public static void main(String[] args) {
		/*
		Dog d = new Dog("金色", "金毛");
		method(d);
		System.out.println(d);//Dog [color=金色, breed=秋田犬]
		*/
		Dog d = new Dog("白色", "拉布拉多");
		Dog d2 = d;
		d2.setBreed("秋田犬");
		System.out.println(d);//Dog [color=白色, breed=秋田犬]
	}

	private static void method(Dog d) {
		System.out.println(d);//Dog [color=金色, breed=金毛]
		d.setBreed("秋田犬");
	}

}
