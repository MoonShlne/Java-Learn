package com.myself04.set;

import java.util.Objects;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/19 20:40
 */
public class Person implements Comparable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof  Person){
//            Person person =(Person)  o;
//            if (this.getAge()==person.age){
//                return 0;
//            }
//            else {
//                return -(person.age-this.age);
//            }
//        }
//        throw  new RuntimeException();
//    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            if (!Objects.equals(this.getName(), ((Person) o).getName())) {
                return this.getName().compareTo(((Person) o).getName());
            }
            else {
                return  (this.age-((Person) o).age);
            }

        }
        throw new RuntimeException();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
