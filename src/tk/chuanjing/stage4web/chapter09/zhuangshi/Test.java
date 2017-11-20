package tk.chuanjing.stage4web.chapter09.zhuangshi;


/*
 *  装饰设计模式
 *    刷墙,铺地板,满足主人爱好,但是墙壁和地面的本质没有变化
 *  
 *  设计手机功能,打电话
 *  class Phone{  public void call(){
 *  }}
 *  设计手机,在打电话同时,彩铃
 *  彩铃: 部分用户愿意,一部分不愿意
 *  原有功能之上,添加一些额外的功能
 *  
 */
public class Test {

	public static void main(String[] args) {
		Phone p1 = new FirstPhone();
		p1.call();
		
		Phone p2 = new SecondPhone();
		
		ColorLingPhone clp = new ColorLingPhone(p2);
		clp.call();
		
		clp = new ColorLingPhone(p1);
		clp.call();
	}
}
