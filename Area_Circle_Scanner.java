//last accessed 1/12/2025
//This program computes the area of a circle using input from the user
package com.mycompany._chapter2a;

import java.util.Scanner;

public class Area_Circle_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius value: ");
                double radius = input.nextDouble(); 
        
        double area = radius*radius*Math.PI;
        
        System.out.println("The area of the circle of radius" + radius + " is " +area);
    }
}
