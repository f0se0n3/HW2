package com.company;

import java.util.Scanner;

public class Circle extends Shape {
    int radius;
    Circle(int radius) {
        this.radius = radius;
        
    }
    
    public static Circle circleInput() {
        System.out.println("Enter r: ");
        Scanner circleRadius = new Scanner(System.in);
        return new Circle(circleRadius.nextInt());
    }

    public  void display() {
        System.out.println(radius);

    }
}
