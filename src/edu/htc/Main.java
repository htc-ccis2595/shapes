package edu.htc;



import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        //Ask the user for what type of shape
        String type;
        String moreShapes;
        do {
            System.out.println("What type of shape do you want to create? Circle or Square");
            type = scanner.next();
            while (!type.equalsIgnoreCase("Circle") && !type.equalsIgnoreCase("Square")) {
                System.out.println("Please enter Circle or Square ");
                type = scanner.next();
            }

            //if the shape is circle
            if (type.equalsIgnoreCase("Circle")) {
                float radius = 0;
                while (radius <= 0) {
                    System.out.println("Enter the radius of the circle : ");
                    try {
                        radius = Float.parseFloat(scanner.next());
                        if(radius <= 0)
                        {
                            System.out.println("Please enter a number greater than 0");
                            radius = 0;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a number greater than 0");
                    }
                }

                //Create the circle and add to the list
                Circle circle = new Circle(radius);
                shapes.add(circle);
            }

            //if the shape is square
            if (type.equalsIgnoreCase("Square")) {
                float length = 0;
                while (length <= 0) {
                    System.out.println("Enter the length of the Square : ");
                    try {
                        length = Float.parseFloat(scanner.next());
                        if(length <= 0)
                        {
                            System.out.println("Please enter a number greater than 0");
                            length = 0;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a number greater than 0");
                    }
                }
                //Create the square and add to the list
                Square square = new Square(length);
                shapes.add(square);

            }

            //Asking for more shapes
            System.out.println("Do you want to create more shapes? Y/N : ");
            moreShapes = scanner.next();
        } while (moreShapes.equalsIgnoreCase("Y"));

        System.out.println("Printing your shapes");
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                Circle circle = (Circle)shape;
                System.out.println("The area of the circle is : " + circle.getArea());
                System.out.println("The circumference of the circle is : " + circle.getCircumference());
            }
            if (shape instanceof Square){
                Square square = (Square) shape;
                System.out.println("The area of the square is : " + square.getArea());
                System.out.println("The perimeter of the square is : " + square.getPerimeter());
            }
        }
    }
}
