package com.myself05.overload_args.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/30 18:42
 * 练习：可变形参的方法
 * <p>
 * n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest concat = new StringConCatTest();
        System.out.println(concat.Concat("---------", "a", "b", "c", "d"));
        concat.Concat("a");

    }

    public String Concat(String str, String... strs) {
//        if (strs != null) {
            String sout = "";
            for (int i = 0; i < strs.length; i++) {
                if (i == 0) {
                    sout = sout + strs[i];
                } else {
                    sout = sout + str + strs[i];
                }

//            }
//        } else {
//            return null;
        }
        return sout;

    }
}
