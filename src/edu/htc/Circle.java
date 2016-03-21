package edu.htc;

/**
 * Created by Joel on 3/20/2016.
 */
public class Circle extends Shape {
    private float rad;
    private float diam;
    private double Pie = 3.14;
    public Circle (float radius){
        this.rad = radius;
    }
    public float getRadius() {
        return rad;
    }
    public void setRadius (float radius) {
        this.rad = radius;
    }
    public float getDiameter() {
        return diam;
    }
    public void setDiameter (float radius) {

        this.diam = rad * rad;
    }
    @Override
    public double getArea(){
        this.setRadius(rad);
        this.setDiameter(diam);
        double area = Pie*getDiameter();
        return area;
    }

    public double getCircumference() {
        return 2 * Pie * getRadius();
    }
}
