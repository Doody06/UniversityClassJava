package pkg224110470_chapter6;

import java.util.Scanner;

public class FormatInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to format, then enter the required width: ");
        System.out.println("The formatted number is: "+format(input.nextInt(),input.nextInt()));
    } 
    
    public static String format(int number, int width) {
        String numberString = "" + number;

        
        int numZeroes = width - numberString.length();
        
        for (int i = 0; i < numZeroes; i++) {
            numberString = "0" + numberString;
        }
        return numberString;
    }
}


