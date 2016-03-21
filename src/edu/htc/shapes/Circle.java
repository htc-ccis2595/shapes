package edu.htc.shapes;

/**
 * Created by cheey on 3/7/2016.
 */
public class Circle extends Shape {

    float radius;



    public Circle(float radius){
        this.radius = radius;

    }

    public double getCircumference(){
        double circumference = (2 * 3.14 * radius);
        return circumference;
    }

    public double getArea(){
        double areaCircle = (3.14 * radius * radius);
        return areaCircle;
    }
}
