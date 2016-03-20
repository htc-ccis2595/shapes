package edu.htc;

/**
 * Created by Gyan on 3/8/2016.
 */
public class Square extends Shape {
    private double length;

    public Square(double length){
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double area = getLength()*getLength();
        return area;
    }


    public double perimeter(){
        double squarePerimeter = 4*getLength();
        return squarePerimeter;

    }
}
