package edu.htc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for Square class methods
 */
public class SquareTest {
    @Test
    public void getArea() {
        Square square = new Square(4);
        double res = square.getArea();
        assertEquals(16, res, 0.01);
    }
    @Test
    public void getPerimeter() {
        Square square = new Square(8);
        double res = square.getPerimeter();
        assertEquals(32, res, 0.01);
            }

}
