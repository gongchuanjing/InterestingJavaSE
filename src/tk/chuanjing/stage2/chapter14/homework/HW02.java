package tk.chuanjing.stage2.chapter14.homework;

import java.io.IOException;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;

/**
 dom4j综合练习
	1)将猫的毛色获取到
	2)将狗的毛色改成黑色
	3)获取所有的动物
	4)将猪移除
	5)将牛的体重获取到
	6)将牛的体重这个属性删除
	7)将牛的体重的属性添加回去
	8)添加新的动物 (大象)(注意大象也是需要体重和毛色的)
	
	<Animal> 
	  <Cat weight="2"> 
	    <color>花色</color> 
	  </Cat>  
	  <Dog weight="2"> 
	    <color>蓝色</color> 
	  </Dog>  
	  <Ox weight="56kg"> 
	    <color>黄色</color> 
	  </Ox>  
	  <Sheep weight="40kg"> 
	    <color>白色</color> 
	  </Sheep>  
	  <Big weight="50kg"> 
	    <color>白色</color> 
	  </Big>  
	  <daxiang weight="200kg">
	    <color>灰色</color>
	  </daxiang>
	</Animal>
 */
public class HW02 {
	private static String xmlPath = "src/tk/chuanjing/stage2/chapter14/homework/HW01_animal.xml";
	
	public static void main(String[] args) throws Exception {
		Document document = Dom4JUtils.getDocument(xmlPath);
		Element rootElement = document.getRootElement();
		
		// 1)将猫的毛色获取到
//		test1(rootElement);
		
		// 2)将狗的毛色改成黑色
//		test2(document, rootElement);
		
		// 3)获取所有的动物
//		test3(rootElement);
		
		// 4)将猪移除
//		test4(document, rootElement);
		
		// 4.2)将猪添加回去
//		test4_2(document, rootElement);
		
		// 5)将牛的体重获取到
//		test5(rootElement);
	
		// 6)将牛的体重这个属性删除
//		test6(document, rootElement);
		
		// 7)将牛的体重的属性添加回去
//		test7(document, rootElement);
		
		// 8)添加新的动物 (大象)(注意大象也是需要体重和毛色的)
//		test8(document, rootElement);
	}

	/**
	 * 添加新的动物 (大象)(注意大象也是需要体重和毛色的)
	 */
	private static void test8(Document document, Element rootElement) throws IOException {
		Element daxiang = rootElement.addElement("daxiang");
		/*
		// 方法一：
		daxiang.addAttribute("weight", "200kg");
		Element color = daxiang.addElement("color");
		color.setText("灰色");
		*/

		/*
		// 方法二：
		Attribute attribute = DocumentHelper.createAttribute(daxiang, "weight", "200kg");
		daxiang.add(attribute);
		daxiang.addElement("color").setText("灰色");
		*/
		Dom4JUtils.write2xml(document, xmlPath);
	}

	/**
	 * 将牛的体重的属性添加回去
	 */
	private static void test7(Document document, Element rootElement) throws IOException {
		List<Element> oxoxelement = rootElement.elements("Ox");
		Element oxox = oxoxelement.get(0);
		oxox.addAttribute("weight", "56kg");
		Dom4JUtils.write2xml(document, xmlPath);
	}

	/**
	 * 将牛的体重这个属性删除
	 */
	private static void test6(Document document, Element rootElement) throws IOException {
		List<Element> oxelement = rootElement.elements("Ox");
		Element ox = oxelement.get(0);
		Attribute attribute = ox.attribute("weight");
		ox.remove(attribute);
		Dom4JUtils.write2xml(document, xmlPath);
	}

	/**
	 * 将牛的体重获取到
	 */
	private static void test5(Element rootElement) {
		List<Element> Oxelements = rootElement.elements("Ox");
		Element oxelement = Oxelements.get(0);
		String weight = oxelement.attributeValue("weight");
		System.out.println(weight);
	}

	/**
	 * 将猪添加回去
	 */
	private static void test4_2(Document document, Element rootElement) throws IOException {
		Element bigelement = rootElement.addElement("Big");
		bigelement.addAttribute("weight", "50kg");
		Element color = bigelement.addElement("color");
		color.setText("白色");
		
		Dom4JUtils.write2xml(document, xmlPath);
	}

	private static void test4(Document document, Element rootElement) throws IOException {
		//首先获取猪对象
		List<Element> list4 = rootElement.elements("Big");
		Element element4 = list4.get(0);
		Element parent = element4.getParent();
		parent.remove(element4);
		Dom4JUtils.write2xml(document, xmlPath);
	}

	/**
	 * 获取所有的动物
	 */
	private static void test3(Element rootElement) {
		List<Element> list3 = rootElement.elements();
		for (Element element : list3) {
			System.out.println(element.getName());
		}
	}
	
	/**
	 * 将狗的毛色改成黑色
	 */
	private static void test2(Document document, Element rootElement) throws IOException {
		List<Element> list2 = rootElement.elements("Dog");
		
		Element element2 = list2.get(0).element("color");
		
		//改变<color>的文本
		element2.setText("黑色");
		Dom4JUtils.write2xml(document, xmlPath);
	}

	/**
	 * 将猫的毛色获取到
	 */
	private static void test1(Element rootElement) {
		List<Element> list = rootElement.elements("Cat");
		
		String color = list.get(0).elementText("color");
		System.out.println(color);
		
		String string = list.get(0).attributeValue("weight");
		System.out.println(string);
	}
}