package tk.chuanjing.stage2.chapter14.textbook;

import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/*
 * Dom4J的常用方法：
 * 		Document
 * 			 Element getRootElement() :获取根元素对象（根标签）
 * 		Element
 * 			 List elements() ：获取所有的子元素
 * 			 List elements(String name)：根据指定的元素名称来获取相应的所有的子元素
 * 			 Element element(String name)：根据指定的元素名称来获取子元素对象,如果元素名称重复，则获取第一个元素 
 * 			 String	elementText(String name) ：根据指定的子元素名称，来获取子元素中的文本
 * 			 String	getText() ：获取当前元素对象的文本
 * 			 void setText(String text)：设置当前元素对象的文本
 * 			 String	attributeValue(String name)：根据指定的属性名称获取其对应的值
 * 			 public Element addAttribute(String name,String value)：根据指定的属性名称和值进行添加或者修改
 * 			 addElement
 * 		DocumentHelper
 * 			static Element	createElement(String name) 
 * 			  
 */
public class Dom4JDemo {
	public static void main(String[] args) throws Exception  {
//		method7();
		exam16();
	}
	
	private static void exam16() throws Exception {
		Document document = Dom4JUtils.getDocument();
		//获取根元素
		Element rootElement = document.getRootElement();
		
		List<Element> elements = rootElement.elements();
		
		Element element = elements.get(0);
		
//		String text = element.elementText("Name");
		String text = element.element("Name").getText();
		System.out.println(text);
	}

	/** 8、添加属性：State： GDP="99999亿" */
	private static void method8() throws Exception, IOException {
		Document document = Dom4JUtils.getDocument();
		//获取根元素
		Element rootElement = document.getRootElement();
		//添加新的属性和对应的值
		rootElement.addAttribute("GDP", "99999亿");
		
		//写回文件
		Dom4JUtils.write2XML(document);
	}

	//7、操作XML文件属性:打印State的Name
	private static void method7() throws Exception {
		Document document = Dom4JUtils.getDocument();
		//获取根元素
		Element rootElement = document.getRootElement();
		//根据属性名称获取值
		String value = rootElement.attributeValue("Name");
		System.out.println(value);
	}

	private static void method6() throws Exception, IOException {
		//5、向指定元素节点上增加同级元素节点:在洛阳前面，添加一个<City>三门峡</City>
		//创建一个新的元素对象
		Element cityElement = DocumentHelper.createElement("City");
		//设置文本
		cityElement.setText("三门峡");
		
		Document document = Dom4JUtils.getDocument();
		//获取根元素
		Element rootElement = document.getRootElement();
		//获取根元素下所有的子元素
		List<Element> es = rootElement.elements();
		//将新的元素添加到子元素列表中
		es.add(1, cityElement);
		
		//写会文件
		Dom4JUtils.write2XML(document);
	}

	private static void method5() throws Exception, IOException {
		//4、向指定元素节点中增加子元素节:添加一个新城市<City>南阳</City>
		Document document = Dom4JUtils.getDocument();
		//获取根元素
		Element rootElement = document.getRootElement();
		//添加元素
		Element cityElement = rootElement.addElement("City");
		//设置文本
		cityElement.setText("南阳");
		//写回文件
		Dom4JUtils.write2XML(document);
	}

	private static void method4() throws Exception, IOException {
		//6、删除指定元素节点:删除元素开封	
		Document document = Dom4JUtils.getDocument();
		//获取根元素
		Element rootElement = document.getRootElement();
		//获取根元素下的所有子元素
		List<Element> es = rootElement.elements();
		Element cityElement = es.get(1);
		//无法自杀，找他爹
		Element parentElement = cityElement.getParent();
		parentElement.remove(cityElement);
		//写回文件
		Dom4JUtils.write2XML(document);
	}

	private static void method3() throws Exception, IOException {
		//3、修改某个元素节点的主体内容:信阳-->安阳
		Document document = Dom4JUtils.getDocument();
		//获取根元素
		Element rootElement = document.getRootElement();
		//获取根元素下的所有子元素
		List<Element> es = rootElement.elements();
		//根据索引可以获取指定的元素
		Element cityElement = es.get(3);
		//修改文本
		cityElement.setText("安阳");
		//写回文件
		Dom4JUtils.write2XML(document);
	}

	private static void method2() throws Exception {
		//2、遍历所有元素节点:打印他们的元素名称。
		//获取根元素
		Document document = Dom4JUtils.getDocument();
		Element rootElement = document.getRootElement();
		treeWalk(rootElement);
	}
	
	public static void treeWalk(Element element) {
		//输出元素的名称
		System.out.println(element.getName());
		
		//获取指定元素的所有子元素
		List<Element> es = element.elements();
		for (Element e : es) {
			treeWalk(e);
		}
	}

	private static void method1() throws Exception {
		//1、得到某个具体的节点内容:打印"郑州"
		Document document = Dom4JUtils.getDocument(); 
		//获取根元素
		Element rootElement = document.getRootElement();
		//获取根元素下的所有子元素
		List<Element> elements = rootElement.elements();
		//根据索引获取第一个City元素
		Element cityElement = elements.get(0);
		//根据子元素的名称来获取子元素的文本
		String text = cityElement.elementText("Name");
		System.out.println(text);
	}
}