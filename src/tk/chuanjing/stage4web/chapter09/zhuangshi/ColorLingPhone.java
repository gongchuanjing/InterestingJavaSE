package tk.chuanjing.stage4web.chapter09.zhuangshi;

/*
 *  对于手机加入彩铃功能的装饰类
 */
public class ColorLingPhone {
	private Phone phone;
	
	public ColorLingPhone(Phone phone){
		this.phone = phone;
	}
	
	public void call(){
		System.out.println("听彩铃");
		phone.call();
	}

}
