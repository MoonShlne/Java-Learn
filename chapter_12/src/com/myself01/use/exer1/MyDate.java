package com.myself01.use.exer1;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/27 22:40
 */
public class MyDate {
    private  int year;
    private  int month;
    private  int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(year, myDate.year) && Objects.equals(month, myDate.month) && Objects.equals(day, myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return   year + "--" +month +"--" + day  ;
    }
}
