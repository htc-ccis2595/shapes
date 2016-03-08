/**
 * Created by volkg_000 on 3/8/2016.
 */

import static org.junit.Assert.*;
import edu.htc.Square;
import org.junit.Test;

public class SquareTest {
    @Test
    public void getArea() {
        Square square = new Square(11);
        double result = square.getArea();
       assertEquals(121, result, 0.01);

    }

    @Test
    public void getPerimeter() {
        Square square = new Square(11);
        double result = square.getPerimeter();
        assertEquals(44, result, 0.01);
    }
}
