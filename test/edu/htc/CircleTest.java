package edu.htc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.junit.Test;
/**
 * Test for Circle class methods
 */
public class CircleTest {

    @Test
    public void EvaluateCircle(){

        double darea = 95.03317777109125;
        double dcircumference = 34.55751918948772;
        double area = 0.00;
        double circumference = 0.00;
        float fradius = 5.50f;
        double delta = .0000000000001;
        Circle circle = new Circle(fradius);
        area = circle.getArea() ;
        circumference = circle.getCircumference();

        System.out.println("Area Test ------------------------");
        try
        {
            assertEquals(darea,area,delta);
            System.out.println("Area Test has passed.");
        }
        catch (AssertionError e)
        {
            System.out.println("Area Test has failed.");
        }
        System.out.println("Expected = " + darea + ", Actual = " + area );


        ///**************************************
        System.out.println("Circumference Test ---------------------------");
        try
        {
            assertEquals(dcircumference,circumference,delta);
            System.out.println("Circumference test has passed.");
        }
        catch (AssertionError e)
        {
            System.out.println("Circumference Test has failed.");
        }
        System.out.println("Expected = " + dcircumference + ", Actual = " + circumference );
        System.out.println("Program test was successful.");
    }

}
