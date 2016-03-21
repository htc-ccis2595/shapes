package edu.htc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for Square class methods
 */
public class SquareTest {

    @Test
    public void getArea_SquareSideisTwo(){
        Square square = new Square(2);
        double result = square.getArea();
        assertEquals(4, result, 0.01);
    }

    @Test
    public void getPerimeter_SquareSideisOne(){
        Square square = new Square(1);
        double result = square.getPerimeter();
        assertEquals(4, result, 0.01);
    }
}
