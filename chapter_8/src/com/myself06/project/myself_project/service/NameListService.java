package com.myself06.project.myself_project.service;

import com.myself06.project.myself_project.domain.*;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/27 14:18
 * 功能：负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * 说明：
 * employees用来保存公司所有员工对象
 * NameListService()构造器：
 * 根据项目提供的Data类构建相应大小的employees数组
 * 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
 * 将对象存于数组中
 * Data类位于com.myself.team.service包中
 */
public class NameListService {

    private Employee[] employee;   //所有员工对象

    public NameListService() {
        this.employee = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            int occupation = Integer.parseInt(Data.EMPLOYEES[i][0]);

            //person
            String[] oneEmployee = Data.EMPLOYEES[i];
            int id = Integer.parseInt(oneEmployee[1]);
            String name = oneEmployee[2];
            int age = Integer.parseInt(oneEmployee[3]);
            int salary = Integer.parseInt(oneEmployee[4]);


            if (occupation == 10) {   //EMPLOYEE
                Employee employee1 = new Employee(id, name, age, salary);
                employee[i] = employee1;
            } else if (occupation == 11) { //PROGRAMMER
                Programmer p = new Programmer(id, name, age, salary, getEquipment(i));
                p.setStatus(Status.FREE);
                employee[i] = p;
            } else if (occupation == 12) {
                double bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                Designer designer = new Designer(id, name, age, salary, getEquipment(i), bonus);
                designer.setStatus(Status.FREE);
                employee[i] = designer;
            } else if (occupation == 13) {
                double bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                int stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                Architect architect = new Architect(id, name, age, salary, getEquipment(i), bonus, stock);
                architect.setStatus(Status.FREE);
                employee[i] = architect;
            }
        }
    }

    private Equipment getEquipment(int i) {
        //Equipment
//        Equipment e = null;
        int equipment = Integer.parseInt(Data.EQIPMENTS[i][0]);
        String element2 = Data.EQIPMENTS[i][1];
        String element3 = Data.EQIPMENTS[i][2];
        if (equipment == 21) {//PC
            return new PC(element2, element3);
        } else if (equipment == 22) {    //NoteBook
            double price = Double.parseDouble(Data.EQIPMENTS[i][2]);
            return new NoteBook(element2, price);
        } else if (equipment == 23) {
            return new Printer(element2, element3);
        }
        return null;
    }

    public Employee[] getALLEmployee() {
        return employee;
    }

    public Employee getEmployee(int id){
        for (int i = 0; i < employee.length; i++) {
            if (id == employee[i].getId()){
                return employee[i];
            }
        }
        throw new TeamException("找不到员工");
    }

}



