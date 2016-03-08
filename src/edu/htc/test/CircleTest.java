import static org.junit.Assert.*;
import edu.htc.Circle;
import org.junit.Test;

/**
 * Created by volkg_000 on 3/8/2016.
 */
public class CircleTest {
    @Test
    public void getArea() {
        Circle circle = new Circle(10);
        double result = circle.getArea();
        assertEquals(314.159265359793, result, 0.01);


    }
    @Test
    public void getCircumference() {
        Circle circle = new Circle(10);
        double result = circle.getCircumference();
        assertEquals(62.83185307179586, result, 0.01);

    }


}