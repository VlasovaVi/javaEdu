package ru.victoria.classes.inheritance;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super(computeArea(sideA, sideB, sideC), sideA + sideB + sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private static double computeArea(double sideA, double sideB, double sideC) {
        double perimeter = sideA + sideB + sideC;
        return Math.sqrt(perimeter/2 * (perimeter/2 - sideA) * (perimeter/2 - sideB) * (perimeter/2 - sideC));
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
}
