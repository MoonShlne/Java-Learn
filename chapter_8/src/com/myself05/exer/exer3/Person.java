package com.myself05.exer.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/25 18:53
 */
public class Person {
    private  String name;
    private  int  lifeValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue >0){
            this.lifeValue = lifeValue;
        }
        else {
            throw  new NoLifeValueException("血不能为负数");
        }
    }

    public Person() {
    }

    public Person(String name, int lifeValue) {
        this.name = name;
        setLifeValue(lifeValue);
    }
}
