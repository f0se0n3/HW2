package com.company;

public abstract class Shape {
    public static void calculateSquareArea(int a, int b) {
        int s = a * b;
        System.out.println("Area is: " + s);
    }
    public static void calculateSquarePerimeter(int a, int b) {
        int p = 2 * (a + b);
        System.out.println("Perimeter is: " + p);
    }
    public static void calculateTriangleArea(int a, int b, int c) {
        int p = (a + b + c) / 2; //semiperimeter
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //Herone's formula
        System.out.println("Area is: " + s);
    }
    public static void calculateTrianglePerimeter(int a, int b, int c) {
        int p = a + b + c;
        System.out.println("Perimeter is: " + p);
    }
}
