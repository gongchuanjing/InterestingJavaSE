package tk.chuanjing.stage3.chapter05and06.gjp.view;

import java.util.List;
import java.util.Scanner;

import tk.chuanjing.stage3.chapter05and06.gjp.controller.ZhangWuController;
import tk.chuanjing.stage3.chapter05and06.gjp.domain.ZhangWu;

/**
 * @author ChuanJing
 * @date 2017年5月15日 下午4:57:21
 * @version 1.0
 */
public class MainView {

	private ZhangWuController zhangWuController = new ZhangWuController();
	
	/**
	 * 实现界面效果
	 * 接收用户的输入
	 * 根据数据,调用不同的功能方法
	 */
	public void run() {
		//创建Scanner类对象,反复键盘输入
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			
			//接收用户的菜单选择
			String line = sc.nextLine();
			
			//对选择的菜单判断,调用不同的功能
			switch (line) {
			case "1":
				// 选择添加账务,调用添加账务的方法
				addZhangWu();
				break;
				
			case "2":
				// 选择的编辑账务,调用编辑账务方法
				editZhangWu();
				break;
				
			case "3":
				// 选择的删除账务,调用删除账务方法
				deleteZhangWu();
				break;
				
			case "4":
				// 选择的是查询账务,调用查询方法
				selectZhangWu();
				break;
				
			case "5":
				System.exit(0);
				break;

			default:
				System.out.println("输入有误，请重新输入！");
				break;
			}
		}
	}

	/**
	 * 定义方法，实现账务删除
	 * 实现思想：
	 * 	接收用户的输入，输入一个主键数据
	 *  调用控制层方法，传递一个主键
	 */
	private void deleteZhangWu() {
		//调用查询所有账务数据的功能，显示出来
		//看到所有数据，从中选择一项，进行删除
		selectAll();
		
		System.out.print("选择的是删除功能，请输入要删除的序号：");
		Scanner sc = new Scanner(System.in);
		int zwid = sc.nextInt();
		sc.nextLine();//扫描走换行符，方便下次输入
		
		//调用控制层方法，传递主键id即可
		int row = zhangWuController.deleteZhangWu(zwid);
		if (row > 0) {
			System.out.println("删除账务成功!");
		} else {
			System.out.println("删除账务失败!");
		}
	}

	/**
	 * 定义方法，实现对账务的编辑功能
	 * 实现思想：
	 * 	接收用户的输入的信息
	 *  封装成ZhangWu对象
	 *  调用控制层的方法，传递ZhangWu对象，实现编辑
	 */
	private void editZhangWu() {
		//调用查询所有账务数据的功能，显示出来
		//看到所有数据，从中选择一项，进行修改
		selectAll();
		System.out.println("选择的是编辑功能，请输入数据");
		Scanner sc = new Scanner(System.in);
		
		//将用户输入的数据，封装到ZhangWu对象中
		//用户输入的ID，必须封装到到对象中
		ZhangWu zw = new ZhangWu();
		
		System.out.print("输入ID：");
		zw.setZwid(sc.nextInt());
		sc.nextLine();//扫描走换行符
		
		System.out.print("输入分类名称：");
		zw.setFlname(sc.nextLine());
		
		System.out.print("输入金额：");
		zw.setMoney(sc.nextDouble());
		sc.nextLine();//扫描走换行符
		
		System.out.print("输入账户：");
		zw.setZhanghu(sc.nextLine());
		
		System.out.print("输入日期：格式XXXX-XX-xx：");
		zw.setCreatetime(sc.nextLine());
		
		System.out.print("输入具体描述：");
		zw.setDescription(sc.nextLine());
		
		//调用controller层中的方法，实现编辑账务
		int row = zhangWuController.editZhangWu(zw);
		if (row > 0) {
			System.out.println("编辑账务成功!");
		} else {
			System.out.println("编辑账务失败!");
		}
	}

	/**
	 * 定义方法addZhangWu
	 * 添加账务的方法，用户在界面中选择菜单1的时候调用、
	 * 实现思想：
	 * 	  接收键盘输入，5项输入，调用controller层方法
	 */
	private void addZhangWu() {
		System.out.println("选择的添加账务功能，请输入以下内容");
		Scanner sc = new Scanner(System.in);
		
		//将用户输入的所有参数，封装成ZhangWu对象
		ZhangWu zw = new ZhangWu();
		
		System.out.print("输入分类名称：");
		zw.setFlname(sc.nextLine());
		
		System.out.print("输入金额：");
		zw.setMoney(sc.nextDouble());
		sc.nextLine();//扫描走换行符
		
		System.out.print("输入账户：");
		zw.setZhanghu(sc.nextLine());
		
		System.out.print("输入日期：格式XXXX-XX-xx：");
		zw.setCreatetime(sc.nextLine());
		
		System.out.print("输入具体描述：");
		zw.setDescription(sc.nextLine());
		
		//将接收到的数据，调用controller层的方法，传递参数，实现数据添加
		int row = zhangWuController.addZhangWu(zw);
		if (row > 0) {
			System.out.println("添加账务成功!");
		} else {
			System.out.println("添加账务失败!");
		}
	}

	/**
	 * 查询账务
	 * 定义方法 selectZhangWu()
	 * 显示查询的方式 1 所有查询   2 条件查询
	 * 接收用户的选择
	 */
	private void selectZhangWu() {
		System.out.println("1. 查询所有    2. 条件查询");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		//判断根据用户的选择,调用不同的功能
		switch (line) {
		case "1":
			//选择的查询所有,调用查询所有的方法
			selectAll();
			break;
			
		case "2":
			//选的条件查询,调用带有查询条件的方法
			select();
			break;

		default:
			System.out.println("输入有误，请重新输入！");
			break;
		}
	}

	/**
	 * 定义方法,实现查询所有的账务数据
	 */
	private void selectAll() {
		//调用控制层中的方法,查询所有的账务数据
		List<ZhangWu> list = zhangWuController.selectAll();
		
		if (list != null && list.size() > 0) {
			print(list);
		} else {
			System.out.println("没有查询到数据");
		}
	}

	/**
	 * 定义方法,实现条件查询账务数据
	 * 提供用户的输入日期,开始日期结束日期
	 * 就2个日期,传递到controller层
	 * 调用controller的方法,传递2个日期参数
	 * 获取到controller查询的结果集,打印出来
	 */
	private void select() {
		System.out.println("选择条件查询,输入日期格式XXXX-XX-XX");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入开始日期:");
		String startDate = sc.nextLine();
		
		System.out.print("请输入结果日期:");
		String endDate = sc.nextLine();
		
		//调用controller层的方法,传递日期,获取查询结果集
		List<ZhangWu> list = zhangWuController.select(startDate, endDate);
		
		if (list != null && list.size() > 0) {
			print(list);
		} else {
			System.out.println("没有查询到数据");
		}
	}
	
	/**
	 * 输出账务数据方法,接收List集合,遍历集合,输出表格
	 * @param list
	 */
	private void print(List<ZhangWu> list) {
		//输出表头
		System.out.println("ID\t分类\t\t金额\t\t账户\t\t创建日期\t\t描述");
		
		//遍历集合,结果输出控制台
		for (ZhangWu zhangWu : list) {
			System.out.println(zhangWu.getZwid() + "\t" + zhangWu.getFlname() + "\t\t"
					+ zhangWu.getMoney() + "\t\t" + zhangWu.getZhanghu() + "\t\t"
					+ zhangWu.getCreatetime() +"\t" + zhangWu.getDescription());
		}
	}
}
