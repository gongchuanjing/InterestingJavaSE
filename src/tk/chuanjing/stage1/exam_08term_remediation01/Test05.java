package tk.chuanjing.stage1.exam_08term_remediation01;


/**
 * @author ChuanJing
 * @date 2017年3月31日 下午3:22:06
 * @version 1.0

案例5:(常用API)
	1.把指定字符串转换为首字母大写，其他字母小写
 */
public class Test05 {

	public static void main(String[] args) {
		// 定义一个需要转换的字符串
		String s = "abcd";
		
		// 截取出第一个字母
		String shou = s.substring(0, 1);
		
		// 截取出第一个字母之后的字符串
		String hou = s.substring(1);
		
		// 把截取出来的首字母转换成大写，并且还赋值给shou
		shou = shou.toUpperCase();
		
		// 输出转换后的首字母看看 对不对
		System.out.println(shou);
		
		// 把截取出来的首字母之后的字符串转换成小写，并且还赋值给hou
		hou = hou.toLowerCase();
		
		// 输出转换后的看看 对不对
		System.out.println(hou);
		
		// 把转换后的首字母和后面的字符串再拼接到一块，并且还赋值给s
		s = shou + hou;
		
		// 打印最后转换后的字符串
		System.out.println(s);
	}

}
