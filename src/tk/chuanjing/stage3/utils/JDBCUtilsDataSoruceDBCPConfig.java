package tk.chuanjing.stage3.utils;

import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;


/**
 * @author ChuanJing
 * @date 2017年5月15日 下午3:50:34
 * @version 1.0

	获取数据库连接的工具类
 *  实现连接池,dbcp连接池
 */
public class JDBCUtilsDataSoruceDBCPConfig {
	
	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	
	//创建BasicDataSource对象
	private static BasicDataSource dataSource = new BasicDataSource();
	
	//静态代码块,实现必要参数设置
	static {
		readConfig();
		
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(pwd);
		
		dataSource.setInitialSize(10);
		dataSource.setMaxActive(10);
		dataSource.setMaxIdle(5);
		dataSource.setMinIdle(2);
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	private static void readConfig() {
		try {
			InputStream is = JDBCUtilsDataSoruceDBCPConfig.class.getClassLoader().getResourceAsStream("jdbc.properties");
			Properties properties = new Properties();
			properties.load(is);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			pwd = properties.getProperty("pwd");
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("读取配置文件失败！");
		}
	}
}
