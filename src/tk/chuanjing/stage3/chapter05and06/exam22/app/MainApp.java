package tk.chuanjing.stage3.chapter05and06.exam22.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import tk.chuanjing.stage3.chapter05and06.exam22.tools.JDBCUtils;

/**
 * 不要运行，没有连接数据库
 */
public class MainApp {
	public static void main(String[] args)  {
		QueryRunner qr = new QueryRunner();
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			return;
		}
		//设置变量：
		double tranMoney = 6000000;
		//查询转出账户是否有足够余额
		String sql = "select balance from account  where cardid = '6212999999999'";
		Double balance;
		try {
			balance = (Double) qr.query(conn, sql, new ScalarHandler());
			if(balance < tranMoney){
				System.out.println("转出方余额不足：" + tranMoney + " 万元");
				conn.setAutoCommit(true);
				return;
			}
			//处理转出账户
			sql = "update account set balance = balance - " + tranMoney + " where cardid = '6212999999999'";
			qr.update(conn, sql);
			//处理利率
			sql = "select balance from account where cardid = '6212999999999'";
			balance = (Double) qr.query(conn, sql, new ScalarHandler());
			
			if(balance < 15000000){
				sql = "update account set moneyrate = 2.5 where cardid = '6212999999999'";
				qr.update(conn, sql);
			}
			//处理转入账户
			sql = "update account set balance = balance + " + tranMoney + " where cardid = '6212888888888'";
			qr.update(conn, sql);
			//处理利率
			sql = "select balance from account where cardid = '6212888888888'";
			balance = (Double) qr.query(conn, sql, new ScalarHandler());
			if(balance >= 15000000){
				sql = "update account set moneyrate = 2.8 where cardid = '6212888888888'";
				qr.update(conn, sql);
			}
			//处理交易记录表
			String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			
			sql = "insert into transaction values(null,'6212999999999','转出'," + tranMoney + ",'" + dateStr + "')";
			qr.update(conn, sql);
			sql = "insert into transaction values(null,'6212888888888','转入'," + tranMoney + ",'" + dateStr + "')";
			qr.update(conn, sql);
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				
			}
			return;
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
			}
			
		}
		
		System.out.println("转账完毕！");
	}
}