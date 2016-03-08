package edu.htc;

/**
 * Created by volkg_000 on 3/7/2016.
 */
public class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}
