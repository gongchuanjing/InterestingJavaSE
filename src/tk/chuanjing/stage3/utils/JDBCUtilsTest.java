package tk.chuanjing.stage3.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author ChuanJing
 * @date 2017年5月11日 下午1:10:17
 * @version 1.0
 */
public class JDBCUtilsTest {

	public static void main(String[] args) throws Exception {
		Connection connection = JDBCUtilsConfig.getConnection();
		
		String sql = "SELECT * FROM sort";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("sid") + "\t\t"
					 + resultSet.getString("sname") + "\t\t"
					 + resultSet.getDouble("sprice") + "\t\t"
					 + resultSet.getString("sdesc"));
		}
		
		JDBCUtilsConfig.close(connection, prepareStatement, resultSet);
	}

}
