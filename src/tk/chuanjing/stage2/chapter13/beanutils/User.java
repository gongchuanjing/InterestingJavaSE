package tk.chuanjing.stage2.chapter13.beanutils;

import java.util.Arrays;

/**
 * @author ChuanJing
 * @date 2017年5月4日 上午10:14:20
 * @version 1.0
 */
public class User {

	private String uid;
	private String userName;
	private String password;
	private String[] hobbies;//hobby
	private int age;
	
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
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", password="
				+ password + ", hobbies=" + Arrays.toString(hobbies) + ", age="
				+ age + "]";
	}
}