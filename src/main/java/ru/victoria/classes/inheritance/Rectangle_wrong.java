package ru.victoria.classes.inheritance;

public class Rectangle_wrong {
    private double sideA;
    private double sideB;
    private double area;
    private double perimeter;

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public Rectangle_wrong(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = sideA * sideB;
        this.perimeter = (sideA + sideB) * 2;
    }
}
