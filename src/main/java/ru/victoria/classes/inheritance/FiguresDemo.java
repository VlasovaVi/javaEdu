package ru.victoria.classes.inheritance;

import java.util.Comparator;

public class FiguresDemo {
    public static void main(String[] args) {
        Figure fig1 = new Figure(50.0, 10.0);
        Figure fig2 = new Figure(30.0, 22.1);
        Triangle_wrong triangleWrong = new Triangle_wrong(3,4,5);
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(20.0,  40.0);
        System.out.println("triangle.getArea() = " + triangle.getArea());
        System.out.println("rectangle.getArea() = " + rectangle.getArea());

        //fig1.area + fig2.area
        double fig12 = getSumArea(fig1, fig2);

        //fig1.area + triangle.area
        double fig1Triangle = getSumAreaTriangleEdition(fig1, triangleWrong);

        //
        //double triangleFig = getSumAreaTriangleEdition(triangleWrong, fig1);

        double triangFig1 = getSumArea(fig1, triangle);
        double fig2Triang = getSumArea(triangle, fig2);

    }

    public static double getSumArea(Figure fig1, Figure fig2) {

        return fig1.getArea() + fig2.getArea();
    }

    public static double getSumAreaTriangleEdition(Figure fig1, Triangle_wrong triangleWrong) {
        return fig1.getArea() + triangleWrong.getArea();
    }

    /**
     * if fig1.area > fig2.area -> true
     * if fig1.area == fig2.area -> compare peremiteres
     */
    public static boolean firstGreaterThanSecond(Figure fig1, Figure fig2) {
      if(fig1.getArea() > fig2.getArea()){
            return true;
        }
        else {
            return false;
        }
    }

}
