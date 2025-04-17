
package pkg224110470_chapter6;
import java.util.Scanner;

public class PrimeNumberWithMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int userInput = input.nextInt();
        
        if (isPrimeNumber(userInput)) 
            System.out.println(userInput+" Is a prime number");
        else    
            System.out.println(userInput+" Is not a prime number");
    }
    
    public static boolean isPrimeNumber(int number) {       
        for (int j = 2; j <= number/2; j++) 
            {
                if(number%j == 0)
                {
                    return false;
                }
            }
        return true;
    }
    
}

/**
int counter = 0; //count the prime numbers (50)
        int number = 2; //the number to check whether it is prime
        int i = 2;
        
        while(counter<10000000)
        {
            //check whether number is prime
            boolean isPrime = true;
            for (int j = 2; j <= number/2; j++) 
            {
                if(number%j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime)
            {
                if(counter%10 == 0)
                    System.out.println();
                System.out.print(number+"\t");
                counter++;
            }
            number++;
        }
        System.out.println(); 
        **/