package tk.chuanjing.stage4web.chapter09.datasource_c3p0;

public class EnhanceDemo1 {
	
	public static void main(String[] args) {
		/*Man man = new SuperMan();
		man.run();*/
		
		Waiter waiter = new Waiteress();
		Waiter waiterWrapper = new WaiteressWrapper(waiter);
		waiterWrapper.server();
	}
}

/**
 * 继承的方式增强一个类中某个方法:
 */
class Man{
	public void run(){
		System.out.println("跑....");
	}
}

class SuperMan extends Man{
	public void run(){
		// super.run();
		System.out.println("飞....");
	}
}

/**
 * 使用装饰者的方式完成类的方法的增强
 */
interface Waiter{
	public void server();
}

class Waiteress implements Waiter{

	@Override
	public void server() {
		System.out.println("服务...");
	}
	
}

class WaiteressWrapper implements Waiter{
    private Waiter waiter;

	public WaiteressWrapper(Waiter waiter) {
    	this.waiter = waiter;
	}
	
	@Override
	public void server() {
		System.out.println("微笑...");
		// this.waiter.server();
		
	}
	
}
