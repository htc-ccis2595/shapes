package edu.htc;
import java.lang.Math;

/**
 * Created by volkg_000 on 3/7/2016.
 */
public class Circle extends Shape {
    private double radius;


    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override

    //implement getArea()
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //circumference of a circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
