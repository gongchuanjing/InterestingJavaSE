package tk.chuanjing.stage4web.chapter09.datasource_c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import tk.chuanjing.stage3.utils.JDBCUtilsConfig;

/**
 * DBCP连接池的使用：
 * 
 * @author ChuanJing
 * @date 2017年5月29日 下午7:55:03
 * @version 1.0
 */
public class DBCPDemo1 {

	/**
	 * 手动方式
	 */
	@Test
	public void test1(){
		BasicDataSource dataSource = new BasicDataSource();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/web_07");
			dataSource.setUsername("root");
			dataSource.setPassword("12345");
			
			conn = dataSource.getConnection();
			String sql = "select * from category";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("cid") + "\t" + rs.getString("cname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtilsConfig.close(conn, ps, rs);
		}
	}
	
	/**
	 * 配置文件方式
	 */
	@Test
	public void test2(){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Properties properties = new Properties();
			properties.load(DBCPDemo1.class.getClassLoader().getResourceAsStream("dbcpconfig.properties"));
			DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
			
			conn = dataSource.getConnection();
			String sql = "select * from category";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("cid") + "\t" + rs.getString("cname"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtilsConfig.close(conn, ps, rs);
		}
	}
}
