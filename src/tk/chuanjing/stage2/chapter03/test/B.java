package tk.chuanjing.stage2.chapter03.test;

public class B extends A {

    public String show(B obj){
        return ("B and B");
    }

    @Override
    public String show(A obj){
        return ("B and A");
    }
}
