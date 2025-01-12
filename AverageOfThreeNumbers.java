/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._chapter2a;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        
        System.out.print("Enter the three values to be averaged: ");
        double firstnum = myinput.nextDouble(); 
        double secondnum = myinput.nextDouble();
        double thirdnum = myinput.nextDouble();
        
        double average = ((firstnum+secondnum+thirdnum) / 3);
        System.out.println("the average of these three numbers is " + average);

    }
}
