package tk.chuanjing.stage2.chapter11.test;
/**
 * @author ChuanJing
 * @date 2017年4月25日 下午3:41:30
 * @version 1.0
 */
public class TestThread {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.setName("线程一");
		mt.start();
		
		MyThread mt2 = new MyThread();
		mt2.setName("线程二------");
		mt2.start();
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}