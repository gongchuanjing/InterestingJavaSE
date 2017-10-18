package tk.chuanjing.stage4web.chapter09.datasource_c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import tk.chuanjing.stage3.utils.JDBCUtilsConfig;

/**
 * 测试自己的连接池
 * 
 * @author ChuanJing
 * @date 2017年5月29日 下午3:29:19
 * @version 1.0
 */
public class MyDataSoruceTest {

	/**
	 * 查询分类的操作
	 */
	@Test
	public void demo1() {
		MyDataSoruce dataSoruce = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			dataSoruce = new MyDataSoruce();
			conn = dataSoruce.getConnection();
			String sql = "select * from category";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("cid") + "\t" + rs.getString("cname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			JDBCUtilsConfig.close(null, ps, rs);
			
			// 归还连接:
//			dataSoruce.addBack(conn);
			JDBCUtilsConfig.close(conn, ps, rs);
		}
	}
}
