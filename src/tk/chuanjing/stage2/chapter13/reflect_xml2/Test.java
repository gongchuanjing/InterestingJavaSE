package tk.chuanjing.stage2.chapter13.reflect_xml2;
/**
 * @author ChuanJing
 * @date 2017年5月5日 上午10:14:17
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) {
		User user = (User) BeanFactory.getBean("u001");
		Book book = (Book) BeanFactory.getBean("b001");
		
		System.out.println(user);
		System.out.println(book);
	}

}
