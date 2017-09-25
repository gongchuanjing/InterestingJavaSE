package tk.chuanjing.stage3.chapter02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author ChuanJing
 * @date 2017年5月11日 下午12:34:19
 * @version 1.0

 PrepareStatement接口实现数据表的查询操作
 */
public class JDBCDemo5PreparedStatementQuery {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mybsae";
		String user = "root";
		String password = "12345";
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql = "SELECT * FROM sort";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("sid") + "\t\t"
					 + resultSet.getString("sname") + "\t\t"
					 + resultSet.getDouble("sprice") + "\t\t"
					 + resultSet.getString("sdesc"));
		}
		
		resultSet.close();
		prepareStatement.close();
		connection.close();
	}
}
