package tk.chuanjing.stage2.chapter01.homework;
/**
 * @author ChuanJing
 * @date 2018年4月11日 下午4:15:16
 * @version 1.0

第七题：
	定义中国人类, 中国人都有国籍,并且值是中国, 有年龄,姓名,性别;
 */
public class HW07ChinaPerson {
	private static String nationality = "中国";// 国籍
	private int age;
	private String name;
	private String gender;

	public HW07ChinaPerson() {
		super();
	}

	public HW07ChinaPerson(String nationality, int age, String name, String gender) {
		super();
		this.nationality = nationality;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
