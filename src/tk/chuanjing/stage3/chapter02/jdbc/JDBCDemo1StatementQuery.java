package tk.chuanjing.stage3.chapter02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author ChuanJing
 * @date 2017年5月11日 上午10:09:23
 * @version 1.0
 */
public class JDBCDemo1StatementQuery {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mybsae";
		String user = "root";
		String password = "12345";
		Connection connection = DriverManager.getConnection(url, user, password);
//		Connection connection = DriverManager.getConnection(url);
		
		Statement statement = connection.createStatement();
		
		String sql = "SELECT * FROM sort";
		
		//4. 调用执行者对象方法,执行SQL语句获取结果集
		// ResultSet executeQuery(String sql)  执行SQL语句中的select查询
		// 返回值ResultSet接口的实现类对象,实现类在mysql驱动中
		ResultSet resultSet = statement.executeQuery(sql);
		
		//5 .处理结果集
		// ResultSet接口方法 boolean next() 返回true,有结果集,返回false没有结果集
		while(resultSet.next()) {
			//获取每列数据,使用是ResultSet接口的方法 getXX方法参数中,建议写String列名
			System.out.println(resultSet.getInt("sid") + "\t\t"
							 + resultSet.getString("sname") + "\t\t"
							 + resultSet.getDouble("sprice") + "\t\t"
							 + resultSet.getString("sdesc"));
		}
		
		statement.executeQuery("SELECT count(*) FROM sort");
		
		resultSet.close();
		statement.close();
		connection.close();
	}
	
}
