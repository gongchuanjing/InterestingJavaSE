package tk.chuanjing.stage2.chapter07.errordemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ChuanJing
 * @date 2017年9月10日 下午9:16:35
 * @version 1.0

	需求：动手实现下斗地主的案例
	问题：已经把发的拍按照特定的顺序排序了，但打印出来还是没有顺序
	问题分析：在双层循环造牌的时候，外层循环应该是数字，内层循环应
			   该是花色，这样才能保证先是不同花色但数值相同的牌。
 */
public class Test04_DouDiZhu {
	public static void main(String[] args) {
		// 创建牌盒
		ArrayList<String> list = new ArrayList<>();
		list.add("大王");
		list.add("小王");
		
		// 买牌
		String[] arr1 = { "♠", "♥", "♦", "♣" };
		String[] arr2 = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3" };
		// 添加每张牌
		for (int i = 0; i < arr2.length; i++) {
			// 获取每一个花色
			for (int j = 0; j < arr1.length; j++) {
				// 获取每一个数
				list.add(arr1[j] + arr2[i]);
			}
		}
		System.out.println("54张" + list);

		// 查表法:通过索引排序取牌
		// 定义集合来装所有的索引
		ArrayList<Integer> indexs = new ArrayList<>();
		for (int i = 0; i < 54; i++) {
			indexs.add(i);
		}
		// 洗牌洗的是索引
		Collections.shuffle(indexs);

		// 发牌,其实发的是索引
		ArrayList<Integer> zhanSanIndex = new ArrayList<Integer>();
		ArrayList<Integer> liSiIndex = new ArrayList<Integer>();
		ArrayList<Integer> wangWuIndex = new ArrayList<Integer>();
		ArrayList<Integer> diPaiIndex = new ArrayList<Integer>();

		for (int i = 0; i < indexs.size(); i++) {
			if (i >= indexs.size() - 3) {
				diPaiIndex.add(indexs.get(i));
			} else {
				if (i % 3 == 0) {
					zhanSanIndex.add(indexs.get(i));

				} else if (i % 3 == 1) {
					liSiIndex.add(indexs.get(i));

				} else if (i % 3 == 2) {
					wangWuIndex.add(indexs.get(i));
				}
			}
		}
		//对索引进行排序
		Collections.sort(zhanSanIndex);
		Collections.sort(liSiIndex);
		Collections.sort(wangWuIndex);
		Collections.sort(diPaiIndex);
		
		//取牌
		ArrayList<String> zhanSan = new ArrayList<String>();
		ArrayList<String> liSi = new ArrayList<String>();
		ArrayList<String> wangWu = new ArrayList<String>();
		ArrayList<String> diPai = new ArrayList<String>();
		
		//去拍好顺序的规则里面去取牌
		for (int i = 0; i < zhanSanIndex.size(); i++) {
			//拿青霞的索引规则去取牌
			String string = list.get(zhanSanIndex.get(i));
			zhanSan.add(string);
		}
		for (int i = 0; i < liSiIndex.size(); i++) {
			String string = list.get(liSiIndex.get(i));
			liSi.add(string);
		}
		for (int i = 0; i < wangWuIndex.size(); i++) {
			String string = list.get(wangWuIndex.get(i));
			wangWu.add(string);
		}
		for (int i = 0; i < diPaiIndex.size(); i++) {
			String string = list.get(diPaiIndex.get(i));
			diPai.add(string);
		}
		
		System.out.println("张三的牌：" + zhanSan);
		System.out.println("李四的牌：" + liSi);
		System.out.println("王五的牌：" + wangWu);
		System.out.print("底牌："+diPai);
		
	}
}
