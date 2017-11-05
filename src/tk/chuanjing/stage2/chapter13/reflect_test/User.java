package tk.chuanjing.stage2.chapter13.reflect_test;
/**
 * @author ChuanJing
 * @date 2017年5月3日 下午11:20:27
 * @version 1.0
 */
public class User {

	private String uid;
	private String userName;
	private String prssword;
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPrssword() {
		return prssword;
	}

	public void setPrssword(String prssword) {
		this.prssword = prssword;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", prssword="
				+ prssword + "]";
	}
}