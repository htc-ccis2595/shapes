package edu.htc;

/**
 * Created by Administrator on 3/7/16.
 */
public class Circle extends Shape {
    private double PIE = 3.14159;
    private float radius = 0;
    private double circumference = 0;
    private double perimeter = 0;

    Circle(float radius){
        this.radius = radius;
    }

    public double getPIE() {
        return PIE;
    }

    public void setPIE(double PIE) {
        this.PIE = PIE;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea(){
        double area = 0;

        area = PIE * radius * radius;
        return area;
    }

    public double getCircumference(){
        double circumference = 0;

        circumference = 2 * PIE * radius;

        return circumference;
    }
    public double getPerimeter(){

        return perimeter;
    }
}
