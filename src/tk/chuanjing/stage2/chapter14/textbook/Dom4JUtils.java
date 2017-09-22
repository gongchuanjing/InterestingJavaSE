package tk.chuanjing.stage2.chapter14.textbook;

import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4JUtils {
	private Dom4JUtils() {}
	
	public static Document getDocument() throws Exception {
		SAXReader reader = new SAXReader();
	    Document document = reader.read("src/tk/chuanjing/stage2/chapter14/textbook/city.xml");
	    return document;
	}
	
	//to
	public static void write2XML(Document document) throws IOException {
		OutputFormat format = OutputFormat.createPrettyPrint();
		//format.setEncoding("UTF-8");//默认的编码就是UTF-8
		XMLWriter writer = new XMLWriter( new FileOutputStream("src/tk/chuanjing/stage2/chapter14/textbook/city.xml"), format );
        writer.write( document );
	}
}