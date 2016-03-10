package edu.htc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for Square class methods
 */
public class SquareTest {


    @Test
    public void GetArea_lengthIs2(){
        double area = 0;

        Shape square = new Square(2);
        area = square.getArea();

        System.out.println("\nArea of square with length 2 is " + area);
        assertEquals(4, area, 0.01 );

    }

    @Test
    public void GetArea_lengthIs4(){
        double area = 0;

        Shape square = new Square(4);
        area = square.getArea();

        System.out.println("\nArea of square with length 4 is " + area);
        assertEquals(16, area, 0.01 );

    }

    @Test
    public void GetArea_lengthIs10(){
        double area = 0;

        Shape square = new Square(10);
        area = square.getArea();

        System.out.println("\nArea of square with length 10 is " + area);
        assertEquals(100, area, 0.01 );

    }

    @Test
    public void perimeter_lengthIs1(){
        double perimeter = 0;

        Shape square = new Square(1);
        perimeter = square.getPerimeter();
        System.out.printf("\nPerimeter of square with length 1 is %.2f", perimeter);
    }

    @Test
    public void perimeter_lengthIs145(){
        double perimeter = 0;

        Shape square = new Square(4);
        perimeter = square.getPerimeter();
        System.out.printf("\nPerimeter of square with length 4 is %.2f", perimeter);
    }

}
