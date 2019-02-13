package tk.chuanjing.interview;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author ChuanJing
 * @date 2019年2月13日 下午3:13:38
 * @version 1.0

1到100循环，把奇数
 */
public class Interview20190213 {

	public static void main(String[] args) {
		int arr[] = new int[50];
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int j = 7;
		int k = 0;
		
		for (int i = 1; i <= 100; i++) {
			if( i % 2 == 0 ) {
				hashMap.put(j, i);
				j++;
			}else {
				arr[k] = i;
				k++;
			}
		}
		
		System.out.println("奇数：" + Arrays.toString(arr));
		System.out.println("偶数：" + hashMap);
	}

}
