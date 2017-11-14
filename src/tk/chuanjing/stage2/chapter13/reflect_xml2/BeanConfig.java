package tk.chuanjing.stage2.chapter13.reflect_xml2;

import java.util.Properties;

/**
 * @author ChuanJing
 * @date 2017年5月5日 上午10:11:20
 * @version 1.0
 */
public class BeanConfig {

	private String id;
	private String className;
	private Properties pro = new Properties();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	
	@Override
	public String toString() {
		return "BeanConfig [id=" + id + ", className=" + className + ", pro="
				+ pro + "]";
	}
}
