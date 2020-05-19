package ru.victoria.classes.inheritance;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.victoria.classes.inheritance.FiguresDemo.firstGreaterThanSecond;

/**
 * todo описание
 *
 * @author Rakhmankulov Ed
 * @version 1
 */
public class FiguresDemoTest {


    /*
    * проверяет что первое больше чем второе
    * Главный признак площадь, если площади равны, то сравниваем периметры
    * должен выполняться инвариант, что если a > b, то всегда b < a
    * */
    @Test
    public void testFirstGreaterThanSecond() {
        final Figure f1 = new Figure(1, 1);
        final Figure f2 = new Figure(1, 2);
        final Figure f3 = new Figure(2, 1);
        final Figure f4 = new Figure(2, 2);
        final Figure f5 = new Figure(2, 2);
        final Figure f6 = new Figure(1000, 1);
        final Figure f7 = new Figure(1, 2000);
        assertFalse(firstGreaterThanSecond(f1, f2));
        assertTrue(firstGreaterThanSecond(f2, f1));

        assertFalse(firstGreaterThanSecond(f2, f3));
        assertTrue(firstGreaterThanSecond(f3, f2));

        assertFalse(firstGreaterThanSecond(f3, f4));

        assertFalse(firstGreaterThanSecond(f4, f5));
        assertFalse(firstGreaterThanSecond(f5, f4));

        assertTrue(firstGreaterThanSecond(f6, f7));
        assertFalse(firstGreaterThanSecond(f7, f6));

    }
}