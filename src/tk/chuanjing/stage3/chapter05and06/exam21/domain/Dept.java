package tk.chuanjing.stage3.chapter05and06.exam21.domain;

public class Dept {
	private int id;
	private String deptname;
	private String deptdesc;
	public Dept(int id, String deptname, String deptdesc) {
		super();
		this.id = id;
		this.deptname = deptname;
		this.deptdesc = deptdesc;
	}
	public Dept() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptdesc() {
		return deptdesc;
	}
	public void setDeptdesc(String deptdesc) {
		this.deptdesc = deptdesc;
	}
}
