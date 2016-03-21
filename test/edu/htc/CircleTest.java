package edu.htc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Test for Circle class methods
 */
public class CircleTest {

   @Test
    public void getArea_circleRadIsOne(){
       Circle circle = new Circle(1);
       double result = circle.getArea();
       assertEquals(3.14, result, 0.01);
   }

    @Test
    public void getCircumference_circleRadIsTwo(){
        Circle circle = new Circle(2);
        double result = circle.getCircumference();
        assertEquals(12.56, result, 0.01);
    }
    @Test
    public void getName_circleNameisSteve(){
        Circle circle = new Circle(1);
        circle.setName("Steve");
        assertEquals("Steve", circle.getName());
    }
}

