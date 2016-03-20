package edu.htc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Test for Circle class methods
 */
public class CircleTest {
    @Test
    public void getCircleArea_radiusIsOne(){

        Circle circle = new Circle(1.0);
        Double areaResult = circle.getArea();
        assertEquals(3.14,areaResult,0.01);

    }

    @Test
    public void getCircleArea_radiusIsFive(){
        Circle circle = new Circle(5.0);
        Double areaResult = circle.getArea();
        assertEquals(78.5, areaResult, 0.01);

    }

    @Test
    public void getCircleCircumference_radiusIsOne(){
        Circle circle = new Circle(1.0);
        Double circumferenceResult = circle.circumference();
        assertEquals(6.28, circumferenceResult,0.01);
    }

    @Test
    public void getCircleCircumference_radiusIsTwelve(){
        Circle circle = new Circle(12.0);
        Double CircumferenceResult =  circle.circumference();
        assertEquals(75.36, CircumferenceResult, 0.01);
    }



}
