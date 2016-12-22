package com.company;

import java.util.Scanner;

public class Rectangle {
    public  static void rectSidesInput() {
        System.out.print("Enter a: ");
        Scanner rectSideA = new Scanner(System.in);
        int a = rectSideA.nextInt();
        System.out.print("Enter b: ");
        Scanner rectSideB = new Scanner(System.in);
        int b = rectSideB.nextInt();
        rectPerimeterOrArea(a, b);
    }

    public static void rectPerimeterOrArea(int a, int b) {
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
            rectPerimeterOrArea(a, b);
        }
    }
}
