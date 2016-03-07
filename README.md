
# shapes
This week's homework introduces JUnit Testing.

## Reading & End of Chapter Exercises
Before beginning, you’ll want to read through (or review) Chapter 9 in your textbook.

As you complete each chapter, work through the Self Test Exercises at the end of each Chapter to measure what you have learned. The answers are in Appendix A at the back of the book, so you can evaluate and correct your work when you are done. If you have questions on anything covered, please ask. The class chat room will be an excellent spot to discuss these, but will only be as interesting as you make it.

## GitHub Info
Repository:  https://github.com/htc-ccis2595/shapes

You need to fork this repository and submit a pull request to turn in the assignment.  


## Requirements
This week we're going to build a set of Shape classes for Circles and Squares.  

### Shape
The parent class Shape will:

- be abstract
- have a no-argument (default) constructor
- have an abstract getArea() method that returns a double


### Circle
The Circle class will extend Shape:

- implement the getArea() method
- have a constructor that requires an float for the radius
- add a new method to get the circumference of the circle


### Square
The Circle class will extend Shape:

- implement the getArea() method
- have a constructor that requires an float for the length of a side
- add a new method to get the perimeter of the square


### Main
Update the Main class will contain the main method and will build an ArrayList of Shape objects.  To build the list:

- Ask the user what type of shape to create - circle or square - and validate they select one or the other
- Ask for the radius or side length depending on the user's choice
- Create the object and add it to the list.
- Ask if the user wants to create another shape

When the user is done creating shapes, use a loop to go through the list and print the area and either the circumference or the perimeter based on the type.  Make sure that you check for each type before casting to the appropriate Shape and calling its method.  Do not assume that no other types of shapes will exist.

### Testing
Use JUnit to test your Circle and Square classes.  Remember that you can add JUnit to your project by going to your Project Structure and clicking on Libraries.  Click the + to add a library and get it from Maven by looking for JUnit and then selecting version 4.12.

Add a test folder to your project and mark it as Test in the Project Structure.


## Test and Submit your work
Make sure to look at your program output and check that things are displaying as you expect.  Make sure to verify the calculations. When complete, push your changes to GitHub and create a pull request for your work.  Place a screen-shot of that pull request in the dropbox.
