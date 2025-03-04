package com.myself10._enum;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/20 15:11
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(EnumTest.SPRING);
    }


    private  final String name;
    private final   String interpret;

    private EnumTest(String name, String interpret) {
        this.name = name;
        this.interpret = interpret;
    }
    
   public final  static EnumTest SPRING = new EnumTest("春天","春暖花开");
   public final  static EnumTest SUMMER = new EnumTest("夏天","夏日燕燕");
   public final  static EnumTest AUTUMN = new EnumTest("秋天","秋高气爽");
   public final  static EnumTest WINTER = new EnumTest("冬天","冬天可美");


    @Override
    public String toString() {
        return "EnumTest{" +
                "name='" + name + '\'' +
                ", interpret='" + interpret + '\'' +
                '}';
    }
}
