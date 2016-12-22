package com.company;

import java.util.Scanner;

public class Square extends Shape {
    public static void squareSideInput() {
        System.out.print("Enter a: ");
        Scanner squareSideInput = new Scanner(System.in);
        int a = squareSideInput.nextInt();
        int b = a;
        squarePerimeterOrArea(a, b);
    }

    public static void squarePerimeterOrArea(int a, int b) {
        System.out.println("What do you need to know?");
        System.out.println("Perimeter or Area?");
        System.out.print("Enter your choice: ");
        Scanner perOrArea = new Scanner(System.in);
        String perOrAreaInStr = perOrArea.next();

        if (perOrAreaInStr.contains("Area")) {
            System.out.println("You have chosen area.");
            Shape.calculateSquareArea(a, b);
        } else if (perOrAreaInStr.contains("Perimeter")) {
            System.out.println("You have chosen perimeter.");
            Shape.calculateSquarePerimeter(a, b);
        } else {
            System.out.println("Your input needs to be perimeter or area.");
            System.out.println("For example: Area");
            System.out.println("");
            squarePerimeterOrArea(a, b);
        }
    }

}
