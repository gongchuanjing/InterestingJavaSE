package tk.chuanjing.stage4web.chapter09.datasource_c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import tk.chuanjing.stage3.utils.JDBCUtilsConfig;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * C3P0连接池的使用
 * 
 * @author ChuanJing
 * @date 2017年5月29日 下午8:29:03
 * @version 1.0
 */
public class C3P0Demo1 {

	/**
	 * 手动设置参数
	 */
	@Test
	public void test1() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/web_07");
			dataSource.setUser("root");
			dataSource.setPassword("12345");
			
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
	
	/**
	 * 配置文件设置参数
	 */
	@Test
	public void test2() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
//			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			ComboPooledDataSource dataSource = new ComboPooledDataSource("mysql");
			
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
	
	/**
	 * 测试JDBCUtilsC3P0
	 */
	@Test
	public void test3() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtilsC3P0.getConnection();
			String sql = "select * from category";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("cid") + "\t" + rs.getString("cname"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtilsC3P0.close(conn, ps, rs);
		}
	}
}
