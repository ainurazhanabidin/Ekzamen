package com.company;

public class Car extends Tehnika implements Driving{
    private String Color;

    public Car(String name, String color) {
        super(name);
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public void method1() {

        System.out.println(getName()+" is "+ getColor());
    }

    @Override
    public void tehnikaDriving() {
        System.out.println(getName()+" drivining the finish");

    }

    @Override
    public String toString() {
        return "Car{" +
                "Color='" + Color + '\'' +
                "} " + super.toString();
    }
}
