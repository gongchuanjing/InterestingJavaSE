package tk.chuanjing.stage1.chapter08;
import java.util.Random;

/*已知一个String数组arr，里面元素有{“a”,“s”,“d”,“f”,“a”,“d”,“2”,“3”,“8”},
        根据里面的元素随机生成一个长度为5的字符串，
        然后将该字符串中相同的元素去重，最后再返序输出到控制台上（8分）*/
public class HomeWork62 {
    public static void main(String[] args) {
        String[] arr = {"a", "s", "d", "f", "a", "d", "2", "3", "8"};
        Random r = new Random();
        String Str = "";
        for (int i = 0; i < 5; i++) {
            int i1 = r.nextInt(arr.length);
            Str += arr[i1];
        }
        System.out.println(Str);
		
        String Str1 = "";
        for (int i = 0; i < Str.length(); i++) {
            char c = Str.charAt(i);
            if (!Str1.contains((c + ""))) {
                Str1 += c;
            }
        }
        System.out.println(Str1);
        for (int i = Str1.length()-1; i >= 0; i--) {
            char c1 = Str1.charAt(i);
            System.out.print(c1);
        }
        }
    }
