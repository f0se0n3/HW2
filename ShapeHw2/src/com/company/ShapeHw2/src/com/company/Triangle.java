package com.company;

import java.util.Scanner;

public class Triangle {
    public static void triangleSidesInput() {
        System.out.print("Enter a: ");
        Scanner triSideA = new Scanner(System.in);
        int a = triSideA.nextInt();
        System.out.print("Enter b: ");
        Scanner triSideB = new Scanner(System.in);
        int b = triSideB.nextInt();
        System.out.print("Enter c: ");
        Scanner triSideC = new Scanner(System.in);
        int c = triSideC.nextInt();
        triPerimeterOrArea(a, b, c);
    }

    public static void triPerimeterOrArea(int a, int b, int c) {
        System.out.println("What do you need to know?");
        System.out.println("Perimeter or Area?");
        System.out.print("Enter your choice: ");
        Scanner perOrArea = new Scanner(System.in);
        String perOrAreaInStr = perOrArea.next();

        if (perOrAreaInStr.contains("Area")) {
            System.out.println("You have chosen area.");
            Shape.calculateTriangleArea(a, b, c);
        } else if (perOrAreaInStr.contains("Perimeter")) {
            System.out.println("You have chosen perimeter.");
            Shape.calculateTrianglePerimeter(a, b, c);
        } else {
            System.out.println("Your input needs to be perimeter or area.");
            System.out.println("For example: Area");
            System.out.println("");
            triPerimeterOrArea(a, b, c);
        }
    }
}
