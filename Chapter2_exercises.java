
package com.mycompany._chapter2a;
import java.util.Scanner;

public class Chapter2_exercises {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Ask the user to enter a temperature in Celsius
        System.out.print("Enter a Celsius temperature:");
        double celsius = in.nextDouble();
        
        //calculate the temperature in fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " in Celsius is " + fahrenheit +" in fahrenheit");
    }
}
