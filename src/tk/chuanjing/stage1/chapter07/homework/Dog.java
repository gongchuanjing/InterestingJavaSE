package tk.chuanjing.stage1.chapter07.homework;
/**
 * @author ChuanJing
 * @date 2017年3月20日 下午3:53:02
 * @version 1.0

	狗类Dog
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭()
			看家lookHome()
 */
public class Dog {

	private String color;
	private String breed;
	
	public Dog() {
		super();
	}

	public Dog(String color, String breed) {
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
		System.out.println(color + "的"+ breed +"正在啃骨头.....");
	}
	
	public void lookHome() {
		System.out.println(color + "的"+ breed +"正在看家....");
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + "]";
	}
}
