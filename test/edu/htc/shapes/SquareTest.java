package edu.htc.shapes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for Square class methods
 */
public class SquareTest {

    @Test
    public void getCircumference(){
        Square square = new Square(10);
        double circumference = square.getCircumference();
        assertEquals(40, circumference, 0.01);
    }

    @Test
    public void getCircumference2(){
        Square square = new Square(20);
        double circumference = square.getCircumference();
        assertEquals(80, circumference, 0.01);
    }

    @Test
    public void getArea(){
        Square square = new Square(10);
        double area = square.getArea();
        assertEquals(100, area, 0.01);
    }

    @Test
    public void getArea2(){
        Square square = new Square(20);
        double area = square.getArea();
        assertEquals(400, area, 0.01);
    }

}
