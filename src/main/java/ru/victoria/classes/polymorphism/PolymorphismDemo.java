package ru.victoria.classes.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(5,13,12);
        Rectangle r1 = new Rectangle(1,10);
        Circle c1 = new Circle(54.0);
        sendFiguresByXXX(t1, t2, r1, new Rectangle(2,2), c1);
    }

    /**
     * if lhs > rhs => 1
     * if lhs == rhs => 0
     * if lhs < rhs => -1
     */
    public static int compareFigures(Figure lhs, Figure rhs) {
        return 0;
    }

    public static void sendFiguresByXXX(Figure... figures) {
        for (Figure fig : figures) {
            System.out.println("***************************************");
            if (fig instanceof IHasName) {
                IHasName hasName = (IHasName)  fig;
                System.out.println("name() = " + hasName.name());
            }
            System.out.println("fig.getArea() = " + fig.getArea());
            System.out.println("fig.getPerimeter() = " + fig.getPerimeter());
        }
    }
}
