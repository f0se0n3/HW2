package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
	    userInput();
    }
    public static void userInput() {
        System.out.println("Choose what shape do you need to count:");
        System.out.println("Circle");
        System.out.println("Square");
        System.out.println("Rectangle");
        System.out.println("Triangle");
        System.out.print("Choose your shape:");
        Scanner shapeInput = new Scanner(System.in);
        String shapeInputInStr = shapeInput.next();

        List<Shape> container = new ArrayList<Shape>() ;
        if ("Circle".equals(shapeInputInStr)) {
            System.out.println("You have chosen: " + shapeInputInStr);
            Circle c = Circle.circleInput();
            c.display();
            container.add(c);
        } else if ("Square".equals(shapeInputInStr)) {
            System.out.println("You have chosen: " + shapeInputInStr);
            Square.squareSideInput();
        } else if ("Rectangle".equals(shapeInputInStr)) {
            System.out.println("You have chosen: " + shapeInputInStr);
            Rectangle.rectSidesInput();
        } else if ("Triangle".equals(shapeInputInStr)) {
            System.out.println("You have chosen: " + shapeInputInStr);
            Triangle.triangleSidesInput();
        } else {
            System.out.println("You need to choose one of shapes given above.");
            System.out.println("For example: Square");
            System.out.println("");
            userInput();
        }
    }
}
