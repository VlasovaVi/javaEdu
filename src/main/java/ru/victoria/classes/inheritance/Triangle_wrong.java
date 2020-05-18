package ru.victoria.classes.inheritance;

public class Triangle_wrong {
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;
    private double perimeter;

    public Triangle_wrong(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.perimeter = sideA + sideB + sideC;
        this.area = Math.sqrt(this.perimeter/2 * (this.perimeter/2 - sideA) * (this.perimeter/2 - sideB) * (this.perimeter/2 - sideC));
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
