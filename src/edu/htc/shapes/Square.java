package edu.htc.shapes;

/**
 * Created by cheey on 3/7/2016.
 */
public class Square extends Shape {

    float length;



    public Square(float length){
        this.length = length;

    }


    public double getCircumference(){
        double circumference = (4 * length);
        return circumference;
    }

    public double getArea(){
        double squareArea = length * length;
        return squareArea;
    }
}
