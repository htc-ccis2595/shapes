package edu.htc;

/**
 * Created by Joel on 3/20/2016.
 */
public class Square extends Shape{
    private float sideLength;

    public Square(float length){
        this.sideLength = length;
    }
    public float getLength() {
        return sideLength;
    }

    @Override
    public double getArea(){
        double area = getLength()*getLength();
        return area;
    }
    public double getPerimeter() {
        return 4 * sideLength;
    }
}
