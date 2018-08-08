package tk.chuanjing.stage1.chapter06.test;

import java.util.Random;

/**
 * 定义长度为10的数组，给数组每一个元素赋值，值是1-20的随机数。要求不能重复。
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random rn=new Random();
        int count = 0;
        while(count < 10){
        	int temp=rn.nextInt(20)+1;
        	System.out.print(temp + "  ");
        	boolean flag = true;
        	for (int i : arr) {
				if(i == temp){
					flag = false;
					break;
				}
			}
        	if(flag){
        		arr[count] = temp;
        		count++;
        	}
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
