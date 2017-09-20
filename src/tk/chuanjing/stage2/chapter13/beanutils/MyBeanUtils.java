package tk.chuanjing.stage2.chapter13.beanutils;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

/**
 * @author ChuanJing
 * @date 2017年9月20日 下午4:29:19
 * @version 1.0
 */
public class MyBeanUtils {
	
	private MyBeanUtils() {}
	
	public static void setProperty(Object bean,String name,Object value) throws ReflectiveOperationException {
		//根据JavaBean对象获取对应的字节码对象
		Class clazz = bean.getClass();
		
		//根据字节码对象获取对应的Field对象
		Field f = clazz.getDeclaredField(name);
		
		//设置权限，让虚拟机不进行访问的检查
		f.setAccessible(true);
		
		//赋值
		f.set(bean, value);
	}
	
	public static String getProperty(Object bean,String name) throws ReflectiveOperationException {
		Class clazz = bean.getClass();
		Field f = clazz.getDeclaredField(name);
		f.setAccessible(true);
		Object obj = f.get(bean);
		return obj.toString();
	}
	
	public static void populate(Object bean, Map map) throws ReflectiveOperationException {
		//通过JavaBean对象来获取对应的字节码对象
		Class clazz = bean.getClass();
		
		//获取Map中所有的key
		Set keys = map.keySet();
		
		for (Object key : keys) {
			try {
				//根据key来获取对应的Field对象
				Field f = clazz.getDeclaredField(key.toString());
				
				//根据key来获取Map中对应的value
				Object value = map.get(key);
				
				f.setAccessible(true);
				f.set(bean, value);
			} catch(NoSuchFieldException e) {
				e.printStackTrace();
			}
		}
	}
}