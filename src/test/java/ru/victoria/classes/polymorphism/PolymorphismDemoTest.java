package ru.victoria.classes.polymorphism;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.victoria.classes.polymorphism.PolymorphismDemo.compareFigures;

/**
 * @author Rakhmankulov Ed
 * @version 1
 */
public class PolymorphismDemoTest {

    @Test
    public void testCompareFigures() {
        assertEquals(compareFigures(new Circle(10), new Circle(9)), 1);
        assertEquals(compareFigures(new Circle(8), new Circle(9)), -1);
        assertEquals(compareFigures(new Triangle(1,2,3), new Triangle(2,3,1)), 0);
        assertEquals(compareFigures(new Triangle(1,2,3), new Triangle(2,3,4)), -1);
        assertEquals(compareFigures(new Rectangle(4,4), new Rectangle(8,2)), -1);
        assertEquals(compareFigures(new Rectangle(3,4), new Triangle(3,4, 5)), 1);
        assertEquals(compareFigures(new Rectangle(3,2), new Triangle(3,4, 5)), -1);
    }

}