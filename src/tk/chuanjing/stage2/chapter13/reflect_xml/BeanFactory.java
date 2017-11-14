package tk.chuanjing.stage2.chapter13.reflect_xml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;

public class BeanFactory {
	// 为了存储所有的数据,只不过通过键值对储存, 因为你的要求是通过一个唯一的标识,去创建指定的对象
	private static Map<String, BeanConfig> map = new HashMap<>();

	static {
		// 解析xml , 而且只需要解析一次,静态代码块就有只会执行一次的特点;
		try {
			// 将xml装成Docment的对象
			Document document = Dom4JUtils.getDocument("src//tk//chuanjing//stage2//chapter13//reflect_xml//companies.xml");
			// 拿到根元素
			Element rootElement = document.getRootElement();
			// 获取所有公司
			List<Element> companyElements = rootElement.elements("bean");

			for (Element companyElement : companyElements) {// 拿到每一个公司

				BeanConfig beanConfig = new BeanConfig();// 每一个公司都有对应的beanconfig来存储其数据

				String id = companyElement.attributeValue("id");// 获取beanconfig的id，其实也就是唯一的标识
				String className = companyElement.attributeValue("className");// 获取对应类的全路径
				// 给beanconfig对象设置值
				beanConfig.setId(id);
				beanConfig.setClassName(className);
				// 拿到所有的属性
				List<Element> propertyElements = companyElement.elements("property");
				for (Element propertyElement : propertyElements) {
					String name = propertyElement.attributeValue("name");
					String value = propertyElement.attributeValue("value");
					// 给beanConfig 中map添加数据 ,这个map 用来存储 想要对象的数据
					beanConfig.getMap().put(name, value);

				}
				// 给beanConfig里面的map一个特殊元素进行 ,这个特殊元素是leader对象
				Element leaderElement = companyElement.element("Leader");
				Leader leader = new Leader();

				List<Element> leaderpropertyElements = leaderElement.elements("property");

				for (Element leaderpropertyElement : leaderpropertyElements) {
					String name = leaderpropertyElement.attributeValue("name");
					String value = leaderpropertyElement.attributeValue("value");

					BeanUtils.setProperty(leader, name, value);
				}
				// 将leader塞入 beanconfig中的map中去
				beanConfig.getMap().put("leader", leader);
				// 将唯一的标识和对应的beanconfig对象添加map中去
				map.put(id, beanConfig);

			}
			// 走到这里数据解析完成
			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 通过指定的id获取指定的对象 前提必须有数据,我们在此之前要解析xml
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public static Object getBean(String id) throws Exception {

		BeanConfig beanConfig = map.get(id);

		if (beanConfig == null) {
			return null;
		}
		String className = beanConfig.getClassName();

		// 通过反射获取想要的类
		Class<?> class1 = Class.forName(className);
		Object object = class1.newInstance();

		BeanUtils.populate(object, beanConfig.getMap());

		return object;
	}

}
