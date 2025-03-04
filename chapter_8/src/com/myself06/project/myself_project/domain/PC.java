package com.myself06.project.myself_project.domain;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/27 13:52
 */
public class PC implements Equipment {
    private String model;
    private String display;


    public  PC(){}

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
