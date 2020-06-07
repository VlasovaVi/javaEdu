package ru.victoria.classes.polymorphism;

public class Rectangle implements Figure, IHasName {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {

        return length * width;
    }

    @Override
    public double getPerimeter() {

        return (length + width) * 2;
    }

    @Override
    public String name() {
        return "rectangle";
    }
}
