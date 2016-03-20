package edu.htc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for Square class methods
 */
public class SquareTest {

    @Test
    public void getSquareArea_lengthIsOne(){
        Square square = new Square(1.0);
        Double areaResult = square.getArea();
        assertEquals(1.0,areaResult,0.01);

    }

    @Test
    public void getSquareArea_lengthIsFive(){
        Square square = new Square(5.0);
        Double areaResult = square.getArea();
        assertEquals(25.0, areaResult, 0.01);
    }


    @Test
    public void getSquarePerimeter_lenghtIsOne(){
        Square square = new Square(1.0);
        Double perimeterResult = square.perimeter();
        assertEquals(4.0,perimeterResult,0.01);
    }

    @Test
    public void getSquarePerimeter_lenghtIsTwentyFive() {
        Square square = new Square(25.0);
        Double perimeterResult = square.perimeter();
        assertEquals(100.0, perimeterResult, 0.01);
    }


}
