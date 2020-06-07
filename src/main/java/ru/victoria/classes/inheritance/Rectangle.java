package ru.victoria.classes.inheritance;

public class Rectangle extends Figure {
   private double length;
   private double width;

   public Rectangle(double length, double width) {
       super(length * width, 2 * (length + width));
       this.length = length;
       this.width = width;
   }
   public double getLength(){

       return length;
   }

   public double getWidth(){

       return width;
   }
}
