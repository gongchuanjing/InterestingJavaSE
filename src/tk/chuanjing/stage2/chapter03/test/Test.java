package tk.chuanjing.stage2.chapter03.test;

/**
 * 方法调用优先级由高到低依次为：
 * 		this.成法 > super.成法 > this.成法((super) 参数) > super.成法
 * 
 * @author ChuanJing
 */
public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();//多态
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("一:  "+a1.show(b));//A and A
        System.out.println("二:  "+a1.show(c));//A and A
        System.out.println("三:  "+a1.show(d));//A and D  ?  A and A

        System.out.println("四:  "+a2.show(b));//B and A  ?  B and B
        System.out.println("五:  "+a2.show(c));//B and A  ?  B and B
        System.out.println("六:  "+a2.show(d));//A and D  ?  B and A  ?  B and B

        System.out.println("七:  "+b.show(b));//B and B
        System.out.println("八:  "+b.show(c));//B and B  ?  B and A
        System.out.println("九:  "+b.show(d));//A and D  ?  B and B  ?  B and A
        System.out.println(c.show(a1));		  //B and A
    }
}
