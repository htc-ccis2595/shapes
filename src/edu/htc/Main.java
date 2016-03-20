package edu.htc;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        //Ask the user what type of shape to create Circle or Square
        String answer;
        do {
            System.out.println("Do you want to create Circle or Square?");
            String shapeType = scanner.next();
            while (!shapeType.equalsIgnoreCase("Circle") && !shapeType.equalsIgnoreCase("Square")) {
                System.out.println("Error! please choose either Circle or Square!");
                System.out.println("Do you want to create Circle or Square?");
                shapeType = scanner.next();
            }

            if (shapeType.equalsIgnoreCase("Circle")) {
                double radius = 0;
                while (radius <= 0) {
                    System.out.println("Enter the radius: ");
                    try {
                        radius = Double.parseDouble(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Input Error! Must be in Numeric or more than zero");
                    }
                    Circle circle = new Circle(radius);
                    shapes.add(circle);
                }

            } else if (shapeType.equalsIgnoreCase("Square")) {
                double length = 0;
                while (length <= 0) {
                    System.out.println("Enter the length of the square: ");
                    try {
                        length = Double.parseDouble(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Input Error! Must be in Numeric or more than zero");
                    }
                }
                Square square = new Square(length);
                shapes.add(square);
            }

            System.out.println("Do you want to create another shape?");
            answer = scanner.next();
        } while (!answer.equalsIgnoreCase("No"));


        System.out.println("Calculating the area");

        for (Shape myShape : shapes) {
            // shapes.add(myShape);

            if (myShape instanceof Circle) {
                Circle curCircle = (Circle) myShape;
                System.out.println("The area for the circle is " + curCircle.getArea());
                System.out.println("The Circumference of the circle is " + curCircle.circumference());
                System.out.println();

            }

            if (myShape instanceof Square) {
                Square curSquare = (Square) myShape;
                System.out.println("The Area of the Square is " + curSquare.getArea());
                System.out.println("The Perimeter of the Square is " + curSquare.perimeter());
            }

        }
    }
}
