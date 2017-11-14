package tk.chuanjing.stage2.chapter13.reflect_xml2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author ChuanJing
 * @date 2017年5月5日 上午10:15:48
 * @version 1.0
 */
public class BeanFactory {

	private static Map<String, BeanConfig> cacheMap = new HashMap<String, BeanConfig>();
	
	static {
		SAXReader saxReader = new SAXReader();
		try {
			//1) 加载xml文件，获得document
			Document document = saxReader.read("src//tk//chuanjing//stage2//chapter13//reflect_xml2//beans.xml");

			//2) 获得根元素<beans>
			Element rootElement = document.getRootElement();
			
			//3) 获得所有<bean>元素
			List<Element> allBeanElements = rootElement.elements("bean");
			
			for (Element beanElement : allBeanElements) {
				//4) 获得id和className属性
				String id = beanElement.attributeValue("id");
				String className = beanElement.attributeValue("className");
				
				/**#1 创建BeanConfig, 并封装id和className*/
				BeanConfig beanConfig = new BeanConfig();
				beanConfig.setId(id);
				beanConfig.setClassName(className);
				
				//5) 获得<property>子标签
				List<Element> allProElements = beanElement.elements("property");
				for (Element proElement : allProElements) {
					//6) 获得name和value属性
					String name = proElement.attributeValue("name");
					String value = proElement.attributeValue("value");
					
					/**#2 将 name和value 封装到 BeanConfig.props中*/
					beanConfig.getPro().setProperty(name, value);
				}
				
				/**#3 将封装好的BeanConfig，添加到Map中*/
				cacheMap.put(id, beanConfig);
			}
//			System.out.println(cacheMap);
		} catch (DocumentException e) {
			e.printStackTrace();
			//将编译时转换成运行时异常
//			throw new RuntimeException(e);
		}
	}

	public static Object getBean(String beanId) {
		BeanConfig beanConfig = cacheMap.get(beanId);
		if (beanConfig == null) {
			throw new RuntimeException("要创建的"+ beanId +"对象不存在！");
		}
		
		try {
			Class<?> clazz = Class.forName(beanConfig.getClassName());
			Object bean = clazz.newInstance();
			
			Properties properties = beanConfig.getPro();
			Set<String> names = properties.stringPropertyNames();
			for (String name : names) {
				BeanUtils.setProperty(bean, name, properties.getProperty(name));
			}
			
			return bean;
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
