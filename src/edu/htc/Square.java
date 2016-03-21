package edu.htc;

/**
 * Created by Owner on 3/21/2016.
 */
public class Square extends Shape {
    private float length;

    public Square(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getLength()*getLength();
    }

    public double getPerimeter(){
        return 4*getLength();
    }
}
