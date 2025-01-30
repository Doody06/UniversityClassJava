package pkg224110470_chapter3;
import java.util.Scanner;

public class Chapter3_exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aiChoice = (int)(Math.random()*3);
        System.out.print("scissor(0), rock(1), paper(2): ");
        int playerChoice = input.nextInt();
        if (playerChoice != 0 && playerChoice != 1 && playerChoice != 2)
            System.out.println("Invalid choice, choose 0,1, or 2");
        else {
            if(playerChoice == 0) {
                
            }
        
            
    }
}
}









/*
exercise 1.1 WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_WIP_
Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        if (Math.pow(b*b-4*a*c,0.5) == 0 ) 
            System.out.println("The equation has one root");
        else if (Math.pow(b*b-4*a*c,0.5) > 0)
            System.out.println("The equation has two roots");

3.12
Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int userInput = input.nextInt();
        if (userInput > 99 & userInput <= 999) {
            if ((userInput/100) == (userInput%10)) 
                    System.out.println(userInput + " is a palindrome");
            else 
                System.out.println(userInput +" is not a palindrome");
    }
        else 
            System.out.println("Only 3 digit numbers are accepted!");
                
3.18
Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package to be shipped");
      float packageWeight = input.nextFloat();
      double packagePrice = 0;
      if (packageWeight <= 0) //lines 10 to 13 check if its an invalid weight
            System.out.println("Error! No negative or zero values for weight allowed");
        else if (packageWeight > 20)
            System.out.println("the package cannot be shipepd");
        else  { //from here we know the weight is between 0 and 20
            if (packageWeight <= 1) 
            packagePrice = 3.5;
        else if (packageWeight <= 3)
            packagePrice = 5.5;
        else if (packageWeight <= 10)
            packagePrice = 8.5;
        else if (packageWeight <= 20)
            packagePrice = 10.5;
            
            System.out.println("Package price = "+ packagePrice);
      }
3.19
Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides of a triangle");
        float sideA = input.nextFloat();
        float sideB = input.nextFloat();
        float sideC = input.nextFloat();
        
        if (sideC + sideB > sideA && sideA + sideC > sideB && sideA + sideB > sideC) {
            float perimeter = sideA + sideB + sideC;
            System.out.println("the perimeter is " + perimeter);
        }
        else 
            System.out.println("Invalid triangle! One of the sides of the triangle is larger than the others.");
3.17

*/