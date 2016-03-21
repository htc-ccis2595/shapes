package edu.htc;

import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner input = new Scanner(System.in);
        String strAnswer = "";
        String strContinue = "";
        String strRadius = "";
        String strSide = "";
        Boolean blnExit = false;
        ArrayList<Shape> ShapeList = new ArrayList<Shape>();
        String StrRadius = "";

        do {
            //**Ask the user what type of shape to create - circle or square - and validate they select one or the other
            System.out.println("What type of shape would you like to create?");
            System.out.println("Circle or Square? Type Circle for circle or Square for square");

            strAnswer = input.nextLine();


            //**Ask for the radius or side length depending on the user's choice
            if (strAnswer.equalsIgnoreCase("circle")) {
                System.out.println("Please enter the radius for the circle.");
                strRadius = input.nextLine();
                //**Create the object and add it to the list.
                float fRadius = Float.parseFloat(strRadius);
                Circle circle = new Circle(fRadius);
                ShapeList.add(circle);
            }

            if (strAnswer.equalsIgnoreCase("square") ){
               System.out.println("Please enter the length of a side for the square.");
                strSide = input.nextLine();
                float fSide = Float.parseFloat(strSide);
                Square square = new Square(fSide);
                ShapeList.add(square);
            }

            //**Ask if the user wants to create another shape
            System.out.println("Want to create another shape?");
            System.out.println("Enter yes to continue or no to quit.");
            strContinue = input.nextLine();
            if (strContinue.equalsIgnoreCase("yes")){
                blnExit = false;
            }
            else {
                blnExit = true;
            }
        } while (!blnExit);

        // When the user is done creating shapes, use a loop to go through the list
        // and print the area and either the circumference or the perimeter based on the type.

        for (Shape x :ShapeList) {
            System.out.println(x.toString());
        }

        // Make sure that you check for each type before casting to the appropriate Shape
        // and calling its method. Do not assume that no other types of shapes will exist.

    }
}
