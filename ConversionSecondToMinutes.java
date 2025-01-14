/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg224110470_chapter2;

import java.util.Scanner;

/**
 *
 * @author 224110470
 */
public class ConversionSecondToMinutes {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of total seconds");
        int totalSeconds = input.nextInt();
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds - minutes*60; //with modulus totalSeconds % minutes
        
        System.out.println("the total number of minutes is : "+minutes);
        System.out.println("The number of remaining seconds is : "+seconds);
    
    }

}
