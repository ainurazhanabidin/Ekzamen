package com.company;

import java.util.SortedMap;

public class Bus extends Tehnika implements Driving{

    private int age;

    public Bus(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void method1() {
        System.out.println(getName() +" "+getAge());
    }

    @Override
    public void tehnikaDriving() {
        System.out.println(getName()+" driving in the streat");

    }

    @Override
    public String toString() {
        return "Bus{" +
                "age=" + age +
                "} " + super.toString();
    }
}
