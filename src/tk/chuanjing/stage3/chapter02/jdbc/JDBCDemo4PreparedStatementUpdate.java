package tk.chuanjing.stage3.chapter02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author ChuanJing
 * @date 2017年5月11日 下午12:34:19
 * @version 1.0

使用PrepareStatement接口,实现数据表的更新操作
 */
public class JDBCDemo4PreparedStatementUpdate {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mybsae";
		String user = "root";
		String password = "12345";
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql = "UPDATE sort SET sname = ?, sprice = ? WHERE sid = ?";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setObject(1, "汽车美容");
		prepareStatement.setObject(2, 2999);
		prepareStatement.setObject(3, 7);
		
		int row = prepareStatement.executeUpdate();
		System.out.println(row + "行修改成功！");
		
		prepareStatement.close();
		connection.close();
	}

}
