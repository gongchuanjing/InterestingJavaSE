package tk.chuanjing.stage3.chapter05and06.exam22.domain;

public class Account {
	private int id;
	private String username;
	private String cardid;
	private double balance;
	private double moneyrete;
	public Account(int id, String username, String cardid, double balance, double moneyrete) {
		super();
		this.id = id;
		this.username = username;
		this.cardid = cardid;
		this.balance = balance;
		this.moneyrete = moneyrete;
	}
	public Account() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getMoneyrete() {
		return moneyrete;
	}
	public void setMoneyrete(double moneyrete) {
		this.moneyrete = moneyrete;
	}
	
	
}
