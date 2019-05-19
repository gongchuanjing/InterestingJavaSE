package tk.chuanjing.stage4web;
/**
 * @author ChuanJing
 * @date 2017年9月8日 下午9:42:23
 * @version 1.0

问题分析：
	错误代码中，子类直接去调用父类的构造方法了，没有这种写法。
 */
public class Test01 {

	public static void main(String[] args) {
		T1 t1 = new T1("张三0", 99);
	}

}

class T2 {
	public T2() {
		
	}
	
	public T2(String s, int a) {
		
	}
}

class T1 extends T2 {
	public T1(String s, int a){
		super();
	}
}