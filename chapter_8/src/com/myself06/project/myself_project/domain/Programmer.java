package com.myself06.project.myself_project.domain;

import com.myself06.project.myself_project.service.Status;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/27 14:01
 */
public class Programmer extends Employee {
    private int memberId;   //mID
    private Status status;
    private Equipment equipment;

    public  Programmer(){}

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription() ;
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }
    protected String getMemberDetails() {
        return getMemberId() + "/" + getDetails();
    }

    public String getDetailsForTeam() {
        return getMemberDetails() + "\t程序员";
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }


}
