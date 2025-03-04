package com.myself08._interface.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 15:31
 */
public class ComparableCircle extends  Circle implements CompareObject {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this==o){
            return 0;
        }
        else if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            if (this.getRadius()>c.getRadius()){
                return 1;
            }
            else if (this.getRadius() == c.getRadius()){
                return 0;
            }
            else {return -1;}
        }
        else {
            return  -999999999;
        }

    }
}
