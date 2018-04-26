package tk.chuanjing.stage1.chapter08;

import java.util.Random;

/**
 * 已知一个String数组arr，里面元素有{“a”,“s”,“d”,“f”,“a”,“d”,“2”,“3”,“8”},
      根据里面的元素随机生成一个长度为5的字符串，
      然后将该字符串中相同的元素去重，最后再返序输出到控制台上
 */
public class HomeWork62 {
    public static void main(String[] args) {
        String[] arr = {"a", "s", "d", "f", "a", "d", "2", "3", "8"};
        Random r = new Random();
        String str = "";
        for (int i = 0; i < 5; i++) {
            int a = r.nextInt(arr.length);
            str += arr[a];
        }
        System.out.println(str);
		
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!str1.contains((c + ""))) {
                str1 += c;
            }
        }
        System.out.println(str1);
        
        for (int i = str1.length()-1; i >= 0; i--) {
            char c1 = str1.charAt(i);
            System.out.print(c1);
        }
    }
}
