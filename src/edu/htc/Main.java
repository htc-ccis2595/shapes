package edu.htc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String pShape; //store which shape was picked
        boolean more; //set bool to break out of create shape loop
        boolean blnErr; //set bool to break for errors
        Scanner scan = new Scanner(System.in);
        String again;

        ArrayList<Shape> Shapelist = new ArrayList<Shape>();
        String userInput;
        more = false;
        do {

            blnErr = false;
            do {
                System.out.println("Would you like to create a Circle or Square?");
                userInput = scan.next();

                if (!userInput.equalsIgnoreCase("Circle") && !userInput.equalsIgnoreCase("Square")) {
                    blnErr = true;
                    System.out.println("Error, please enter either Circle, or Square");

                } else if (userInput.equalsIgnoreCase("Circle") && !userInput.equalsIgnoreCase("Square")) {
                    blnErr = false;
                    // pShape = scan.next();
                } else if (userInput.equalsIgnoreCase("Square") && !userInput.equalsIgnoreCase("Circle")) {
                    blnErr = false;
                    // pShape = scan.next();
                }


            } while (blnErr);
            pShape = userInput;
            if (pShape.equalsIgnoreCase("Circle")) {
                float radius = 0;
                while (radius < 1) {
                    System.out.println("Enter a radius for your circle ");
                    try {
                        radius = scan.nextFloat();
                    } catch (NumberFormatException exc) {
                        System.out.println("Error, number must be greater than 0");
                    }
                }
                Shape circle = new Circle(radius);
                Shapelist.add(circle);
            }
            if (pShape.equalsIgnoreCase("Square")) {
                float side = 0;
                while (side < 1) {
                    System.out.println("Enter a length for the sides of your square ");
                    try {
                        side = scan.nextFloat();
                    } catch (NumberFormatException exc) {
                        System.out.println("Error, number must be greater than 0");
                    }
                }
                Shape square = new Square(side);
                Shapelist.add(square);
            }
            System.out.println("Do you wish to add another shape Yes/No?");
            do {


                again = scan.next();
                if (!again.equalsIgnoreCase("Yes") && !again.equalsIgnoreCase("No")) {
                    blnErr = true;
                    System.out.println("Error, please enter Yes, or No");
                } else if (again.equalsIgnoreCase("Yes")) {
                    more = true;
                } else if (again.equalsIgnoreCase("No")) {
                    more = false;
                } else {
                    blnErr = true;
                }
            }while (blnErr);
        } while (!more);
        for (Shape x : Shapelist ) {
            if(x instanceof Circle) {
            Circle circle = (Circle) x;
            System.out.println("This Circle's Area " + circle.getArea());
            System.out.println("This Circle's Circumference " + circle.getCircumference());
            System.out.println();
        }
    }
        for(Shape x : Shapelist ) {
        if (x instanceof Square) {
            Square square = (Square) x;
            System.out.println("This Square's Area " + square.getArea());
            System.out.println("This Square's Perimeter " + square.getPerimeter());

        }
    }
        System.out.println("End of program, thanks for shaping things up!");

    }
}
