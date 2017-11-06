package tk.chuanjing.stage1.exam_08term_remediation01;
/**
 * @author ChuanJing
 * @date 2017年3月31日 下午2:04:32
 * @version 1.0

案例4:(面向对象)
	1.定义一个手机类,属性有价格price,品牌brind.定义有参无参构造.get,set方法
	2.在测试类中通过无参,有参构造创建2个对象.分别调用getPrice方法
 */
public class Test04 {

	public static void main(String[] args) {
//		类：类别。
//		类：模版，而对象是根据模版创造出来的具体的东西。
//		Phone p = new Phone();
//		p.setPrice(900);
//		System.out.println(p.getPrice());
//		
//		Phone p1 = new Phone(1999, "小米");
		
		// 2.在测试类中通过无参,有参构造创建2个对象.分别调用getPrice方法
//		类名 对象名 = new 类名();
//		Phone p = new Phone();
//		p.setPrice(1999);
//		p.setBrind("中兴");
//		System.out.println(p.getPrice());
		
		// 创建一个Phone的对象，使用带参数的构造方法，直接传入价钱和品牌
		Phone p2 = new Phone(2999, "华为");
		
		// 输出刚才创建对象的价钱
		System.out.println(p2.getPrice());
		
		// 手机降价了，调用setPrice的方法，重新给他设置价钱
		p2.setPrice(1999);
		
		// 输出降价后的价钱
		System.out.println("降价了：" + p2.getPrice());

	}

}