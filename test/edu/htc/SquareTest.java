package edu.htc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for Square class methods
 */
public class SquareTest {
    @Test
    public void getArea(){
        Square square = new Square(10);
        double area = square.getArea();
        assertEquals(100, area, .001);
    }

    @Test
    public void getPerimeter(){
        Square square = new Square(10);
        double perimeter = square.getPerimeter();
        assertEquals(40, perimeter, .001);
    }

}
