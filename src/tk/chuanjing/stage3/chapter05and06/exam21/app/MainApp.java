package tk.chuanjing.stage3.chapter05and06.exam21.app;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import tk.chuanjing.stage3.chapter05and06.exam21.domain.Dept;
import tk.chuanjing.stage3.chapter05and06.exam21.domain.Employee;
import tk.chuanjing.stage3.chapter05and06.exam21.tools.JDBCUtils;

/**
 * 不要运行，没有连接数据库
 */
public class MainApp {
	public static void main(String[] args) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from employee where deptid is not null";
		List<Employee> empList = qr.query(sql, new BeanListHandler<Employee>(Employee.class));
		for(Employee e : empList){
			sql = "select * from dept where id = ?";
			Dept dept = qr.query(sql, new BeanHandler<Dept>(Dept.class),e.getDeptid());
			e.setDept(dept);
		}
		//遍历结果
		for(Employee e : empList){
			System.out.println(e.getName() + "\t" + e.getSex() + "\t" + e.getAge() + "\t" + e.getDept().getDeptname());
		}
	}
}
