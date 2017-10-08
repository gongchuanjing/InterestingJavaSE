package tk.chuanjing.stage1.chapter07.homework;
/**
 * @author ChuanJing
 * @date 2017年3月20日 下午3:23:40
 * @version 1.0

第二题：分析以下需求，并用代码实现
	1.项目经理类Manager 
		属性：
			姓名name
			工号id
			工资salary
			奖金bonus
		行为：
			工作work()
	2.程序员类Coder
		属性：
			姓名name
			工号id
			工资salary
		行为：
			工作work()
	要求:
		1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用成员方法,打印格式如下:
			工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
			工号为135基本工资为10000的程序员正在努力的写着代码......
 */
public class HW02 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setName("王建国");
		manager.setId("088");
		manager.setSalary(9000.00f);
		manager.setBonus(3000.66f);
		manager.work();
		
		System.out.println("\r\n------------------------------华丽分隔线---------------\r\n");
		
		Coder coder = new Coder("钟国胜", "666", 10000.66f);
		coder.work();
	}

}
