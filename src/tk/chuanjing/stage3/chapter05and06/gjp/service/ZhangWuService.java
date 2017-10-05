package tk.chuanjing.stage3.chapter05and06.gjp.service;

import java.util.List;

import tk.chuanjing.stage3.chapter05and06.gjp.dao.ZhangWuDao;
import tk.chuanjing.stage3.chapter05and06.gjp.domain.ZhangWu;

/**
 * @author ChuanJing
 * @date 2017年5月15日 下午4:55:47
 * @version 1.0

	业务层类
 *  接收上一层,控制层controller的数据
 *  经过计算,传递给dao层,操作数据库
 *  调用dao层中的类,类成员位置,创建Dao类的对象
 */
public class ZhangWuService {

	private ZhangWuDao zhangWuDao = new ZhangWuDao();
	
	/**
	 * 定义方法,实现查询所有的账务数据
	 * 此方法,由控制层调用, 去调用dao层的方法
	 * 返回存储ZhangWu对象的List集合
	 * @return
	 */
	public List<ZhangWu> selectAll() {
		return zhangWuDao.selectAll();
	}
	
	/**
	 * 定义方法,实现条件查询账务
	 * 方法由控制层调用,传递2个日期字符串
	 * 调用dao层的方法,传递2个日期字符串
	 * 获取到查询结果集
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<ZhangWu> select(String startDate, String endDate) {
		return zhangWuDao.select(startDate, endDate);
	}
	
	/**
	 * 定义方法，实现添加账务
	 * 是由控制层调用，传递ZhangWu对象
	 * @param zw
	 * @return
	 */
	public int addZhangWu(ZhangWu zw) {
		return zhangWuDao.addZhangWu(zw);
	}
	
	/**
	 * 定义方法，实现编辑账务
	 * 由控制层调用，传递ZhangWu对象
	 * 调用dao层的方法，传递ZhangWu对象
	 * @param zw
	 * @return
	 */
	public int editZhangWu(ZhangWu zw) {
		return zhangWuDao.editZhangWu(zw);
	}
	
	/**
	 * 定义方法，实现删除账务功能
	 * 由控制层调用，传递主键id
	 * 调用dao层方法，传递主键id
	 * @param zwid
	 * @return
	 */
	public int deleteZhangWu(int zwid) {
		return zhangWuDao.deleteZhangWu(zwid);
	}
}
