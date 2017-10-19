package tk.chuanjing.stage4web.chapter09.datasource_c3p0.jdbcmetadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

import tk.chuanjing.stage4web.chapter09.datasource_c3p0.JDBCUtilsC3P0;

/**
 * JDBC中的元数据的测试类
 * @author admin
 *
 */
public class MetaDataDemo1 {

	/**
	 * 数据库元数据
	 */
	@Test
	public void demo1(){
		Connection conn = JDBCUtilsC3P0.getConnection();
		try {
			// 获得数据库元数据:
			DatabaseMetaData metaData = conn.getMetaData();
			System.out.println("获得驱动名称:"+metaData.getDriverName());
			System.out.println("获得驱动URL:"+metaData.getURL());
			System.out.println("获得用户名:"+metaData.getUserName());
			
			// 获得表中的主键：
			ResultSet rs = metaData.getPrimaryKeys(null, null, "category");
			if (rs.next()) {
				System.out.println(rs.getString("COLUMN_NAME"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 参数元数据：
	 */
	@Test
	public void demo2(){
		Connection conn = JDBCUtilsC3P0.getConnection();
		PreparedStatement ps;
		
		String sql = "update category set cname = ? where cid = ?";
		try {
			ps = conn.prepareStatement(sql);
			
			ParameterMetaData parameterMetaData = ps.getParameterMetaData();
			int parameterCount = parameterMetaData.getParameterCount();
			System.out.println("有"+parameterCount+"个参数");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 结果集元数据：
	 */
	@Test
	public void demo3(){
		Connection conn = JDBCUtilsC3P0.getConnection();
		PreparedStatement ps;
		ResultSet rs;
		
		String sql = "select * from category";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			for (int i = 1; i <= columnCount; i++) {
				String columnName = metaData.getColumnName(i);
				String columnTypeName = metaData.getColumnTypeName(i);
				
				System.out.println(columnName +"     "+columnTypeName);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
