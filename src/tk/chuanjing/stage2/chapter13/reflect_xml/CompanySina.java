package tk.chuanjing.stage2.chapter13.reflect_xml;

public class CompanySina {
	
	private String name;
	private Leader leader;
	private String money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Leader getLeader() {
		return leader;
	}
	public void setLeader(Leader leader) {
		this.leader = leader;
	}
	@Override
	public String toString() {
		return "Tencent [name=" + name + ", leader=" + leader + ", money=" + money + "]";
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
	

}
