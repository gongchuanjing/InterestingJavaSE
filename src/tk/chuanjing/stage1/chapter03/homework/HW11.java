package tk.chuanjing.stage1.chapter03.homework;
/**
 * @author ChuanJing
 * @date 2017年8月7日 下午6:16:13
 * @version 1.0

问题:
		1.想在控制台输出2次:"Java基础班"   括号()里面应该填写什么?	
		2.想在控制台输出7次:"Java基础班"   括号()里面应该填写什么?	
		3.想在控制台输出13次:"Java基础班"   括号()里面应该填写什么?
 */
public class HW11 {
	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//()在此处填写代码
				System.out.println("Java基础班");
			}
			System.out.println("Java基础班");
		}
	}
}
