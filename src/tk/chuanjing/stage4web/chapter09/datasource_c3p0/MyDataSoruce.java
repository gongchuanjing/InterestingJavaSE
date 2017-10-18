package tk.chuanjing.stage4web.chapter09.datasource_c3p0;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.sql.DataSource;

import tk.chuanjing.stage3.utils.JDBCUtilsConfig;

/**
 * 自定义连接池
 * @author ChuanJing
 * @date 2017年5月29日 下午3:23:10
 * @version 1.0
 */
public class MyDataSoruce implements DataSource {

	// 创建一个List集合用于存放多个连接对象.
	private ArrayList<Connection> Conns = null;
	
	// 在程序开始的时候，初始化几个连接,将连接存放到list中.
	public MyDataSoruce() {
		Conns = new ArrayList<Connection>();
		
		// 初始化3个连接:
		for (int i = 0; i < 3; i++) {
			Conns.add(JDBCUtilsConfig.getConnection());
		}
	}
	
	// 获得连接的方法
	@Override
	public Connection getConnection() throws SQLException {
		if (Conns.size() <= 0) {
			for (int i = 0; i < 3; i++) {
				Conns.add(JDBCUtilsConfig.getConnection());
			}
		}
		
		Connection conn = Conns.remove(0);
		
		MyConnection myConnection = new MyConnection(conn, Conns);
		
//		return conn;
		return myConnection;
	}
	
	/**
	 * 归还连接的方法
	 * @param conn
	 
	public void addBack(Connection conn) {
		Conns.add(conn);
	}
	*/

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
