package com.myself10._enum.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/20 16:21
 * （1）声明颜色枚举类Color：
 * - 声明final修饰的int类型的属性red,green,blue
 * - 声明final修饰的String类型的属性description
 * - 声明有参构造器Color(int red, int green, int blue,String description)
 * - 创建7个常量对象：红、橙、黄、绿、青、蓝、紫，
 * - 重写toString方法，例如：RED(255,0,0)->红色
 */
public enum Color {
    RED(255, 0, 0, "红"),
    ORANGE(255, 128, 0, "橙"),
    YELLOW(255, 255, 0, "黄"),
    GREEN(0, 255, 0, "绿"),
    CYAN(0, 255, 255, "青"),
    BLUE(0, 0, 255, "蓝"),
    PURPLE(128, 0, 255, "紫");

    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    private Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", description='" + description + '\'' +
                '}';
    }
}
