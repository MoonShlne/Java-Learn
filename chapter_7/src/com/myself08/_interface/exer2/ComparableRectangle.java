package com.myself08._interface.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 16:13
 */
public class ComparableRectangle extends  Rectangle implements CompareObject {
    public ComparableRectangle(double wight, double height) {
        super(wight, height);
    }

    @Override

    public int compareTo(Object o) throws  RuntimeException {
        if (this==o){
            return  0;
        }
        else if (o instanceof  Rectangle) {
            Rectangle r = (Rectangle) o;
            if ( this.getHeight()* this.getWight()>r.getHeight()*r.getWight()){
                return  1;
            }
            else if (this.getHeight()* this.getWight()<r.getHeight()*r.getWight()){
                return -1;
            }
            else {return  0;}
        }
        else  {
            throw new  RuntimeException();
        }
    }
}
