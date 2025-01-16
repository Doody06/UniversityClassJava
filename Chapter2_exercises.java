// last accessed 1/14/2025
package pkg224110470_chapter2;
import java.util.Scanner;

public class Chapter2_exercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of total seconds");
        int totalSeconds = input.nextInt();
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds - minutes*60; //with modulus totalSeconds % minutes
        
        System.out.println("the total number of minutes is : "+ minutes);
        System.out.println("The number of remaining seconds is : "+ seconds);
           
    }
}
/*
2.3
class FeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet*0.305;
        System.out.println(feet + " feet is " + meters + " meters ");
    }
}
2.4
class KilogramsToPounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds*0.454;
        System.out.print(pounds + "pounds is " + kilograms + " kilograms ");
        
    }
}
2.5
class GratuityCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate ");
        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble();
        double gratuity = subtotal*(gratuity_rate / 100);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
        
    }
    2.6
class SumTheDigitsOfIntegers {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int numInput = input.nextInt();
        
        int sumDigits = numInput % 10;
        numInput = numInput / 10;
        sumDigits = sumDigits + (numInput % 10);
        numInput = numInput / 10;  
        sumDigits = sumDigits + (numInput % 10);
        numInput = numInput / 10;
        sumDigits = sumDigits + (numInput);
        
        System.out.println("The sum of the digits is " + sumDigits);
        
        
    }
    2.7
class YearsInMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbre of minutes: ");
        long inputMinutes = input.nextInt();
        long minutesInYear = 365*24*60;
        long years = inputMinutes / minutesInYear;
        long days = (inputMinutes % minutesInYear) / (24*60); // find number of minutes left to complete a year then divide that by number of minutes in a day
        System.out.println(years);
        System.out.println(days);
    }  
    
}
    NEED HELP HOW TO LIMIT DECIMAL PLACES TO 2
class CompoundValue
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        double saving = input.nextDouble();
        
        final double INTEREST_RATE = 1.00417;
        
        double firstMonth = saving * INTEREST_RATE;
        double secondMonth = (saving + firstMonth) * INTEREST_RATE;
        double thirdMonth = (saving + secondMonth) * INTEREST_RATE;
        double fourthMonth = (saving + thirdMonth) * INTEREST_RATE;
        double fifthMonth = (saving + fourthMonth) * INTEREST_RATE;
        double sixthMonth = (saving + fifthMonth) * INTEREST_RATE;
        
        System.out.println("after the sixth month, the account value is $" + sixthMonth);
    }

*/ 
