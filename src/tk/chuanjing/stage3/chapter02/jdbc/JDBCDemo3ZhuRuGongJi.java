package tk.chuanjing.stage3.chapter02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @author ChuanJing
 * @date 2017年5月11日 上午10:57:35
 * @version 1.0

演示注入攻击：
	a
	1 'or' 1=1
	
解决注入攻击
 */
public class JDBCDemo3ZhuRuGongJi {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mybsae";
		String user = "root";
		String password = "12345";
		Connection connection = DriverManager.getConnection(url, user, password);
		
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		String pwd = sc.nextLine();
//		String sql = "SELECT * FROM users WHERE username='"+ username +"' AND PASSWORD='"+ pwd +"'";
		
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery(sql);
		
//		while(resultSet.next()) {
//			//获取每列数据,使用是ResultSet接口的方法 getXX方法参数中,建议写String列名
//			System.out.println(resultSet.getString("username") + "\t"
//							 + resultSet.getString("password"));
//		}
		
//		resultSet.close();
//		statement.close();
//		connection.close();
		
//		解决注入攻击:
		String sql = "SELECT * FROM users WHERE username=? AND PASSWORD=?";
		
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setObject(1, username);
		prepareStatement.setObject(2, pwd);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		while(resultSet.next()) {
			//获取每列数据,使用是ResultSet接口的方法 getXX方法参数中,建议写String列名
			System.out.println(resultSet.getString("username") + "\t"
							 + resultSet.getString("password"));
		}
		
		resultSet.close();
		prepareStatement.close();
		connection.close();
	}

}
