package com.myself08._interface.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 16:21
 */
public class Developer {
private  String name;
private  int age;
public  Developer(){}
    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void  takingVehicle( Vehicle vehicle){
        vehicle.run();
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
