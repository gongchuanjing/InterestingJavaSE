package tk.chuanjing.stage4web.chapter09.datasource_c3p0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import tk.chuanjing.stage3.utils.JDBCUtilsConfig;

/**
 * @author ChuanJing
 * @date 2017年5月29日 上午9:54:22
 * @version 1.0
 */
public class JDBCDemo1 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/web_07";
			String user = "root";
			String password = "12345";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from category";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt("cid") + "\t" + rs.getString("cname"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				rs = null;
			}
			
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				ps = null;
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				conn = null;
			}
		}
	}

	/**
	 * 查询分类的操作
	 */
	@Test
	public void demo1() {
		Connection conn = JDBCUtilsConfig.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from category";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("cid") + "\t" + rs.getString("cname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtilsConfig.close(conn, ps, rs);
		}
	}
	
	/**
	 * 完成添加分类的操作
	 */
	@Test
	public void demo2() {
		Connection conn = JDBCUtilsConfig.getConnection();
		PreparedStatement ps = null;
		
		try {
			String sql = "insert into category(cid, cname) values (null, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "写诗箱包");
			
			int row = ps.executeUpdate();
			System.out.println(row + "受影响！");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtilsConfig.close(conn, ps);
		}
	}
	
	/**
	 * 修改分类
	 */
	@Test
	public void demo3() {
		Connection conn = JDBCUtilsConfig.getConnection();
		PreparedStatement ps = null;
		
		try {
			String sql = "update category set cname = ? where cid = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "鞋靴箱包");
			ps.setInt(2, 4);
			
			int row = ps.executeUpdate();
			System.out.println(row + "受影响！");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtilsConfig.close(conn, ps);
		}
	}
	
	/**
	 * 删除分类
	 */
	@Test
	public void demo4() {
		Connection conn = JDBCUtilsConfig.getConnection();
		PreparedStatement ps = null;
		
		try {
			String sql = "delete from category where cid = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 4);
			
			int row = ps.executeUpdate();
			System.out.println(row + "受影响！");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtilsConfig.close(conn, ps);
		}
	}
}
