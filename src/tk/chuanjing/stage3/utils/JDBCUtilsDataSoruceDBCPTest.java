package tk.chuanjing.stage3.utils;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

/**
 * @author ChuanJing
 * @date 2017年5月14日 上午11:36:30
 * @version 1.0

	测试写好的工具类,
 *  提供的是一个DataSource接口的数据源
 *  QueryRunner类构造方法,接收DataSource接口的实现类
 *  后面,调用方法update,query,无需传递他们Connection连接对象
 */
public class JDBCUtilsDataSoruceDBCPTest {
	
	private static QueryRunner qr = new QueryRunner(JDBCUtilsDataSoruceDBCP.getDataSoruce());

	public static void main(String[] args) {
//		insert();
		select();
	}
	
	private static void select() {
		String sql = "SELECT * FROM sort;";
		
		try {
			List<Object[]> list = qr.query(sql, new ArrayListHandler());
			for (Object[] objects : list) {
				for (Object object : objects) {
					System.out.print(object + "\t\t");
				}
				System.out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("查询失败！");
		}
	}

	private static void insert() {
		String sql = "INSERT INTO sort(sname, sprice, sdesc) VALUES(?,?,?);";
		Object[] params = {"水果", 39.9, "核桃补脑"};
		
		try {
			int row = qr.update(sql, params);
			System.out.println(row + "行成功");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("插入失败");
		}
	}

}
