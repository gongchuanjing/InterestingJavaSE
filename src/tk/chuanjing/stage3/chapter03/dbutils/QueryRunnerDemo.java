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
		/*
		 *  使用QueryRunner类,实现对数据表的 insert delete update
		 *  调用QueryRunner类的方法 update (Connection con, String sql, Object...param)
		 *  	Object...param 可变参数,Object类型,SQL语句会出现?占位符
		 *  	数据库连接对象,自定义的工具类传递
		 *  
		 *  判断insert,update,delete执行是否成功
		 *  对返回值row判断
		 *  if(row>0) 执行成功
		 */
//		insert();
//		update();
//		delete();
		
		
		/*
		 * QueryRunner数据查询操作:
		 *   调用QueryRunner类方法query(Connection con, String sql, ResultSetHandler r, Object..params)
		 *   	ResultSetHandler r 结果集的处理方式,传递ResultSetHandler接口实现类
		 *   	Object..params SQL语句中的?占位符
		 *   注意: query方法返回值,返回的是T 泛型, 具体返回值类型,跟随结果集处理方式变化
		 */
//		arrayHandler();
//		arrayListHandler();
//		beanHandler();
//		beanListHandler();
//		columnListHandler();
//		scalarHandler();
//		mapHandler();
		mapListHandler();
	}

	/**
	 * 结果集第八种处理方法,MapListHandler
	 * 将结果集每一行存储到Map集合,键:列名,值:数据
	 * Map集合过多,存储到List集合
	 */
	private static void mapListHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		
		//调用方法query,传递结果集实现类MapListHandler，返回值List集合, 存储的是Map集合
		List<Map<String, Object>> list = queryRunner.query(conn, sql, new MapListHandler());
		
		//遍历集合list
		for (Map<String, Object> map : list) {
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				System.out.print(key + " : " + map.get(key) + "\t\t");
			}
			System.out.println();
		}
		DbUtils.closeQuietly(conn);
	}

	/**
	 *  结果集第七种处理方法,MapHandler
	 *  将结果集第一行数据,封装到Map集合中
	 *  Map<键,值> 键:列名  值:这列的数据
	 */
	private static void mapHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		
		//调用方法query,传递结果集实现类MapHandler， 返回值: Map集合,Map接口实现类, 泛型
		Map<String, Object> map = queryRunner.query(conn, sql, new MapHandler());
		Set<String> keySet = map.keySet();
		
		//遍历Map集合
		for (String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		DbUtils.closeQuietly(conn);
	}

	/**
	 *  结果集第六种处理方法,ScalarHandler
	 *  对于查询后,只有1个结果，比如聚合函数
	 */
	private static void scalarHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
//		String sql = "SELECT count(*) FROM sort;";
//		long total = queryRunner.query(conn, sql, new ScalarHandler<Long>());
		
		String sql = "SELECT AVG(sprice) FROM sort;";
		//调用方法query,传递结果集处理实现类ScalarHandler
		Double total = queryRunner.query(conn, sql, new ScalarHandler<Double>());
		
		System.out.println(total);
		DbUtils.closeQuietly(conn);
	}

	/**
	 *  结果集第五种处理方法,ColumnListHandler
	 *  结果集,指定列的数据,存储到List集合
	 *  List<Object> 每个列数据类型不同
	 */
	private static void columnListHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		
		//调用方法 query,传递结果集实现类ColumnListHandler，实现类构造方法中,使用字符串的列名
		List<Object> list = queryRunner.query(conn, sql, new ColumnListHandler<Object>("sname"));
		for (Object obj : list) {
			System.out.println(obj);
		}
		DbUtils.closeQuietly(conn);
	}

	/**
	 *  结果集第四种处理方法, BeanListHandler
	 *  结果集每一行数据,封装JavaBean对象
	 *  多个JavaBean对象,存储到List集合
	 */
	private static void beanListHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		
		//调用方法query,传递结果集处理实现类BeanListHandler
		List<Sort> list = queryRunner.query(conn, sql, new BeanListHandler<Sort>(Sort.class));
		for (Sort sort : list) {
			System.out.println(sort);
		}
		DbUtils.closeQuietly(conn);
	}

	/**
	 *  结果集第三种处理方法,BeanHandler
	 *  将结果集的第一行数据,封装成JavaBean对象
	 *  注意: 被封装成数据到JavaBean对象, Sort类必须有空参数构造
	 */
	private static void beanHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		
		//调用方法,传递结果集实现类BeanHandler，BeanHandler(Class<T> type)
		Sort sort = queryRunner.query(conn, sql, new BeanHandler<Sort>(Sort.class));
		System.out.println(sort);
		DbUtils.closeQuietly(conn);
	}

	/**
	 *  结果集第二种处理方法,ArrayListHandler
	 *  将结果集的每一行,封装到对象数组中, 出现很多对象数组
	 *  对象数组存储到List集合
	 */
	private static void arrayListHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		
		//调用query方法,结果集处理的参数上,传递实现类ArrayListHandler
		//方法返回值 每行是一个对象数组,存储到List
		List<Object[]> query = queryRunner.query(conn, sql, new ArrayListHandler());
		
		//集合的遍历
		for (Object[] objs : query) {
			
			//遍历对象数组
			for (Object obj : objs) {
				System.out.print(obj + "\t\t");
			}
			System.out.println();
		}
		DbUtils.closeQuietly(conn);
	}

	/**
	 *  结果集第一种处理方法, ArrayHandler
	 *  将结果集的第一行存储到对象数组中  Object[]
	 */
	private static void arrayHandler() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "SELECT * FROM sort;";
		
		//调用方法query执行查询,传递连接对象,SQL语句,结果集处理方式的实现类，返回对象数组
		Object[] query = queryRunner.query(conn, sql, new ArrayHandler());
		
		System.out.println(Arrays.toString(query));
		DbUtils.closeQuietly(conn);
	}

	/**
	 *  定义方法,使用QueryRunner类的方法delete将数据表的数据删除
	 */
	private static void delete() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "DELETE FROM sort WHERE sid = ?;";
		int row = queryRunner.update(conn, sql, 8);
		System.out.println(row + "行受影响");
		DbUtils.closeQuietly(conn);
	}

	/**
	 *  定义方法,使用QueryRunner类的方法update将数据表的数据修改
	 */
	private static void update() throws SQLException {
		QueryRunner  queryRunner = new QueryRunner();
		String sql = "UPDATE sort SET sname=?,sprice=?,sdesc=? WHERE sid = 4;";
		Object[] params = {"花卉", 666, "母亲节康乃馨"};
		int row = queryRunner.update(conn, sql, params);
		System.out.println(row + "行受影响");
		DbUtils.closeQuietly(conn);
	}

	/**
	 * 定义方法,使用QueryRunner类的方法update向数据表中,添加数据
	 */
	private static void insert() throws SQLException {
		//创建QueryRunner类对象
		QueryRunner queryRunner = new QueryRunner();
		
		String sql = "INSERT INTO sort(sname, sprice, sdesc) VALUES(?, ?, ?);";
		
		//将三个?占位符的实际参数,写在数组中
		Object[] params = {"健身器材", 1999.88, "健康是生命之本"};
		
		//调用QueryRunner类的方法update执行SQL语句
		int row = queryRunner.update(conn , sql, params);
		
		System.out.println(row + "行受影响");
		DbUtils.closeQuietly(conn);
	}

}
