package tk.chuanjing.stage1.chapter07.homework;
/**
 * @author ChuanJing
 * @date 2017年3月20日 下午2:17:50
 * @version 1.0

第一题：分析以下需求，并用代码实现
	手机类Phone
	属性:
		品牌brand
		价格price
	行为:
		打电话call()
		发短信sendMessage()
		玩游戏playGame()
 */
public class Phone {
	
	private String brand;
	private int price;
	
	public Phone() {}

	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void call() {
		System.out.println("正在使用价格为"+ price +"元的"+ brand +"品牌的手机打电话....");
	}
	
	public void sendMessage() {
		System.out.println("正在使用价格为"+ price +"元的"+ brand +"品牌的手机发短信....");
	}
	
	public void playGame() {
		System.out.println("正在使用价格为"+ price +"元的"+ brand +"品牌的手机玩游戏....");
	}
}
