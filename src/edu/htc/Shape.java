package edu.htc;

/**
 * Created by clifford.mauer on 3/7/2016.
 */
public abstract class Shape {

    //** The parent class Shape will:
    //**  1 -- be abstract

    //**  2 -- have a no-argument (default) constructor

    public Shape() {
    }


    //**  3 -- have an abstract getArea() method that returns a double
    public abstract double getArea();

    public abstract String toString();

}
