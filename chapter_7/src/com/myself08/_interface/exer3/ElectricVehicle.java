package com.myself08._interface.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 16:31
 */
public class ElectricVehicle extends  Vehicle implements  IPower{
    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void power() {
        System.out.println("电驴要充电");
    }

    @Override
    public void run() {
        System.out.println("电驴跑跑跑");
        power();
    }
}
