package com.myself01.string.exer2;

import org.junit.Test;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/11 12:21
 */
//题目1：模拟一个trim方法，去除字符串两端的空格。
public class StringTest {

    @Test
    public void test() {
        int began = 0;
        int end = 0;
        String str = " ad  hapfsp y  d   ";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                began = i;
                break;
            }

        }
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] != ' ') {
                end = i + 1;
                break;
            }
        }
        System.out.println(str.substring(began, end));


    }

    //题目2：将一个字符串进行反转。将字符串中指定部分进行反转。
    //      比如"abcdefg"反转为"abfedcg"
    String str = "abcdefg";

    public void StringChange(int began, int end) {
        char term = 0;
        char[] aimChar = str.toCharArray();
        for (int i = 0; i < (end-began); began++, end--) {
            term = aimChar[began];
            aimChar[began] = aimChar[end];
            aimChar[end] = term;


        }
        String str = new String(aimChar);
        System.out.println(str);
    }


    //    题目3：获取一个字符串在另一个字符串中出现的次数。
//    比如：获取"ab"在 "abkkcadkabkebfkabkskab" 中出现的次数
    public int getIndex(String str, String aim) {
        int count = 0;
        if (str.length() >= aim.length()) {
            int index = str.indexOf(aim);
            while (index >= 0) {
                count++;
                index = str.indexOf(aim, index + aim.length());
            }


        }
        return count;
    }

    //题目4：获取两个字符串中最大相同子串。比如：
    //      str1 = "abcwerthelloyuiodef";
    //      str2 = "cvhellobnm"
    //      提示：将短的那个串进行长度依次递减的子串与较长的串比较。
    public void  getEqual(String str1,String str2){


    }






    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.StringChange(2, 5);
        String s1 = new String("abkkcadkabkebfkabkskab");
        System.out.println(stringTest.getIndex(s1, "ab"));


    }
}
