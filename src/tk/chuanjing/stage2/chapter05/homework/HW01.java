package tk.chuanjing.stage2.chapter05.homework;
/**
 * @author ChuanJing
 * @date 2018年4月17日 下午7:18:31
 * @version 1.0

自己动手定义一个Star(明星),明星有名字属性,自己手动重写Star的toString 和equals方法
在测试类中创建两个Star类的对象.判断一下两个对象是否相等.
 */
public class HW01 {
	public static void main(String[] args) {
		Star star = new Star("苍老师");
		Star s = new Star("王老师");
		System.out.println(s.equals(star));
	}
}

class Star {
	String name;

	public Star(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "name=" + name;
	}

	@Override
	public boolean equals(Object obj) {
		Star s = (Star) obj;
		return this.name.equals(s.name);
	}
}
