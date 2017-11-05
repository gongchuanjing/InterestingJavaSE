package tk.chuanjing.stage2.chapter13.reflect_test;
/**
 * @author ChuanJing
 * @date 2017年5月3日 下午11:20:27
 * @version 1.0
 */
public class Book {

	private String bid;
	private String title;
	private String price;
	
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", price=" + price
				+ "]";
	}
}