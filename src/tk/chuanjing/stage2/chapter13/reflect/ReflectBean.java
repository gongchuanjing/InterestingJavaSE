package tk.chuanjing.stage2.chapter13.reflect;

import java.util.Arrays;

/**
 * @author ChuanJing
 * @date 2017年5月2日 下午10:05:22
 * @version 1.0
 */
public class ReflectBean {
	
	private String id;
	private String className;
	public String desc;
	
	public ReflectBean() {
		System.out.println("无参构造被调用");
	}

	public ReflectBean(String id) {
		super();
		this.id = id;
		System.out.println("一个参数的构造被调用");
	}
	
	private ReflectBean(String id, String className) {
		super();
		this.id = id;
		this.className = className;
		System.out.println("满参的构造被调用");
	}

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

	@Override
	public String toString() {
		return "ReflectBean [id=" + id + ", className=" + className + ", desc="
				+ desc + "]";
	}

	private void show(int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
	}
}
