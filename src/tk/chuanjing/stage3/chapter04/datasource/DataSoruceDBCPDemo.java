package tk.chuanjing.stage3.chapter04.datasource;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

/**
 * @author ChuanJing
 * @date 2017年5月13日 下午5:23:18
 * @version 1.0

	连接池jar包中,定义好一个类 BasicDataSource
 *  实现类数据源的规范接口 javax.sql.DataSource
 */
public class DataSoruceDBCPDemo {

	private static Connection conn;
	
	public static void main(String[] args) throws SQLException {
		//创建DataSource接口的实现类对象
		//实现类, org.apache.commons.dbcp
		BasicDataSource dataSource = new BasicDataSource();
		
		//连接数据库的4个最基本信息,通过对象方法setXXX设置进来
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/mybsae");
		dataSource.setUsername("root");
		dataSource.setPassword("12345");
		
		try {
			//调用对象方法getConnection获取数据库的连接
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("获取链接失败！");
		}
		
		insert();
//		update();
//		delete();
	}

//	private static void delete() {
//		QueryRunner queryRunner = new QueryRunner();
//	}

	private static void update() throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		
		String sql = "UPDATE sort SET sname=?,sprice=?,sdesc=? WHERE sid = ?;";
		Object[] params = {"健身器材2", "99.8", "二代降价", "10"};
		int row = queryRunner.update(conn, sql, params);
		System.out.println(row + "行受影响");
		DbUtils.closeQuietly(conn);
	}

	private static void insert() throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		
		String sql = "INSERT INTO sort(sname, sprice, sdesc) VALUES(?, ?, ?), (?, ?, ?);";
		Object[] params = {"酒水1", 199, "喝酒能长寿", "酒水2", 19, "瞎扯"};
		int row = queryRunner.update(conn, sql, params);
		System.out.println(row + "行受影响");
		DbUtils.closeQuietly(conn);
	}

}
