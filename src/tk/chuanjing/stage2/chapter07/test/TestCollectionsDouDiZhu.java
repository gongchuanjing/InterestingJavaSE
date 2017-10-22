package tk.chuanjing.stage2.chapter07.test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ChuanJing
 * @date 2017年4月9日 下午6:28:40
 * @version 1.0

	模拟斗地主发牌 
 	
 	买牌
 	洗牌
 	发牌
 */
public class TestCollectionsDouDiZhu {

	public static void main(String[] args) {
		//买牌
		String[] arr = {"黑桃","红桃","方片","梅花"};
		String[] arr2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		ArrayList<String> box = new ArrayList<String>();
		//添加每张牌
		for (int i = 0; i < arr.length; i++) {
			//获取每一个花色
			for (int j = 0; j < arr2.length; j++) {
				//获取每一个数
				box.add(arr[i] + arr2[j]);
			}
			
		}
		box.add("大王");
		box.add("小王");
		System.out.println("共有牌" + box.size() + "张");
		
	 	//洗牌
		System.out.println("洗牌前：" + box);
		Collections.shuffle(box);
		System.out.println("洗牌后：" + box);
		
	 	//发牌
		ArrayList<String> 刘备 = new ArrayList<String>();
		ArrayList<String> 关羽 = new ArrayList<String>();
		ArrayList<String> 张飞 = new ArrayList<String>();
		ArrayList<String> 底牌 = new ArrayList<String>();
		
		//留三张底牌给地主
		for (int i = 0; i < box.size() - 3; i++) {
			/*
			 *  i = 0;i % 3 = 0;
			 *  i = 1;i % 3 = 1;
			 *  i = 2;i % 3 = 2;
			 *  i = 3;i % 3 = 0;
			 *  i = 4;i % 4 = 1;
			 *  i = 5;i % 5 = 2;
			 */
			
			if(i % 3 == 0) {
				刘备.add(box.get(i));
			}
			else if(i % 3 == 1) {
				关羽.add(box.get(i));
			}
			else if(i % 3 == 2) {
				张飞.add(box.get(i));
			}
		}
		
		for (int i = box.size() - 3; i < box.size(); i++) {
			底牌.add(box.get(i));
		}
		
		System.out.println("刘备：" + 刘备);
		System.out.println("关羽：" + 关羽);
		System.out.println("张飞：" + 张飞);
		System.out.println("底牌：" + 底牌);
	}
}