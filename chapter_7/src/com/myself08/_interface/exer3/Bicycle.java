package com.myself08._interface.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 16:32
 */
public class Bicycle extends  Vehicle{

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("蹬蹬自行车");
    }
}
