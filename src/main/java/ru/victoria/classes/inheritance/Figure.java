package ru.victoria.classes.inheritance;


public class Figure {
    private double area;
    private double perimeter;

    public Figure(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {

        return area;
    }

    public double getPerimeter() {

        return perimeter;
    }
}
