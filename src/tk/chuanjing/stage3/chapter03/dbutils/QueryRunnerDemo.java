package tk.chuanjing.stage3.chapter03.dbutils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import tk.chuanjing.stage3.utils.JDBCUtilsConfig;

/**
 * @author ChuanJing
 * @date 2017年5月12日 下午10:43:27
 * @version 1.0
 */
public class QueryRunnerDemo {

	private static Connection conn = JDBCUtilsConfig.getConnection();

	public static void main(String[] args) throws SQLException {
//		insert();
//		update();
//		delete();
		
//		arrayHandler();
//		arrayListHandler();
//		beanHandler();
//		beanListHandler();
//		columnListHandler();
		scalarHandler();
//		mapHandler();
//		mapListHandler();
	}

	private static void mapListHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		List<Map<String, Object>> list = queryRunner.query(conn, sql, new MapListHandler());
		for (Map<String, Object> map : list) {
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				System.out.print(key + " : " + map.get(key) + "\t\t");
			}
			System.out.println();
		}
		DbUtils.closeQuietly(conn);
	}

	private static void mapHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		Map<String, Object> map = queryRunner.query(conn, sql, new MapHandler());
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		DbUtils.closeQuietly(conn);
	}

	private static void scalarHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
//		String sql = "SELECT count(*) FROM sort;";
//		long total = queryRunner.query(conn, sql, new ScalarHandler<Long>());
		String sql = "SELECT AVG(sprice) FROM sort;";
		Double total = queryRunner.query(conn, sql, new ScalarHandler<Double>());
		System.out.println(total);
		DbUtils.closeQuietly(conn);
	}

	private static void columnListHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		List<Object> list = queryRunner.query(conn, sql, new ColumnListHandler<Object>("sname"));
		for (Object obj : list) {
			System.out.println(obj);
		}
		DbUtils.closeQuietly(conn);
	}

	private static void beanListHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		List<Sort> list = queryRunner.query(conn, sql, new BeanListHandler<Sort>(Sort.class));
		for (Sort sort : list) {
			System.out.println(sort);
		}
		DbUtils.closeQuietly(conn);
	}

	private static void beanHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		Sort sort = queryRunner.query(conn, sql, new BeanHandler<Sort>(Sort.class));
		System.out.println(sort);
		DbUtils.closeQuietly(conn);
	}

	private static void arrayListHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		List<Object[]> query = queryRunner.query(conn, sql, new ArrayListHandler());
		for (Object[] objs : query) {
			for (Object obj : objs) {
				System.out.print(obj + "\t\t");
			}
			System.out.println();
		}
		DbUtils.closeQuietly(conn);
	}

	private static void arrayHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		Object[] query = queryRunner.query(conn, sql, new ArrayHandler());
		System.out.println(Arrays.toString(query));
		DbUtils.closeQuietly(conn);
	}

	private static void delete() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "DELETE FROM sort WHERE sid = ?;";
		int row = queryRunner.update(conn, sql, 8);
		System.out.println(row + "行受影响");
		DbUtils.closeQuietly(conn);
	}

	private static void update() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "UPDATE sort SET sname=?,sprice=?,sdesc=? WHERE sid = 4;";
		Object[] params = {"花卉", 666, "母亲节康乃馨"};
		int row = queryRunner.update(conn, sql, params);
		System.out.println(row + "行受影响");
		DbUtils.closeQuietly(conn);
	}

	private static void insert() throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		
		String sql = "INSERT INTO sort(sname, sprice, sdesc) VALUES(?, ?, ?);";
		Object[] params = {"健身器材", 1999.88, "健康是生命之本"};
		int row = queryRunner.update(conn , sql, params);
		System.out.println(row + "行受影响");
		DbUtils.closeQuietly(conn);
	}

}
