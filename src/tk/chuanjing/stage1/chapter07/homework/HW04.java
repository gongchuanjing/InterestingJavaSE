package tk.chuanjing.stage1.chapter07.homework;
/**
 * @author ChuanJing
 * @date 2017年3月20日 下午3:56:59
 * @version 1.0

第四题：分析以下需求，并用代码实现
	1.猫类Cat		
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭eat()
			抓老鼠catchMouse()
		
	2.狗类Dog
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭()
			看家lookHome()
	要求:
		1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用成员方法,打印格式如下:
			花色的波斯猫正在吃鱼.....
			花色的波斯猫正在逮老鼠....
			黑色的藏獒正在啃骨头.....
			黑色的藏獒正在看家.....	
 */
public class HW04 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setColor("花色");
		cat.setBreed("波斯猫");
		cat.eat();
		cat.catchMouse();
		
		System.out.println("\r\n------------------------------华丽分隔线---------------\r\n");
		
		Dog dog = new Dog("黑色", "藏獒");
		dog.eat();
		dog.lookHome();
	}

}
