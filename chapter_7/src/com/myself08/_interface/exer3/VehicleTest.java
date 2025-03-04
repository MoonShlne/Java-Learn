package com.myself08._interface.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 16:34
 * 提示：创建Vehicle[]数组，保存阿里工程师的三辆交通工具，并分别在工程师的takingVehicle()中调用。
 */
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle [] employeeVehicle =new Vehicle[]{
                new Car("BMW","屎壳郎红","西京CWX1994"),
                new ElectricVehicle("雅迪","失菊蓝"),
                new Bicycle("UnKnow","翡翠黑")
        };
        Developer d1 =new Developer("zzx",21);
        for (int i = 0; i < employeeVehicle.length; i++) {
            System.out.println(d1.toString());
            d1.takingVehicle(employeeVehicle[i]);


        }
        IPower.say();
        Car c =new Car();
        c.say1();
    }
}
