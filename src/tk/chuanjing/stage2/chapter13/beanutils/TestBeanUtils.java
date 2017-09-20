package tk.chuanjing.stage2.chapter13.beanutils;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

/**
 * @author ChuanJing
 * @date 2017年5月4日 上午10:13:55
 * @version 1.0
 */
public class TestBeanUtils {
	
	@Test
	public void demo1() throws Exception {
		User user = new User();
		BeanUtils.setProperty(user, "uid", "001");
		BeanUtils.setProperty(user, "userName", "jack");
		BeanUtils.setProperty(user, "password", "12345");
		BeanUtils.setProperty(user, "hobbies", new String[]{"乒乓球", "书法"});
		BeanUtils.setProperty(user, "age", 20);
		
		System.out.println(user);
		
		String property = BeanUtils.getProperty(user, "userName");
		System.out.println(property);
	}
	
	@Test
	public void demo2() throws Exception {
		User user = new User();
		
		Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("uid", new String[]{"002"});
		map.put("userName", new String[]{"ben"});
		map.put("password", new String[]{"00000"});
		map.put("hobbies", new String[]{"乒乓球", "书法"});
		map.put("age", new String[]{"22"});
		
		BeanUtils.populate(user, map);
		
		System.out.println(user);
	}
}
