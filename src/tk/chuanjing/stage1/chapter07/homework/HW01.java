package tk.chuanjing.stage1.chapter07.homework;
/**
 * @author ChuanJing
 * @date 2017年3月20日 下午2:19:29
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
		
	要求:
		1.按照以上要求定义类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用三个成员方法,打印格式如下:
			正在使用价格为998元的小米品牌的手机打电话....
			正在使用价格为998元的小米品牌的手机发短信....
			正在使用价格为998元的小米品牌的手机玩游戏....
 */
public class HW01 {
	
	public static void main(String[] args) {
		// 给属性赋值 setter方法
		Phone p = new Phone();
		p.setBrand("小米");
		p.setPrice(1999);
		
		p.call();
		p.sendMessage();
		p.playGame();
		
		System.out.println("------------------------华丽分隔线---------------------------");
		
		// 给属性赋值 构造方法
		Phone p2 = new Phone("中兴", 2599);
		p2.call();
		p2.sendMessage();
		p2.playGame();
	}
}
