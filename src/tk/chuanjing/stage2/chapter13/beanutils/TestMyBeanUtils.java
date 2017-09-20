package tk.chuanjing.stage2.chapter13.beanutils;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author ChuanJing
 * @date 2017年5月4日 上午10:13:55
 * @version 1.0
 */
public class TestMyBeanUtils {

	//---------------------- MyBeanUtilsSimple -------------------------
	@Test
	public void demo1() {
		User user = new User();
		
		Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("uid", new String[]{"002"});
		map.put("userName", new String[]{"ben"});
		map.put("password", new String[]{"00000"});
		map.put("hobbies", new String[]{"乒乓球", "书法"});
		map.put("age", new String[]{"22"});
		
		MyBeanUtilsSimple.populate1(user, map);
		
		System.out.println(user);
	}
	
	@Test
	public void demo2() {
		Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("uid", new String[]{"002"});
		map.put("userName", new String[]{"ben"});
		map.put("password", new String[]{"00000"});
		map.put("hobbies", new String[]{"乒乓球", "书法"});
		map.put("age", new String[]{"22"});
		
		User user = (User) MyBeanUtilsSimple.populate2(User.class, map);
		
		System.out.println(user);
	}
	
	@Test
	public void demo3() {
		Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("uid", new String[]{"002"});
		map.put("userName", new String[]{"ben"});
		map.put("password", new String[]{"00000"});
		map.put("hobbies", new String[]{"乒乓球", "书法"});
		map.put("age", new String[]{"22"});
		
		User user = MyBeanUtilsSimple.populate3(User.class, map);
		
		System.out.println(user);
	}
	
	
	//---------------------- MyBeanUtils -------------------------
	@Test
	public void demo4() throws Exception {
		User user = new User();
		MyBeanUtils.setProperty(user, "uid", "001");
		MyBeanUtils.setProperty(user, "userName", "jack");
		MyBeanUtils.setProperty(user, "password", "12345");
		MyBeanUtils.setProperty(user, "hobbies", new String[]{"乒乓球", "书法"});
		MyBeanUtils.setProperty(user, "age", 20);
		
		System.out.println(user);
		
		String property = MyBeanUtils.getProperty(user, "userName");
		System.out.println(property);
	}
	
	@Test
	public void demo5() throws Exception {
		User user = new User();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("uid", "002");
		map.put("userName", "ben");
		map.put("password", "00000");
		map.put("hobbies", new String[]{"乒乓球", "书法"});
		map.put("age", 22);
		
		MyBeanUtils.populate(user, map);
		
		System.out.println(user);
	}
}