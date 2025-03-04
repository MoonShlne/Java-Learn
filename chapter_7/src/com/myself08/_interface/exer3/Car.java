package com.myself08._interface.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 16:27
 */
public class Car  extends  Vehicle implements IPower{
    private  String carNumber;

    public Car() {
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("轿车跑跑跑");
        power();
    }

    @Override
    public void power() {
        System.out.println("轿车是加油的");

    }
}
