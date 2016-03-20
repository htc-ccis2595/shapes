package edu.htc;

/**
 * Created by Gyan on 3/8/2016.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){

        double area = getRadius()*getRadius()*3.14;
        return area;
    }

    public double circumference(){
        double circleCircumference = 2*3.14*getRadius();
        return circleCircumference;
    }
}
