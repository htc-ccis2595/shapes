package edu.htc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String name;
        int selection = 0;
        ArrayList<Shape> shapes = new ArrayList<Shape>();


        shapes.add((Shape) createShape());
        while (selection != 2) {
            System.out.println("Would you like to create another shape?");
            System.out.println("    1. Yes");
            System.out.println("    2. No");
            System.out.println("Please enter the number of your selection: ");
            selection = scanner.nextInt();
            if (selection != 1 && selection != 2) {
                System.out.println("That was not a valid selection. Please try again.");
            } else if (selection == 2) break;
            else{
                shapes.add((Shape) createShape());
            }
        }
        System.out.println("Here is a list of all of your shapes: ");
        for (Shape i: shapes ){
            if (i instanceof Circle){
                System.out.println("This shape is a circle. It has an area of " + i.getArea() + " and a circumference of " + ((Circle) i).getCircumference() + "." );
            }
            else if (i instanceof Square){
                System.out.println("This shape is a square. It has an area of " + i.getArea() + " and a perimeter of " + ((Square) i).getPerimeter() + "." );
            }
            else System.out.println("This shape is not a circle or a square.");
        }
    }



    public static Object createShape() {

        boolean choice = false;
        String shape = "";
        float rad;
        float side;
        Scanner scan = new Scanner(System.in);
        while (!choice) {
            System.out.println("What kind of shape would you like to create: circle or square?");
            shape = scan.next();
            if (shape.equals("circle") || shape.equals("square")) choice = true;
            else System.out.println("I'm sorry that is not a valid selection. Please try again.");
        }
        if (shape.equals("circle")) {
            System.out.println("Please enter the radius of the circle: ");
            rad = scan.nextFloat();
            Circle circle = new Circle(rad);
            return circle;
        } else {
            System.out.println("Please enter the length of one side of your square: ");
            side = scan.nextFloat();
            Square square = new Square(side);
            return square;
        }

    }

}
