package tk.chuanjing.stage3.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author ChuanJing
 * @date 2017年5月12日 上午8:35:27
 * @version 1.0
 */
public class JDBCUtilsConfig {

	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	private static Connection connection;
	
	private JDBCUtilsConfig() {}
	
	static {
		try {
			readConfig();
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("停停停，别搞了，连接都搞不上！");
		}
	}

	public static Connection getConnection() {
		return connection;
	}
	
	private static void readConfig() throws IOException {
		InputStream is = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("jdbc.properties");
		Properties properties = new Properties();
		properties.load(is);
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		pwd = properties.getProperty("pwd");
	}
	
	public static void close(Connection connection, Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			statement = null;
		}
		
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			connection = null;
		}
	}
	
	public static void close(Connection connection, Statement statement, ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			resultSet = null;
		}
		
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			statement = null;
		}
		
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			connection = null;
		}
	}
}
