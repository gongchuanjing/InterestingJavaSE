package tk.chuanjing.stage2.chapter13.beanutils;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @author ChuanJing
 * @date 2017年5月4日 上午10:40:56
 * @version 1.0

	这个内部其实还是调用了 BeanUtils 的 populate 方法
 */
public class MyBeanUtilsSimple {

	public static void populate1(Object bean, Map<String, String[]> properties) {
		try {
			BeanUtils.populate(bean, properties);
		} catch (Exception e) {
			//将编译时异常，转换成运行时，方便调用者(使用者不需要再次处理异常)
			throw new RuntimeException(e);
		}
	}

	public static Object populate2(Class beanClass, Map<String, String[]> properties) {
		try {
			Object bean = beanClass.newInstance();
			BeanUtils.populate(bean, properties);
			return bean;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static <T> T populate3(Class<T> beanClass, Map<String, String[]> properties) {
		try {
			T bean = beanClass.newInstance();
			BeanUtils.populate(bean, properties);
			return bean;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}