package tk.chuanjing.stage2.chapter14.homework;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;

/**
	dom4j的练习
		1.请获取阿里的营业额是多少
		2.请将腾讯的营业额改成2000亿
		3.获取腾讯的领导人
		4.将腾讯的领导人改成"老化疼"
		5.新添加一个公司(华为)
			(注意华为公司也是有营业额属性的, 也是有领导人,领导人也是有名字,领导人也是有年龄的)
		6.删除新浪公司
		7.请将所有的公司以及领导人的信息获取出来
*/
public class HW04 {
	private static String xmlPath = "src/tk/chuanjing/stage2/chapter14/homework/HW03_Company.xml";

	public static void main(String[] args) throws Exception {
		//1.请获取阿里的营业额是多少
		Document document = Dom4JUtils.getDocument(xmlPath);
		Element rootElement = document.getRootElement();
		Element elementALi = rootElement.element("ALi");
		
//		Attribute attribute = elementALi.attribute("营业额");
//		System.out.println(attribute.getText());
		System.out.println(elementALi.attributeValue("营业额"));
		
		//2.请将腾讯的营业额改成2000亿
		Element elementTencent = rootElement.element("Tencent");
		Attribute attributeTencent = elementTencent.attribute("营业额");
		attributeTencent.setText("2000亿");
//		System.out.println(attributeTencent.getText());
		System.out.println(attributeTencent.getValue());
//		Dom4JUtils.write2xml(document, "xml/Company.xml");
		
		//3.获取腾讯的领导人
		Element elementTencentLeader = elementTencent.element("Leader");
//		System.out.println("腾讯的领导人是:"+elementTencentLeader.elementText("Name"));
		System.out.println("腾讯的领导人是:"+elementTencentLeader.element("Name").getText());
	}

}