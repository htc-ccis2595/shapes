package edu.htc.shapes;

/**
 * Created by cheey on 3/7/2016.
 */
abstract class Shape {

    private float length;
    private float radius;

    public Shape() {
    }

    public float getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public abstract double getCircumference();

    public abstract double getArea();



}
