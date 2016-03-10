package edu.htc;

import static org.junit.Assert.assertEquals;

import com.sun.org.glassfish.external.arc.Taxonomy;
import org.junit.Test;
/**
 * Test for Circle class methods
 */
public class CircleTest {



    @Test
    public void GetArea_radiusIs1(){
        double area = 0;

        Shape circle = new Circle(1);
        area = circle.getArea();

        System.out.printf("\nArea of circle with radius 1 is %.2f", area);
        assertEquals(3.14, area, 0.01 );

    }
    @Test
    public void GetArea_radiusIs2(){
        double area = 0;

        Shape circle = new Circle(2);
        area = circle.getArea();

        System.out.printf("\nArea of circle with radius 2 is  %.2f", area);
        assertEquals(12.56, area, 0.01 );

    }

    @Test
    public void GetArea_radiusIs4(){
        double area = 0;

        Shape circle = new Circle(4);
        area = circle.getArea();

        System.out.printf("\nArea of circle with radius 4 is %.2f", area);
        assertEquals(50.26, area, 0.01 );

    }
    @Test
    public void GetCircumference_radiusIs1(){
        double circumference = 0;

        Shape circle = new Circle(1);
        circumference = circle.getCircumference();
        System.out.printf("\nCircumference of circle with radius 1 is %.2f", circumference);
        assertEquals(6.28, circumference, 0.01 );

    }
    @Test
    public void GetCircumference_radiusIs4(){
        double circumference = 0;

        Shape circle = new Circle(4);
        circumference = circle.getCircumference();
        System.out.printf("\nCircumference of circle with radius 4 is %.2f", circumference);
        assertEquals(25.13, circumference, 0.01 );
    }



}
