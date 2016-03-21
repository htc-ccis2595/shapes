package edu.htc;

import static org.junit.Assert.assertEquals;

import edu.htc.Circle;
import org.junit.Test;
/**
 * Test for Circle class methods
 */
public class CircleTest {
    @Test
    public void getArea() {
        Circle circle = new Circle(5);
        double res = circle.getArea();
        assertEquals(78.5, res, 0.01);
    }

    @Test
    public void getCircumference() {
        Circle circle = new Circle(3);
        double res = circle.getCircumference();
        assertEquals(18.84, res, 0.01);
    }

}
