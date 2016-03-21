package edu.htc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for Square class methods
 */
public class SquareTest {

    @Test
    public void EvaluateSquare(){

        double darea = 30.25;
        double dperimeter = 22.00;
        double area = 0.00;
        double perimeter = 0.00;
        double delta = .00000000000001;


        float fside = 5.5f;
        Square square = new Square(fside);

        area = square.getArea();
        perimeter = square.getPerimeter();

        System.out.println("Area Test ------------------------");
        try {
            assertEquals(darea, area, delta);
            System.out.println("Area test has passed.");
        }
        catch (AssertionError e){
            System.out.println("Area Test has failed.");
        }
        System.out.println("Expected = " + darea + ", Actual = " + area );

        ///**************************************
        System.out.println("Perimeter Test ---------------------------");
        try {
            assertEquals(dperimeter, perimeter, delta);
            System.out.println("Perimeter test has passed.");
        }
        catch (AssertionError e){
            System.out.println("Perimeter Test has failed.");
        }
        System.out.println("Expected = " + dperimeter + ", Actual = " + perimeter );
        System.out.println("Program test was successful.");
    }

}
