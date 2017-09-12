package tk.chuanjing.stage2.chapter08.errordemo;
/**
 * @author ChuanJing
 * @date 2017年9月12日 下午9:46:50
 * @version 1.0

	有个已知的数列2/1 3/2 5/3 8/5  ... 利用递归的知识求出前20项的和
 */
public class Test3 {
	public static void main(String[] args) {
		double sum = sum(20);
		System.out.println(sum);
	}
	
	private static double sum=0,c=2,b=1,temp;
	private static double sum(int i) {
		if(i==1){
			return sum=2;
		}else{
		   temp=c;//2    
		   c=c+b;//3
	       b=temp;//2				
	       sum=(double)(c/b);
		   return sum=sum+sum(i-1);
		}
	}
}
