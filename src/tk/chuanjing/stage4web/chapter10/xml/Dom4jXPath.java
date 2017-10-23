package tk.chuanjing.stage4web.chapter10.xml;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * @author ChuanJing
 * @date 2017年5月30日 下午6:32:55
 * @version 1.0
 */
public class Dom4jXPath {

	public static void main(String[] args) throws DocumentException {
		test();
	}

	/**
	 * DOM4J的XPath的写法
	 * xml/books.xml	这个文件已经删除了，运行会报错
	 * @throws DocumentException 
	 */
	private static void test() throws DocumentException {
		// 创建解析器
		SAXReader r = new SAXReader();
		Document document = r.read("xml/books.xml");
		
		List<Node> nodes = document.selectNodes("//title");
		for (Node node : nodes) {
			Element e = (Element) node;
			System.out.println(e.getText());
		}
		
//		List<Node> nodes2 = document.selectNodes("//book['@id']");
		List<Node> nodes2 = document.selectNodes("//book[@id]");
		for (Node node : nodes2) {
			Element e = (Element) node;
			System.out.println(e.attributeValue("id"));
		}
		
		// 如果使用selectSingleNode，默认返回第一个
		Node selectSingleNode = document.selectSingleNode("//title");
		System.out.println(selectSingleNode.getText());
	}
}