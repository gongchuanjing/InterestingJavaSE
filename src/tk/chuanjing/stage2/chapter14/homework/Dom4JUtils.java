package tk.chuanjing.stage2.chapter14.homework;

import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4JUtils {
	public static Document getDocument(String xmlPath) throws Exception {
		SAXReader r = new SAXReader();
		Document document = r.read(xmlPath);
		return document;
	}
	
	public static void write2xml(Document document, String xmlPath) throws IOException, IOException{
		OutputFormat format = OutputFormat.createPrettyPrint();
		//format.setEncoding("UTF-8");//默认的编码就是UTF-8
		XMLWriter writer = new XMLWriter(new FileOutputStream(xmlPath), format);
		writer.write(document);
	}
}