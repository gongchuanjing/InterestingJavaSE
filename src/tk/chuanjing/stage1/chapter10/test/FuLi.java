package tk.chuanjing.stage1.chapter10.test;
/**
 * @author ChuanJing
 * @date 2018年3月30日 下午1:51:41
 * @version 1.0
 */
public class FuLi {

	public static void main(String[] args) {
		double benJin = 10000;	// 本金
		double liLv = 0.04;		// 利率
		double shouYi = 0;		// 收益
		
		for (int i = 0; i < 10; i++) {
			shouYi = benJin * liLv + benJin;
			benJin = shouYi;
		}
		
		System.out.println("10年本金收益一共：" + shouYi);
	}

}
