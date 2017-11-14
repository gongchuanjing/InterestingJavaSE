package tk.chuanjing.stage2.chapter13.reflect_xml;

import java.util.HashMap;
import java.util.Map;

public class BeanConfig {

	private String id;
	private String className;
	private Map<String, Object> map = new HashMap<>();

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

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "BeanConfig [id=" + id + ", name=" + className + ", map=" + map + "]";
	}

}
