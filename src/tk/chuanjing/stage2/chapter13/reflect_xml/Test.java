package tk.chuanjing.stage2.chapter13.reflect_xml;
/**
 * @author ChuanJing
 * @date 2017年5月5日 上午10:14:17
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) throws Exception {
		CompanyTencent tencent = (CompanyTencent) BeanFactory.getBean("001");
		CompanyBaiDu baiDu = (CompanyBaiDu) BeanFactory.getBean("002");
		
		System.out.println(tencent);
		System.out.println(baiDu);
	}

}
