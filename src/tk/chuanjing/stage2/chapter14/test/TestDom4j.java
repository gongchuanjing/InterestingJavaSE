package tk.chuanjing.stage2.chapter14.test;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author ChuanJing
 * @date 2017年5月5日 上午12:46:26
 * @version 1.0
 */
public class TestDom4j {

	public static void main(String[] args) throws DocumentException {
		//1 核心类
		SAXReader saxReader = new SAXReader();
		
		//2 获得Document（整个xml）
		Document document = saxReader.read("src/tk/chuanjing/stage2/chapter14/test/beans.xml");
		
		//3 获得根元素 beans
		Element rootElement = document.getRootElement();
		
		//4 所有子元素 bean
		List<Element> allBeanElement = rootElement.elements("bean");
		for (Element beanEle : allBeanElement) {
			//4.1 bean属性
			String id = beanEle.attributeValue("id");
			String className = beanEle.attributeValue("className");
			System.out.println("bean的属性 : " + id + ", " + className);
			
			//5 元素property
			List<Element> allPropElement = beanEle.elements("property");
			for (Element propEle : allPropElement) {
				String name = propEle.attributeValue("name");
				String value = propEle.attributeValue("value");
				System.out.println("property的属性 : " + name + ", " + value);
			}
			
			System.out.println("----------------------");
		}
	}

}
