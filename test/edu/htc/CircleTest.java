package edu.htc;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Test for Circle class methods
 */
public class CircleTest {

    @Test
    public void getArea(){
        Circle circle = new Circle(10);
        double area = circle.getArea();
        assertEquals(314, area, .001);
    }


    @Test
    public void getCircumference(){
        Circle circle = new Circle(10);
        double circumference = circle.getCircumference();
        assertEquals(62.8, circumference, .001);
    }
}
