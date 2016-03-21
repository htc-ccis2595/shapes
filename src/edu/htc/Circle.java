package edu.htc;

/**
 * Created by Owner on 3/21/2016.
 */
public class Circle extends Shape {
    private double pi = 3.14;
    private float radius;
    public Circle(float radius){
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (pi*getRadius()*getRadius());
    }

    public double getCircumference(){
        return  2 * pi * getRadius();
    }
}
