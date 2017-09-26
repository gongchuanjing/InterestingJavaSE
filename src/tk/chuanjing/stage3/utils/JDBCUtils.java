package tk.chuanjing.stage3.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author ChuanJing
 * @date 2017年5月11日 下午1:01:07
 * @version 1.0

 *  实现JDBC的工具类
 *  定义方法,直接返回数据库的连接对象
 *  
 *  写关闭方法
 */
public class JDBCUtils {

	private static Connection connection;
	
	private JDBCUtils() {}
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mybsae";
			String user = "root";
			String password = "12345";
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			throw new RuntimeException(e + "数据库连接失败");
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	public static void close(Connection connection, Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Connection connection, Statement statement, ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
