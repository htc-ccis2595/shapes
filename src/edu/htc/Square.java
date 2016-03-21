package edu.htc;

/**
 * Created by clifford.mauer on 3/7/2016.
 */
public class Square extends Shape {

    @Override
    public String toString() {
        return "Square{" +
                "side = " + side +
                ", perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                '}';
    }
    //** The Square class will
    //** 1--extend Shape:
    //** 2-- implement the getArea() method

    float side = 0.00f;
    float fperimeter = 0.00f;


    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public double getArea() {

        double SquareArea = this.side * this.side;

        return SquareArea;
    }
     //** 3-- have a constructor that requires a float for the length of a side

    public Square(float fsidelength) {
        setSide(fsidelength);
    }

    //** 4-- add a new method to get the perimeter of the square

    public double getPerimeter(){
               this.fperimeter = getSide() * 4;
        return  fperimeter ;

    }

}
