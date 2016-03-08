package edu.htc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        String createmore;
        //ask the user to enter information for a pet
        do { System.out.println("Do you want to create a Circle or Square?");
        String shapeType = scanner.next();
        while (!shapeType.equalsIgnoreCase("Circle") && !shapeType.equalsIgnoreCase("Square")) {

            System.out.println("Sorry, you must enter either Circle or Square.");
            System.out.println("Do you want to create a Circle or Square?");
            shapeType = scanner.next();
        }

        if (shapeType.equalsIgnoreCase("circle")) {
            double radius = 0;
            while (radius < 1.00) {
                System.out.println("What should the radius be for the circle? ");
                try {
                    radius = Double.parseDouble(scanner.next());
                } catch (NumberFormatException exc) {
                    System.out.println("Enter a number bigger than 0 you dingus!!");
                }


            }
            Circle circle = new Circle(radius);
            shapes.add(circle);
        } else if (shapeType.equalsIgnoreCase("Square")) {
            double side = 0;
            while (side < 1.00) {
                System.out.println("What should be the side length of the square");
                try {
                    side = Double.parseDouble(scanner.next());
                } catch (NumberFormatException exc) {
                    System.out.println("Enter a number bigger than 0 you dingus!!");
                }

            }
            Square square = new Square(side);
            shapes.add(square);
        }
        System.out.println("Would you like to create more shapes?");

            createmore = scanner.next();
    } while (createmore.equalsIgnoreCase("Yes"));


            for(Shape x : shapes) {
                if(x instanceof Circle) {
                    Circle circle = (Circle) x;
                    System.out.println("Circle Area " + circle.getArea());
                    System.out.println("Circle circumference " + circle.getCircumference());
                    System.out.println();
                }

            }

            for(Shape x: shapes) {
                if(x instanceof Square) {
                    Square square = (Square) x;
                    System.out.println("Square perimeter " + square.getPerimeter());
                    System.out.println("Square Area " + square.getArea());
                }
            }





    }
}
