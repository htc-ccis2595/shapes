package edu.htc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String answer = "Y";
        String shapeMessage;


        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> list = new ArrayList<Shape>(); //array to store shape objects

        //ask the user for circle or square
        while (answer.equalsIgnoreCase("Y"))  {
            System.out.println("Do you want a circle or square?");
            String shapeType = scanner.next();
            while (!shapeType.equalsIgnoreCase("Circle") && !shapeType.equalsIgnoreCase("Square")) {
                System.out.println("Sorry, you must enter either Circle or Square");
                shapeType = scanner.next();
            }
            if (shapeType.equalsIgnoreCase("Circle")) {  //modify message
                shapeMessage = "circle radius > 0?";
            } else {
                shapeMessage = "length of the side > 0?";
            }

            float size = 0;
            do {
                System.out.println("What is the " + shapeMessage);

                try {
                    size = Float.parseFloat(scanner.next());            //get size and catch string data
                } catch (NumberFormatException e) {
                    System.out.println("Hey, you did not enter a number.");
                } catch (Exception other){
                    System.out.println("Something else happened");
                }

            } while (size <= 0);

            if (shapeType.equalsIgnoreCase("circle")) {     //create circle
                Shape circle = new Circle(size);
                list.add(circle);

            } else {
                Shape square = new Square(size);            //create square
                list.add(square);
            }

            System.out.println("Do you wish to add another shape Y/N?");

            answer = scanner.next();
            while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")) {    //more shapes
                System.out.println("Sorry, you must enter either Y or N");
                answer = scanner.next();
            }
        }

        // print details
        for (Shape listObject: list){
            if (listObject instanceof Circle){
                System.out.printf("The area of the circle with radius of %.2f", ((Circle) listObject).getRadius());
                System.out.printf(" is %.2f", listObject.getArea());
                System.out.printf("\nThe circumference of a circle with radius of %.2f", ((Circle) listObject).getRadius());
                System.out.printf(" is %.2f", listObject.getCircumference() );
                System.out.println("\n**************************************");
            }
            if (listObject instanceof Square){
                System.out.printf("\nThe area of the square with length of %.2f", ((Square) listObject).getLength());
                System.out.printf(" is %.2f", listObject.getArea());
                System.out.printf("\nThe perimeter of a square with length of %.2f", ((Square) listObject).getLength());
                System.out.printf(" is %.2f", listObject.getPerimeter() );
                System.out.println("\n**************************************");
            }
        }
    }
}
