package tk.chuanjing.stage3.utils;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * @author ChuanJing
 * @date 2017年5月14日 上午11:22:51
 * @version 1.0
 */
public class JDBCUtilsDataSoruceDBCP {

	//创建出BasicDataSource类对象
	private static BasicDataSource dataSource = new BasicDataSource();
	
	//静态代码块,对象BasicDataSource对象中的配置,自定义
	static {
		//数据库连接信息,必须的
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/mybsae");
		dataSource.setUsername("root");
		dataSource.setPassword("12345");
		
		//对象连接池中的连接数量配置,可选的
		dataSource.setInitialSize(10);//初始化的连接数
		dataSource.setMaxActive(8);//最大连接数量
		dataSource.setMaxIdle(5);//最大空闲数
		dataSource.setMinIdle(1);//最小空闲
	}
	
	//定义静态方法,返回BasicDataSource类的对象
	public static DataSource getDataSoruce() {
		return dataSource;
	}
}
