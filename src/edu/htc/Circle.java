package edu.htc;

import java.lang.Math;

/**
 * Created by clifford.mauer on 3/7/2016.
 */
public class Circle extends Shape {

    private double radius;
    private double area;
    private double circumference;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //** The Circle class will
    // ** 1 -- extend Shape:
    // ** 2 -- implement the getArea() method
    @Override
    public double getArea() {

        area = Math.PI * radius * radius;

        return area;
    }

   // ** 3 -- have a constructor that requires an float for the radius
    public Circle(float radius) {
        setRadius(radius);
    }

    // ** 4 -- add a new method to get the circumference of the circle

    public double getCircumference(){

        circumference = Math.PI * 2 * radius;

        return circumference;
    }

    public String toString(){
        return "Circle{" +
                "radius = " + radius +
                ", circumference = " + getCircumference() +
                ", area = " + getArea() +
                '}';
    }
}
