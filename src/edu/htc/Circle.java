package edu.htc;

/**
 * Created by Sam on 3/14/2016.
 */
public class Circle extends Shape {
    private float radius;
    private double area;
    private double diameter;
    private double circumference;
    private String name;

    public Circle(float r) {
        radius = r;
    }
    @Override
    public double getArea() {
        area = (3.14 * (radius * radius));
        return area;
    }

    public double getCircumference (){
        diameter = radius * 2;
        circumference = 3.14 * diameter;
        return circumference;
    }

    public String getName() {
        return name;
    }


    }

