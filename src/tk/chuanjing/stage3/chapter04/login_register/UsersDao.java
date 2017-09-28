package tk.chuanjing.stage3.chapter04.login_register;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import tk.chuanjing.stage3.utils.JDBCUtilsDataSoruceDBCP;

/**
 * @author ChuanJing
 * @date 2017年5月14日 下午3:34:22
 * @version 1.0

两个方法,实现用户的注册和登录
 */
public class UsersDao {

	private QueryRunner qr = new QueryRunner(JDBCUtilsDataSoruceDBCP.getDataSoruce());
	
	public boolean login(String username, String password) {
		try {
			String sql = "SELECT * FROM users WHERE username = ? AND password = ?;";
			Object[] params = {username, password};
			Object[] objects = qr.query(sql, new ArrayHandler(), params);
			if (objects.length < 1) {
				return false;
			} else {
				return true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("登录查询异常");
		}
	}
	
	public boolean register(String username, String password) {
		try {
			String sql = "SELECT username FROM users WHERE username = ?;";
			String string = qr.query(sql, new ScalarHandler<String>(), username);
			if (string != null) {
				return false;
			} else {
				sql = "INSERT INTO users(username, password) VALUES(?,?);";
				Object[] params = {username, password};
				int row = qr.update(sql, params);
				if (row == 1) {
					return true;
				} else {
					return false;
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("查询异常");
		}
	}
}
