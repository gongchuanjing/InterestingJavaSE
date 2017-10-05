package tk.chuanjing.stage3.chapter05and06.gjp.controller;

import java.util.List;

import tk.chuanjing.stage3.chapter05and06.gjp.domain.ZhangWu;
import tk.chuanjing.stage3.chapter05and06.gjp.service.ZhangWuService;

/**
 * @author ChuanJing
 * @date 2017年5月15日 下午4:54:09
 * @version 1.0

	控制器层
 *  接收试图层的数据,数据传递给service层
 *  成员位置,创建service对象
 */
public class ZhangWuController {

	private ZhangWuService zhangWuService = new ZhangWuService();
	
	/**
	 * 控制层类定义方法,实现查询所有的账务数据
	 * 方法由试图层调用,方法调用service层
	 * @return
	 */
	public List<ZhangWu> selectAll() {
		return zhangWuService.selectAll();
	}
	
	/**
	 * 定义方法,实现条件查询账务
	 * 方法由试图层调用,传递两个日期的字符串
	 * 调用service层的方法,传递两个日期字符串,获取结果集
	 * 结果集返回给试图
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<ZhangWu> select(String startDate, String endDate) {
		return zhangWuService.select(startDate, endDate);
	}
	
	/**
	 * 定义方法，实现账务添加功能
	 * 由视图层调用，传递参数(传递过来的参数不能是5个数据，传递的是一个ZhangWu类型的对象)
	 * 本方法调用service层的方法，传递ZhangWu对象，获取到添加后的结果集(添加成功影响的行数，int)
	 * @param zw
	 * @return
	 */
	public int addZhangWu(ZhangWu zw) {
		return zhangWuService.addZhangWu(zw);
	}
	
	/**
	 * 定义方法，实现编辑账务功能
	 * 由视图层调用，传递参数，也是ZhangWu对象
	 * 调用service层的方法，也是ZhangWu对象
	 * @param zw
	 * @return
	 */
	public int editZhangWu(ZhangWu zw) {
		return zhangWuService.editZhangWu(zw);
	}
	
	/**
	 * 定义方法，实现删除功能
	 * 视图层调用，传递int类型主键
	 * 调用service层方法，传递int主键
	 * @param zwid
	 * @return
	 */
	public int deleteZhangWu(int zwid) {
		return zhangWuService.deleteZhangWu(zwid);
	}
}
