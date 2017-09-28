package tk.chuanjing.stage3.chapter04.login_register;

import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年5月14日 下午3:35:30
 * @version 1.0

	实现和用户的交互部分
 *  提供菜单,让用户选择菜单,根据菜单,调用不同的功能
 */
public class UsersOperation {

	private static Scanner sc;
	private static UsersDao usersDao;

	public static void main(String[] args) {
		usersDao = new UsersDao();
		
		while(true) {
			System.out.println("欢迎来到这里，请选择功能：");
			System.out.println("1登陆，2注册，3退出");
			sc = new Scanner(System.in);
			String result = sc.nextLine();
			
			switch (result) {
			case "1":
				login();
				break;
				
			case "2":
				register();
				break;
				
			case "3":
				System.exit(0);
				break;
				
			default:
				System.out.println("选择错误，请重新选择");
				break;
			}
		}
	}

	private static void login() {
		System.out.println("请输入账号：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		
		boolean login = usersDao.login(username, password);
		if (login) {
			System.out.println("登陆成功！");
		} else {
			System.out.println("登陆失败，请检查用户名和密码是否正确！");
		}
	}

	private static void register() {
		System.out.println("请输入账号：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		
		boolean register = usersDao.register(username, password);
		if (register) {
			System.out.println("注册成功！");
		} else {
			System.out.println("注册失败！可能用户名已经被占用了，请尝试" + username + "_123");
		}
	}
}