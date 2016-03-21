package edu.htc.shapes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<Shape>();


        String moreShapes;
        do //--DO LOOP
        {

            System.out.println("Would you like to create a circle or a square?");
            String shapeType = scanner.next();

            //VALIDATING SHAPE TO BE SQUARE OR CIRLCE
            while (!shapeType.equalsIgnoreCase("Circle") && !shapeType.equalsIgnoreCase("Square")) {
                System.out.println("Please enter 'circle or 'square'.");
                System.out.println("Would you like to create a circle or a square?");
                shapeType = scanner.next();

            }

            //CIRCLE
            if (shapeType.equalsIgnoreCase("Circle")) {
                System.out.println("Please enter a radius:");
                float circleRadius = Integer.parseInt(scanner.next());

                //VALIDATING CIRCLE RADIUS
                while (circleRadius < 0) {
                    try {
                        circleRadius = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a number higher than 0(zero).");
                    }

                }

                //ADD TO ARRAY
                Circle circle = new Circle(circleRadius);
                shapes.add(circle);

            }

            //SQUARE
            else if (shapeType.equalsIgnoreCase("Square")) {
                System.out.println("Please enter a length:");
                float squareLength = Integer.parseInt(scanner.next());

                while (squareLength < 0) {
                    try {
                        squareLength = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a number higher than 0(zero).");
                    }

                }

                Square square = new Square(squareLength);
                shapes.add(square);
            }

            System.out.println("Would you like to create another shape? Yes or No");
            moreShapes = scanner.next();
        }

        while(!moreShapes.equalsIgnoreCase("No")); //--CONDITION FOR DO LOOP

        //PRINTING OUT SHAPES WITH CIRCUMFERENCE/PERIMETER & AREA
        for(Shape s : shapes){

            System.out.println("Shape Circumference: " + s.getCircumference());
            System.out.println("Shape Area: " + s.getArea());
            System.out.println("");
        }

    }
}
