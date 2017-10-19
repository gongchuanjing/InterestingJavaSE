package tk.chuanjing.stage4web.chapter09.datasource_c3p0.jdbcmetadata;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;

import tk.chuanjing.stage3.utils.JDBCUtilsConfig;
import tk.chuanjing.stage4web.chapter09.datasource_c3p0.JDBCUtilsC3P0;

/**
 * 抽取一个通用的	增	删	改
 * @author ChuanJing
 *
 */
public class MyDbUtils {
	public static void main(String[] args) {
//		MyDbUtils.update("insert into category(cid,cname) values(null,?)", new Object[]{"植物花卉"});
//		MyDbUtils.update("update category set cname = ? where cid = ?", new Object[]{"花卉盆景", 5});
		MyDbUtils.update("delete from category where cid = ?", 5);
	}

	public static void update(String sql, Object... objects) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = JDBCUtilsC3P0.getConnection();
			ps = conn.prepareStatement(sql);
			
			ParameterMetaData parameterMetaData = ps.getParameterMetaData();
			int parameterCount = parameterMetaData.getParameterCount();
			for (int i = 1; i <= parameterCount; i++) {
				ps.setObject(i, objects[i-1]);
			}
			
			int row = ps.executeUpdate();
			System.out.println(row + "行受影响！");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtilsConfig.close(conn, ps);
		}
	}
}
