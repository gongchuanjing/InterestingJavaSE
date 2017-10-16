package tk.chuanjing.stage3.chapter05and06.exam22.app;

import java.sql.Connection;

import org.apache.commons.dbutils.QueryRunner;

import tk.chuanjing.stage3.chapter05and06.exam22.tools.JDBCUtils;

public class Test {
	public static void main(String[] args) throws Exception {
		QueryRunner qr = new QueryRunner();
		Connection conn = JDBCUtils.getConnection();
		conn.setAutoCommit(false);
		
		qr.update(conn,"update account set balance = 12 where cardid = '6212888888888'");
	//	int a = 10 / 0;
		qr.update(conn,"update account set balance = 12 where cardid = '6212999999999'");
	//	conn.commit();
		
	}
}
