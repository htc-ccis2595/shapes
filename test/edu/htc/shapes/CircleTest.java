package edu.htc.shapes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Test for Circle class methods
 */
public class CircleTest {


    @Test
    public void getCircumference() {
        Circle circle = new Circle(10);
        double circumference = circle.getCircumference();
        assertEquals(62.8, circumference, 0.01);

    }

    @Test
    public void getCircumference2() {
        Circle circle = new Circle(20);
        double circumference = circle.getCircumference();
        assertEquals(125.6, circumference, 0.01);

    }

    @Test
    public void getArea(){
        Circle circle = new Circle(10);
        double area = circle.getArea();
        assertEquals(314, area, 0.01);
    }

    @Test
    public void getArea2(){
        Circle circle = new Circle(20);
        double area = circle.getArea();
        assertEquals(1256, area, 0.01);
    }








}
