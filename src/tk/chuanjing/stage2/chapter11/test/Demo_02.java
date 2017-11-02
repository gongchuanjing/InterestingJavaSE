package tk.chuanjing.stage2.chapter11.test;

/**
 * 多线程买票，并统计每个线程买票的数量
 * @author ChuanJing
 *
 */
public class Demo_02 {
	public static void main(String[] args) {
		ticks tt = new ticks();

		Thread t = new Thread(tt);
		t.setName("1");

		Thread t1 = new Thread(tt);
		t1.setName("2");

		Thread t2 = new Thread(tt);
		t2.setName("3");

		t.start();
		t1.start();
		t2.start();
	}

}

class ticks implements Runnable {
	int ticks = 100;
//	static int ticks = 100;
	int a = 0;
	int b = 0;
	int c = 0;
	boolean flag = true;
	public void run() {
		while (true) {
			synchronized (ticks.class) {
				if (ticks > 0) {
					System.out.println(Thread.currentThread().getName()
							+ ":正在处理第" + ticks-- + "张票");

					if (Thread.currentThread().getName().equals("1")) {
						a++;
					}
					if (Thread.currentThread().getName().equals("2")) {
						b++;
					}
					if (Thread.currentThread().getName().equals("3")) {
						c++;
					}
				} else {
					if (flag) {
						synchronized (ticks.class) {
							System.out.println(a);
							System.out.println(b);
							System.out.println(c);
							flag = false;
						}
					}
					break;
				}
			}
		}
	}
}