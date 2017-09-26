package tk.chuanjing.stage3.chapter03.dbutils;
/**
 * @author ChuanJing
 * @date 2017年5月13日 上午12:47:00
 * @version 1.0
 */
public class Sort {

	private int sid;
	private String sname;
	private double sprice;
	private String sdesc;
	
	public Sort() {
	}

	public Sort(int sid, String sname, double sprice, String sdesc) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sprice = sprice;
		this.sdesc = sdesc;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSprice() {
		return sprice;
	}

	public void setSprice(double sprice) {
		this.sprice = sprice;
	}

	public String getSdesc() {
		return sdesc;
	}

	public void setSdesc(String sdesc) {
		this.sdesc = sdesc;
	}

	@Override
	public String toString() {
		return "Sort [sid=" + sid + ", sname=" + sname + ", sprice=" + sprice
				+ ", sdesc=" + sdesc + "]";
	}
}