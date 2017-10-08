package tk.chuanjing.stage1.chapter07.homework;
/**
 * @author ChuanJing
 * @date 2017年3月20日 下午3:49:18
 * @version 1.0

	猫类Cat		
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭eat()
			抓老鼠catchMouse()
 */
public class Cat {
	
	private String color;
	private String breed;
	
	public Cat() {
		super();
	}

	public Cat(String color, String breed) {
		super();
		this.color = color;
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void eat() {
		System.out.println(color + "的"+ breed +"正在吃鱼.....");
	}
	
	public void catchMouse() {
		System.out.println(color + "的"+ breed +"正在逮老鼠....");
	}
}