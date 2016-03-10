package edu.htc;

/**
 * Created by Administrator on 3/7/16.
 */
public class Square extends Shape{
    private double perimeter = 0;
    private double area = 0;
    private double length = 0;
    private double circumference = 0;


    Square(float length){
        this.length = length;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getArea(){

        area = length * length;
        return area;
    }

    public double getCircumference(){
        return circumference;
    }

    public double getPerimeter(){

        perimeter = length * 4;

        return perimeter;
    }
}
