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
     *
     * if lhs > rhs => 1
     * if lhs == rhs => 0
     * if lhs < rhs => -1
     */
    public static int compareFigures(Figure lhs, Figure rhs) {
            if (lhs instanceof Circle && rhs instanceof Circle){
                Circle cirL = (Circle) lhs;
                Circle cirR = (Circle) rhs;
                if(cirL.getPerimeter() > cirR.getPerimeter() ) {
                    return 1;
                }
                if(cirL.getPerimeter() == cirR.getPerimeter() ){
                    return 0;
                }
                if(cirL.getPerimeter() < cirR.getPerimeter()){
                    return -1;
                }
        }
        if (lhs instanceof Triangle && rhs instanceof Triangle){
            Triangle triangleL = (Triangle) lhs;
            Triangle triangleR = (Triangle) rhs;
            if(triangleL.getArea() > triangleR.getArea()){
                return 1;
            }
            if(triangleL.getArea() == triangleR.getArea()){
                return 0;
            }
            if(triangleL.getArea() < triangleR.getArea()){
                return -1;
            }

        }
        if (lhs instanceof Rectangle && rhs instanceof Rectangle){

            Rectangle rectangleL = (Rectangle) lhs;
            Rectangle rectangleR = (Rectangle) rhs;
            if(rectangleL.getPerimeter() > rectangleR.getPerimeter()){
                return 1;
            }
            if(rectangleL.getPerimeter() == rectangleR.getPerimeter()){
                return 0;
            }
            if(rectangleL.getPerimeter() < rectangleR.getPerimeter()){
                return -1;
            }
        }
        if(lhs instanceof Rectangle && rhs instanceof Triangle){
            Rectangle rectangleL = (Rectangle) lhs;
            Triangle triangleR = (Triangle) rhs;
            if(rectangleL.getPerimeter() > triangleR.getPerimeter()){
                return 1;
            }
            if(rectangleL.getPerimeter() == triangleR.getPerimeter()){
                return 0;
            }
            if(rectangleL.getPerimeter() < triangleR.getPerimeter()){
                return -1;
            }
        }
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
