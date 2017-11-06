package tk.chuanjing.stage1.exam_08term_remediation01;
/**
 * @author ChuanJing
 * @date 2017年3月31日 下午2:18:05
 * @version 1.0

定义一个手机类,属性有价格price,品牌brind.定义有参无参构造.get,set方法
 */
public class Phone {
	
	//成员变量,属性
	private int price;
	private String brind;
	
	public Phone() {
		
	}
	
	public Phone(int price,String brind) {
		this.price = price;
		this.brind = brind;
	}
	
	//成员方法。方法。
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	public void setBrind(String brind) {
		this.brind = brind;
	}
	
	public String getBrind(){
		return brind;
	}
}
