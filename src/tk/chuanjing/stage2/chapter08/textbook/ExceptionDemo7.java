package tk.chuanjing.stage2.chapter08.textbook;
/**
 * @author ChuanJing
 * @date 2017年9月11日 下午2:53:07
 * @version 1.0

 * 需求：写一个方法，接受考试成绩，如果考试成绩的范围在0-100之间则属于正常，否则属于异常
 * 
 * throws:处理异常的一种方式，把异常抛出，由调用者来处理
 * throw:制造异常的方式,并且结束方法
 * 
 * 注意：如果抛出（throw）的是编译时期异常，必须在方法声明处抛出（throws）
 * 
 * 如何自定义一个异常类呢？
 * 		非常简单，写一个类去继承Exception或者RuntimeException，然后实现多个构造即可
 */
public class ExceptionDemo7 {
	public static void main(String[] args) {
//		boolean flag = checkScore(-10);
//		System.out.println(flag);
		
//		checkScore(110);
		
		try {
			checkScore(110);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	public static boolean checkScore(int score) {
		//判断考试成绩是否符合范围，如果不符合则返回false
		if(score < 0 || score > 100) {
			return false;
		}
		
		//符合
		return true;
	}
	*/
	
	/**
	 * 如果抛出（throw）的是编译时期异常，必须在方法声明处抛出（throws）
	 * @param score
	 * @throws Exception
	 */
	public static void checkScore(int score) throws Exception {
		if(score < 0 || score > 100) {
//			throw new RuntimeException("考试成绩不符合要求");
//			throw new Exception("考试成绩不符合要求");
			throw new MyException("自定义异常：考试成绩不符合要求");
		}
		
		System.out.println("考试成绩符合要求");
	}
}

/**
 * 自定义一个异常类
 * @author ChuanJing
 *
 */
class MyException extends /*RuntimeException*/ Exception{

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}
}