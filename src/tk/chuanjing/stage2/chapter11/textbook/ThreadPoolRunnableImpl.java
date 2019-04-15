package tk.chuanjing.stage2.chapter11.textbook;
/*
    2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
 */
public class ThreadPoolRunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行");
    }
}
