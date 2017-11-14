package tk.chuanjing.stage2.chapter13.reflect_xml2;
/**
 * @author ChuanJing
 * @date 2017年5月5日 上午10:10:21
 * @version 1.0
 */
public class Book {

	private String bid;
	private String title;
	private int price;
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", price=" + price
				+ "]";
	}
}
