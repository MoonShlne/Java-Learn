package com.myself07._abstract.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/17 16:56
 * （2）MyDate类包含:
 * private成员变量year,month,day；
 * 提供必要的构造器；
 * toDateString()方法返回日期对应的字符串：xxxx年xx月xx日
 */
public class MyDate {
    private final int year;
    private final int month ;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public  String toDateString(){
        return toString();
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
