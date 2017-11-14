package tk.chuanjing.stage2.chapter13.reflect_xml2;
/**
 * @author ChuanJing
 * @date 2017年5月5日 上午10:09:25
 * @version 1.0
 */
public class User {
	private String uid;
	private String userName;
	private String password;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", password="
				+ password + "]";
	}
}
