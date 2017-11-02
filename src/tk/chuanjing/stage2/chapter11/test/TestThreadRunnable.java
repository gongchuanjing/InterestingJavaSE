package tk.chuanjing.stage2.chapter11.test;
/**
 * @author ChuanJing
 * @date 2017年4月25日 下午3:42:21
 * @version 1.0
 */
public class TestThreadRunnable {

	public static void main(String[] args) {
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 100; i++) {
//					System.out.println(i);
//				}
//			}
//		}).start();
		
		MyRunnable myRunnable = new MyRunnable();
		new Thread(myRunnable).start();
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}