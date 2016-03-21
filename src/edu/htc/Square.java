package edu.htc;

/**
 * Created by Sam on 3/14/2016.
 */
public class Square extends Shape {
    private float side;
    private double area;
    private double perimeter;

    public Square(float s) {
        side = s;
    }
    @Override
    public double getArea() {
        area = side * side;
        return area;
    }

    public double getPerimeter(){
        perimeter = side * 4;
        return perimeter;
    }


}
