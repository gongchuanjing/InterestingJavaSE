package tk.chuanjing.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ChuanJing
 * @date 2019年4月13日 上午10:03:40
 * @version 1.0
 */
public class D20190413_NumberToRMB {
    private static String[] UNIT = { "元", "万", "亿" };
    private static String[] UNIT2 = { "千", "百", "十" };

    private static final String ZERO = "零";

    private static String[] NUM = { "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾" };

    public static void main(String[] args) {
//        System.out.println("转换56489.529=" + parseCharsToRMB("56489.529"));目前不支持小数点
        System.out.println("转换56489=" + parseCharsToRMB("56489"));
    }
    
    /**
     * 转换一串字符
     * 
     * @param str
     * @return
     */
    public static String parseCharsToRMB(String str) {
        if (!isNumber(str)) {
            throw new IllegalArgumentException("参数不正确，必须为数字");
        }
        StringBuffer buffer = new StringBuffer();
        int count = 0;
        for (int i = str.length(); i > 0; i -= 4, count++) {
            String char4 = null;
            if (i - 4 < 0) {
                System.out.println("start=" + 0 + ".end=" + i);
                char4 = str.substring(0, i);
                buffer.insert(0, parse4CharsToRMB(char4) + UNIT[count]);
                break;
            }
            System.out.println("start=" + (i - 4) + ".end=" + i);
            char4 = str.substring(i - 4, i);
            buffer.insert(0, parse4CharsToRMB(char4) + UNIT[count]);

        }
        return buffer.toString();
    }

    /**
     * 转换4位字符
     * 
     * @param str
     * @return
     */
    public static String parse4CharsToRMB(String str) {
        if (str.length() > 4 || !isNumber(str)) {
            throw new IllegalArgumentException("参数不正确,str应该为不大于4位的字符");
        }
        StringBuffer result = new StringBuffer();
        int startUNIT = getStartUNIT(str.length());

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                if (i == 0) {
                    result.append(ZERO);
                } else {
                    appendZero(result, i);
                }
                startUNIT++;
            } else {
                int index = Integer.parseInt(String.valueOf(str.charAt(i))) - 1;
                result.append(NUM[index]);
                if (startUNIT < UNIT2.length) {
                    result.append(UNIT2[startUNIT]);
                    startUNIT++;
                }
            }
        }
        return result.toString();
    }

    /**
     * 获取起始位置
     * 
     * @param strLength
     * @return
     */
    public static int getStartUNIT(int strLength) {
        switch (strLength) {
        case 4:
            return 0;
        case 3:
            return 1;
        case 2:
            return 2;
        case 1:
            return 3;
        default:
            return 0;
        }
    }

    /**
     * 0是特殊的。所以单独一个方法添加0
     * 
     * @param buffer
     * @param index
     * @return
     */
    private static StringBuffer appendZero(StringBuffer buffer, int index) {
        System.out.println("buffer=" + buffer);
        String before = buffer.substring(index, index + 1);
        System.out.println("before=" + before);
        if (before.equals(ZERO)) {
            return buffer;
        } else {
            buffer.append(ZERO);
        }
        return buffer;
    }

    /**
     * 判断是否为数字字符串
     * 
     * @param str
     * @return
     */
    public static boolean isNumber(String str) {
        if (str != null && str.length() > 0) {
            Pattern pattern = Pattern.compile("[0-9]*");
            Matcher m = pattern.matcher(str);
            if (m.find()) {
                return true;
            }
            return false;
        }
        return false;
    }
}